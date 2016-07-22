package com.example.qqq.applythemes;

import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        // Check users device version.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Snackbar.make(relativeLayout, "Lollipop or above", Snackbar.LENGTH_LONG).show();
        } else {
            Snackbar.make(relativeLayout, "Pre-Lollipop", Snackbar.LENGTH_LONG).show();
        }
    }
}
