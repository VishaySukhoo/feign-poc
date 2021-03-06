package com.example.feignclientexample.exception;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

@Component
public class AppFeignErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 500) {
            throw new ProductNotFoundException("Product Not Found");
        }

        return defaultErrorDecoder.decode(methodKey, response);
    }

}