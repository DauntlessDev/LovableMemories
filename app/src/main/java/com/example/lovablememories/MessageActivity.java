package com.example.lovablememories;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Music.mediaPlayer.pause();
        mediaPlayer = MediaPlayer.create(this, R.raw.backgroundmusic);
        mediaPlayer.start();

        final TextView textView = findViewById(R.id.textView);

        textView.animate().alpha(1).setDuration(13000);
        new CountDownTimer(10000, 1000) {
            public void onFinish() {
                textView.animate().rotation(360*8).setDuration(1500);
            }
            public void onTick(long millisUntilFinished) {

            }
        }.start();

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                Toast.makeText(MessageActivity.this, "Thankyou for giving me "+String.valueOf(rating) + "!", Toast.LENGTH_SHORT).show();

            }
        });

    }


    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
        Music.mediaPlayer.start();

    }

}
