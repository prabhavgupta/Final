package com.street35.booked.NetworkServices;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rashi on 31-10-2016.
 */

public class MyBooksViaEmail extends StringRequest {

    private static final String Roll_url = "http://booked.unaux.com/mybooks.php?email=";
    private Map<String, String > params;

    public MyBooksViaEmail(String email , Response.Listener<String> listener){
        super(Request.Method.GET, Roll_url+email , listener, null);

      /*  params= new HashMap<>();
        params.put("email",email);

*/
    }
/*

    @Override
    public Map<String, String> getParams() {
        return params;
    }
*/
@Override
public Map<String, String> getHeaders() throws AuthFailureError {
    Map<String, String>  params = new HashMap<String, String>();
    params.put("Cookie","__test=44c3613f5fdf5542f710c31f6a68779a; expires=Thu, 31-Dec-37 23:55:55 GMT; path=/");

    return params;
}
}
