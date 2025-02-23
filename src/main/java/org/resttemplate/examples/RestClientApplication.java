package org.resttemplate.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication {

    public static void main (String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

    @Bean
    public RestClient restClient () {
        return RestClient.builder()
                .baseUrl("http://localhost:3000")
                .build();
    }

    @Bean
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }

}
