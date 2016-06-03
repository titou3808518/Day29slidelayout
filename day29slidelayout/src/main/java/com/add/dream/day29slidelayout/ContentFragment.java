package com.add.dream.day29slidelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by DELL on 2016/6/2.
 */
public class ContentFragment extends Fragment{

    private WebView webview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.content_layout,null);
        webview = (WebView) view.findViewById(R.id.webview);
        return view;
    }

    public void setWebview(String url){
        Log.d("ContentFragment", url);
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
        WebViewClient client = new WebViewClient();
        webview.setWebViewClient(client);
        webview.loadUrl(url);

    }
}
