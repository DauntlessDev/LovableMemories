package com.example.lovablememories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    final int passcode[]={0,2,1,4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Music.mediaPlayer = MediaPlayer.create(this, R.raw.mainbackgroundmusic);
        Music.mediaPlayer.start();

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView input1 = findViewById(R.id.editText1);
                TextView input2 = findViewById(R.id.editText2);
                TextView input3 = findViewById(R.id.editText3);
                TextView input4 = findViewById(R.id.editText4);



                try {
                    if (Integer.parseInt(input1.getText().toString()) == (passcode[0]) &&
                            Integer.parseInt(input2.getText().toString()) == (passcode[1]) &&
                            Integer.parseInt(input3.getText().toString()) == (passcode[2]) &&
                            Integer.parseInt(input4.getText().toString()) == (passcode[3])) {


                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(LoginActivity.this, "Login Successful, Welcome!", Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(LoginActivity.this, "Wrong passcode, please try again.", Toast.LENGTH_SHORT).show();

                    }
                }catch (Exception e){
                    Toast.makeText(LoginActivity.this, "Error: Please put complete valid passcode.", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


}
