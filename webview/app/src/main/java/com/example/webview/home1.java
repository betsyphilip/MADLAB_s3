package com.example.webview;

import static com.example.webview.R.id.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class home1 extends AppCompatActivity {

    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
        w=(WebView) findViewById(R.id.web);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("https://www.google.com/");

        WebSettings webSettings=w.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}