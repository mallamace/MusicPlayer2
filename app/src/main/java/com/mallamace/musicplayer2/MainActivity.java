package com.mallamace.musicplayer2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public static final int MEDIA_RES_ID = R.raw.classical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, MEDIA_RES_ID);


        Button btnPlay = findViewById(R.id.butPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //mediaPlayer.start();

                Toast.makeText(MainActivity.this, "PLAY", Toast.LENGTH_SHORT).show();

            }
        });


        Button btnPause = findViewById(R.id.butPause);
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "PAUSE", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
