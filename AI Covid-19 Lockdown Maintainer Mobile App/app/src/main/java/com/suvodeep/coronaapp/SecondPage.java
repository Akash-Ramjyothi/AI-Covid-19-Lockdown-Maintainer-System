package com.suvodeep.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SecondPage extends AppCompatActivity {

    WebView ourBrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        ourBrow=(WebView) findViewById(R.id.webview);
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.loadUrl("http://covid19-lockdown.netlify.app/cameraaccess");
    }
}
