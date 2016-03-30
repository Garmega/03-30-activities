package com.garmega.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button theButton = (Button)findViewById(R.id.my_button);

        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "The children will be proud");
            }
        });

        Log.d(TAG, "onCreate() calls");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop() called");
    }
}
