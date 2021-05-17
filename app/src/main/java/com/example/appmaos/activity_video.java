package com.example.appmaos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class activity_video extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video3);
//Vídeo local
//        VideoView videoView = findViewById(R.id.videoView);
//        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
//        Uri uri = Uri.parse(videoPath);
//        videoView.setVideoURI(uri);
//        MediaController mediaController = new MediaController(this);
//        videoView.setMediaController(mediaController);
//        mediaController.setAnchorView(videoView);

        //NowebView
        myWebView = (WebView) findViewById(R.id.webview);
//        WebViewClientImpl webViewClient = new WebViewClientImpl(this);
//        myWebView.setWebViewClient(webViewClient);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // aqui verifica que o estado está diferente de null.
        if (savedInstanceState != null){
            myWebView.restoreState(savedInstanceState);
        }else{
            myWebView.loadUrl("file:///android_res/raw/video1.html");
        }
//        myWebView.loadUrl("file:///android_res/raw/video1.html");

    setTitle(R.string.SobreVideoT);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        myWebView.saveState(outState);
    }
}