package com.street35.booked.NetworkServices;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rashi on 27-08-2016.
 */
public class LatLongViaEmail extends StringRequest {

    private static final String LatLong_url = "http://booked.unaux.com/BooksAndLocation.php";
    private Map<String, String > params;

    public LatLongViaEmail(String email , Response.Listener<String> listener){
        super(Request.Method.GET, LatLong_url , listener, null);
        params= new HashMap<>();
        params.put("email",email);


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String>  params = new HashMap<String, String>();
        params.put("Cookie","__test=44c3613f5fdf5542f710c31f6a68779a; expires=Thu, 31-Dec-37 23:55:55 GMT; path=/");

        return params;
    }
}
