package com.example.nastala.eventguide;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nastala on 23.12.2016.
 */

public class CheckParticipateRequest extends StringRequest {
    private static final String REQUEST_URL = "https://substitutive-sailor.000webhostapp.com/CheckParticipant.php";
    private Map<String, String> params;

    public CheckParticipateRequest(String username, int event_id, Response.Listener<String> listener){
        super(Method.POST, REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("a_username", username);
        params.put("event_id", event_id + "");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
