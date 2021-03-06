package com.example.nastala.eventguide;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nastala on 20.05.2017.
 */

public class AdminUpdateEventRequest extends StringRequest {
    private static final String REQUEST_URL = "https://substitutive-sailor.000webhostapp.com/AdminEventUpdate.php";
    private Map<String, String> params;

    public AdminUpdateEventRequest(int event_id, String title, String detail, String date, String city, String type, String encodedImage,
                                   Response.Listener<String> listener){
        super(Method.POST, REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("event_id", event_id + "");
        params.put("title", title);
        params.put("detail", detail);
        params.put("date", date);
        params.put("city", city);
        params.put("type", type);
        params.put("encodedImage", encodedImage);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
