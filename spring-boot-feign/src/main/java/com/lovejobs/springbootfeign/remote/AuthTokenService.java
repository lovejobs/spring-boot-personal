package com.lovejobs.springbootfeign.remote;


import com.lovejobs.springbootfeign.model.AuthTokenRequest;
import com.lovejobs.springbootfeign.model.AuthTokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//configuration = AuthTokenService.Configuration.class
@FeignClient(url = "https://sentry.ushareit.me/dex", name = "AuthTokenService")
public interface AuthTokenService {


    @PostMapping(value="/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    AuthTokenResponse getAuthToken(@RequestBody AuthTokenRequest authTokenRequest);

    @PostMapping(value="/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    AuthTokenResponse getAuthTokenV2(@RequestBody String s);

//    class Configuration {
//        @Bean
//        Encoder feignFormEncoder(ObjectFactory<HttpMessageConverters> converters) {
//            return new SpringFormEncoder(new SpringEncoder(converters));
//        }
//    }
}
