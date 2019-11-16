package com.example.rutine2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
         progressBar=findViewById(R.id.progressbarId);
         Thread thread=new Thread(new Runnable() {
             @Override
             public void run() {
                 dowork();
                 Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                 startActivity(intent);
                 finish();

             }
         });
         thread.start();

    }

    private void dowork() {
        for(i=20;i<=100;i=i+20){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
