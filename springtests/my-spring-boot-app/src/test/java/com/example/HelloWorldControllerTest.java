package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = MySpringBootAppApplication.class)
public class HelloWorldControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void helloEndpointShouldReturnDefaultMessage() throws Exception {
        var responseEntity = this.restTemplate.getForEntity("/hello", String.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo("Hello, Spring Boot!");
    }
}

