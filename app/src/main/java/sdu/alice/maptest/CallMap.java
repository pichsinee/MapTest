package sdu.alice.maptest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);


    }   //Main Class

    public void runMyMethod(View view){

        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);
        EditText place = (EditText) findViewById(R.id.mapLabel);
        String lat = latitude.getText().toString().trim();
        String lng = longtitude.getText().toString().trim();
        String label = place.getText().toString().trim();
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:"+ lat + "," + lng + " (" + label + ")");
        //String geoUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + mTitle + ")");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        mapIntent.setPackage("com.google.android.apps.maps");   //if use GenyMotion , not use
        startActivity(mapIntent);
    }

}   //Main Method
