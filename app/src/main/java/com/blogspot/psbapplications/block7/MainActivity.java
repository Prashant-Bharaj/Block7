package com.blogspot.psbapplications.block7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker possibilities;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilities = findViewById(R.id.number_picker);
        webView = findViewById(R.id.web_view);

        String[] possibilitiesString = {
                "Android",
                "Checklist text input field",
                "Github",
                "Supelec"
        };

        possibilities.setDisplayedValues(possibilitiesString);

        possibilities.setMaxValue(0);
        possibilities.setMaxValue(possibilitiesString.length - 1);


    }

    public void navigate(View view) {
        int choice = possibilities.getValue();
        webView.setWebViewClient(new WebViewClient());
        switch (choice){
            case 0: webView.loadUrl("file:///android_asset/android.html");
            break;
            case 1: webView.loadUrl("file:///android_asset/checklist.html");
            break;
            case 2: webView.loadUrl("https://www.github.com/Prashant-Bharaj");
            break;
            case 3: webView.loadUrl(("file:///android_asset/supelec.html"));
            break;
        }
    }
}