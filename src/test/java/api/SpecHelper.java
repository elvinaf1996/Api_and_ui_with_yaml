package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecHelper {

    private static final String BASE_URI = "https://reqres.in/api/";

    public static RequestSpecification getRequestSpec() { //запрос
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }


    public static ResponseSpecification getResponseSpec(int httpStatus) { //ответ
        return new ResponseSpecBuilder()
                .expectStatusCode(httpStatus)
                .log(LogDetail.ALL)
                .build();
    }
}
