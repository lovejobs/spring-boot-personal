package com.lovejobs.springbootfeigntest.service;
import com.lovejobs.springbootfeigntest.AuthTokenRequest;
import com.lovejobs.springbootfeigntest.AuthTokenResponse;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;


@FeignClient(url = "https://sentry.ushareit.me/dex", name = "AuthTokenService",configuration = AuthTokenService.Configuration.class)
public interface AuthTokenService {

    @PostMapping(value="/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    AuthTokenResponse getAuthToken(@RequestBody AuthTokenRequest authTokenRequest);

    @PostMapping(value="/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    AuthTokenResponse getAuthTokenV2(@RequestBody String s);

    class Configuration {
        @Bean
        Encoder feignFormEncoder(ObjectFactory<HttpMessageConverters> converters) {
            return new SpringFormEncoder(new SpringEncoder(converters));
        }
    }
}
