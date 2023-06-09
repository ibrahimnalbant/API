package base_urls;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utils.AuthenticationHerOkuApp.generateToken;

public class HerOkuAppBaseUrl {

    protected RequestSpecification spec;

    @Before
    public void setUp() {
        spec = new RequestSpecBuilder()
                .addHeader("Cookie","token="+generateToken())
                .setContentType(ContentType.JSON).setBaseUri("https://restful-booker.herokuapp.com")
                .build();
    }

}


/*

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerOkuAppBaseUrl {

    protected RequestSpecification spec;

    @Before
    public void setUp() {
        spec = new RequestSpecBuilder().addHeader("Cookie","token=8c24a829b1fa015").setContentType(ContentType.JSON).setBaseUri("https://restful-booker.herokuapp.com").build();
    }

}
*/
/*

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerOkuAppBaseUrl {

    protected RequestSpecification spec;

    @Before
    public void setUp() {
        spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com/").build();
    }

}
*/

/*
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerOkuAppBaseUrl {
    //setUp() methodu ile request işleminde tekrarlı şekilde yapılacak işlemler burada bir kez yapılacak.
        // @Test öncesi çalışması için @Before anatasyonu ekliyoruz.

    protected RequestSpecification spec;

    @Before//Her @Test methodu öncesei çalışır
    public void setUp() {
        spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").setAccept(ContentType.JSON).build();
    }

}
*/

/*
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {
    //setUp() methodu ile request işleminde tekrarlı şekilde yapılacak işlemler burada bir kez yapılacak.
        // @Test öncesi çalışması için @Before anatasyonu ekliyoruz.

    protected RequestSpecification spec;

    @Before//Her @Test methodu öncesei çalışır
    public void setUp() {
        spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/").build();
    }
}

 */
