package com.yangsx95.onlinetaxi.jupiter.web.result;

import com.yangsx95.onlinetaxi.jupiter.annotation.NoPackage;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;
import java.util.Optional;

import static com.yangsx95.onlinetaxi.jupiter.contstants.InnerHttpHeader.SERVICE_TYPE;
import static com.yangsx95.onlinetaxi.jupiter.contstants.InnerHttpHeader.SERVICE_TYPE_INNER_SERVICE;

/**
 * 该响应体处理将会给所有的controller接口返回包装一层Result返回
 * 除非该接口标记了 NoPackage 注解
 *
 * @author 杨顺翔
 * @see NoPackage
 * @see Result
 * @since 2022/07/30
 */
@ConditionalOnWebApplication
@RestControllerAdvice(annotations = {RestController.class})
public class ResultPackageHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType,
                            @NonNull Class<? extends HttpMessageConverter<?>> converterType) {
        return !returnType.getDeclaringClass().isAnnotationPresent(NoPackage.class)
                && !returnType.hasMethodAnnotation(NoPackage.class);
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                  @NonNull MethodParameter methodParameter,
                                  @NonNull MediaType mediaType,
                                  @NonNull Class<? extends HttpMessageConverter<?>> converterType,
                                  @NonNull ServerHttpRequest request,
                                  @NonNull ServerHttpResponse response) {
        if (body instanceof Result) {
            return body;
        }
        String serviceType = Optional.ofNullable(request.getHeaders().get(SERVICE_TYPE))
                .filter(st -> st.size() > 0)
                .map(st -> st.get(0))
                .orElse(null);
        if (Objects.equals(serviceType, SERVICE_TYPE_INNER_SERVICE)) {
            return body;
        }
        return Result.success(body);
    }
}
