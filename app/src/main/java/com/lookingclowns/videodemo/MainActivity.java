package com.lookingclowns.videodemo;

import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = findViewById(R.id.videoView);
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo);
        video.start();
    }
}