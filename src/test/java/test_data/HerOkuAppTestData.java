package test_data;

import java.util.HashMap;
import java.util.Map;

public class HerOkuAppTestData {

    public Map<String, String> bookingdatesMapMethod(String checkin, String checkout) {

        Map<String, String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin", checkin);
        bookingdatesMap.put("checkout", checkout);

        return bookingdatesMap;
    }

    public Map<String, Object> expectedDataMapMethod(String firstname, String lastname, Integer totalprice, Boolean depositpaid, Map<String, String> bookingdatesMap, String additionalneeds) {

        Map<String, Object> expectedData = new HashMap<>();

        if (firstname!=null){
            expectedData.put("firstname", firstname);
        }

        if (lastname!=null){
            expectedData.put("lastname", lastname);
        }

        if (totalprice!=null){
            expectedData.put("totalprice", totalprice);
        }

        if(depositpaid!=null){
            expectedData.put("depositpaid", depositpaid);
        }

        if(bookingdatesMap!=null){
            expectedData.put("bookingdates", bookingdatesMap);
        }

        if (additionalneeds != null) {
            expectedData.put("additionalneeds", additionalneeds);
        }

        return expectedData;
    }

}

/*
import java.util.HashMap;
import java.util.Map;

public class HerOkuAppTestData {

    public Map<String, String> bookingdatesMapMethod(String checkin, String checkout) {

        Map<String, String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin", checkin);
        bookingdatesMap.put("checkout", checkout);

        return bookingdatesMap;
    }

    public Map<String, Object> expectedDataMapMethod(String firstname, String lastname, int totalprice, boolean depositpaid, Map<String, String> bookingdatesMap, String additionalneeds) {

        Map<String, Object> expectedData = new HashMap<>();

        expectedData.put("firstname", firstname);
        expectedData.put("lastname", lastname);
        expectedData.put("totalprice", totalprice);
        expectedData.put("depositpaid", depositpaid);
        expectedData.put("bookingdates", bookingdatesMap);

        if (additionalneeds != null) {
            expectedData.put("additionalneeds", additionalneeds);
        }

        return expectedData;
    }

}
*/

/*
import java.util.HashMap;
import java.util.Map;

public class HerOkuAppTestData {

    public Map<String, String> bookingdatesMapMethod(String checkin, String checkout){

        Map<String, String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin",checkin);
        bookingdatesMap.put("checkout",checkout );

        return bookingdatesMap;
    }

    public Map<String, Object> expectedDataMapMethod(String firstname, String lastname,
                                                     int totalprice, boolean depositpaid, Map<String, String> bookingdatesMap, String additionalneeds){

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("firstname", firstname);
        expectedData.put("lastname", lastname);
        expectedData.put("totalprice", totalprice);
        expectedData.put("depositpaid", depositpaid);
        expectedData.put("bookingdates", bookingdatesMap);
        expectedData.put("additionalneeds", additionalneeds);


        return expectedData;
    }
}

 */