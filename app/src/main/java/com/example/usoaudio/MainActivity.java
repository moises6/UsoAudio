package com.example.usoaudio;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageButton ActivityEspanol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   ActivityEspanol = findViewById(R.id.btnEspanol);

    ActivityEspanol.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,espanol.class);
            startActivity(intent);
        }
    });

    }

    public void ingles1(View view) {

        MediaPlayer m1 = MediaPlayer.create(this, R.raw.one);
        m1.start();
    }
    public void ingles2(View view) {
        MediaPlayer m2 = MediaPlayer.create(this, R.raw.two);
        m2.start();
    }
    public void ingles3(View view) {
        MediaPlayer m3 = MediaPlayer.create(this, R.raw.three);
        m3.start();
    }
    public void ingles4(View view) {
        MediaPlayer m4 = MediaPlayer.create(this, R.raw.four);
        m4.start();
    }
    public void ingles5(View view){

        MediaPlayer m5 = MediaPlayer.create(this, R.raw.five);
        m5.start();
    }
    public void ingles6 (View view){
        MediaPlayer m6 = MediaPlayer.create(this, R.raw.six);
        m6.start();
    }
    public void ingles7 (View view){
        MediaPlayer m7 = MediaPlayer.create(this,R.raw.seven);
        m7.start();
    }
    public void ingles8 (View view){
        MediaPlayer m8 = MediaPlayer.create(this, R.raw.eight);
        m8.start();
    }
    public void ingles9 (View view){
        MediaPlayer m9 = MediaPlayer.create(this, R.raw.nine);
        m9.start();
    }
    public void ingles10 (View view){
        MediaPlayer m10 = MediaPlayer.create(this,R.raw.ten);
        m10.start();
    }
}