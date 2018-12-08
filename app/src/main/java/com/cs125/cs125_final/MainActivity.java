package com.cs125.cs125_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static int temp;
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "Lab12:Main";

    /** Request queue for our network requests. */
    private static RequestQueue requestQueue;

    public Button mainGenOutfit, mainAddNewPiece, mainGenButton;
    //public String status = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //status = "main";
        mainGenOutfit = findViewById(R.id.mainGenOutfit);
        mainAddNewPiece = findViewById(R.id.mainAddNewPiece);
        mainGenButton = findViewById(R.id.mainGenButton);

        mainGenOutfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setContentView(R.layout.create_outfit);
                //status = "createOutfit";
                //Log.e("status is", "createOutfit");
                //initButton1();
                Intent intent = new Intent(MainActivity.this,
                        CreateOutfit.class);
                startActivity(intent);
            }
        });


        mainAddNewPiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.new_piece);
                Intent intent = new Intent(MainActivity.this,
                        NewPiece.class);
                startActivity(intent);
            }
        });

        mainGenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        OutfitWeather.class);
                startActivity(intent);
            }
        });





        requestQueue = Volley.newRequestQueue(this);

        Log.e("WE OUT HERE BOIS", "AYLMAOOOOOOOOO");
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                "https://www.metaweather.com/api/location/2379574/",
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(final JSONObject response) {
                        Log.e("we are ", "here");
                        try {
                            JSONArray ja = response.getJSONArray("consolidated_weather");
                            JSONObject todaysData = ja.getJSONObject(0);
                            temp = todaysData.getInt("the_temp");
                            temp = 9/5 * temp + 32;
                            TextView tw = findViewById(R.id.weatherDisplay);
                            tw.setText(String.valueOf(temp) + "°F");
                            Log.e("The temp", String.valueOf(temp) + "°F");
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.e("ERRRRORRRRRRRRRR BOIS", "AYLMAO");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.w(TAG, error.toString());
            }
        });

        requestQueue.add(jsonObjectRequest);

        /*
        {
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("Ocp-Apim-Subscription-Key", "YOUR_API_KEY");
                Log.d(TAG, params.toString());
                return params;
            }
        };
        */

    }

    private void initButton1(){

    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
    }
}
