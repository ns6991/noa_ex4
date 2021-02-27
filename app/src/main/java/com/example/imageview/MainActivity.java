package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clicked(View view) {
        Button button = (Button) findViewById(R.id.button);
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(0);

        Random rand = new Random();
        int ran =  1+rand.nextInt(3);
        button.setText(""+ran);
        if(ran==1) image.setImageResource(R.drawable.one);
        else if(ran==2) image.setImageResource(R.drawable.two);
        else image.setImageResource(R.drawable.three);


    }
}