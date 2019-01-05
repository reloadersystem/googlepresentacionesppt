package apptablet.sacooliveros.edu.pe.webviewppt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String Urldata= "http://app8.sacooliveros.edu.pe/APP/1/TABLET%20SELECCI%c3%93N%20%202019.pptx";
        String Urldata= "http://docs.google.com/gview?embedded=true&url=http://app8.sacooliveros.edu.pe/APP/1/tabletseleccion2019.pptx";


//        webview = (WebView) findViewById(R.id.webview);
//
//
//
//
//        webview.loadUrl(Urldata);








        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl(Urldata);


        //#clase imprimir

    }
}
