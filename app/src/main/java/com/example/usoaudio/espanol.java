package com.example.usoaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class espanol extends AppCompatActivity {
    ImageButton bntingles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espanol);

bntingles = findViewById(R.id.bntingles);

bntingles.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(espanol.this,MainActivity.class );
        startActivity(intent);
    }
});
    }


    public void espanol1(View view) {

        MediaPlayer m1 = MediaPlayer.create(this, R.raw.uno);
        m1.start();
    }
    public void espanol2(View view) {
        MediaPlayer m2 = MediaPlayer.create(this, R.raw.dos);
        m2.start();
    }
    public void espanol3(View view) {
        MediaPlayer m3 = MediaPlayer.create(this, R.raw.tres);
        m3.start();
    }
    public void espanol4(View view) {
        MediaPlayer m4 = MediaPlayer.create(this, R.raw.cuatro);
        m4.start();
    }
    public void espanol5(View view){

        MediaPlayer m5 = MediaPlayer.create(this, R.raw.cinco);
        m5.start();
    }
    public void espanol6 (View view){
        MediaPlayer m6 = MediaPlayer.create(this, R.raw.seis);
        m6.start();
    }
    public void espanol7 (View view){
        MediaPlayer m7 = MediaPlayer.create(this,R.raw.siete);
        m7.start();
    }
    public void espanol8 (View view){
        MediaPlayer m8 = MediaPlayer.create(this, R.raw.ocho);
        m8.start();
    }
    public void espanol9 (View view){
        MediaPlayer m9 = MediaPlayer.create(this, R.raw.nueve);
        m9.start();
    }
    public void espanol10 (View view){
        MediaPlayer m10 = MediaPlayer.create(this,R.raw.diez);
        m10.start();
    }
}