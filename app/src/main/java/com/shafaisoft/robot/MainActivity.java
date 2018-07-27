package com.shafaisoft.robot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);


    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView image = (ImageView)findViewById(R.id.robot);
            TranslateAnimation animation = new TranslateAnimation(0.0f,400.0f,0.0f,400.0f);
            animation.setDuration(4000);
            animation.setRepeatCount(10);
            animation.setRepeatMode(2);
            image.startAnimation(animation);
        }
    });
    }
}
