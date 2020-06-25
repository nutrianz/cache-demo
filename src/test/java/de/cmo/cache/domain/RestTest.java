package de.cmo.cache.domain;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

//@WebMvcTest
// https://stackoverflow.com/questions/46343782/whats-the-difference-between-autoconfigurewebmvc-and-autoconfiguremockmvc
// https://github.com/spring-projects/spring-boot/blob/master/spring-boot-project/spring-boot-test-autoconfigure/src/main/resources/META-INF/spring.factories
// --> Includes both the @AutoConfigureWebMvc and the @AutoConfigureMockMvc,
// among other functionality.
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void restTest() throws Exception {
        RestAssuredMockMvc.mockMvc(mockMvc);

//        mockMvc.perform(get("/geschlechter/search/findByCode?code=w"))
//                .andExpect(status().isOk());

        given()
                .when()
                .get("/geschlechter/search/findByCode?code=w")
                .then()
                .statusCode(200);
    }
}
