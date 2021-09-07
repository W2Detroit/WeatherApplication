package com.hfad.weatherapplication;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private final String url = "http://api.openweathermap.org/data/2.5/forecast?id=524901&appid=ac2862a2ad769bc608885cf9a31b072c";
    private final String appid = "ac2862a2ad769bc608885cf9a31b072c";
    private final String url1 = "http://api.openweathermap.org/data/2.5/weather?q=" + s + "&appid={API key}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
