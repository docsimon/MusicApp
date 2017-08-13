package com.example.android.musicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.musicapp.databinding.ActivityMusicDetailBinding;

public class MusicDetailActivity extends AppCompatActivity {

    ActivityMusicDetailBinding myBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBinding = DataBindingUtil.setContentView(this, R.layout.activity_music_detail);
        String s = getIntent().getStringExtra("Music Title");
        TextView mainTitle = myBinding.musicMainTitle;
        mainTitle.setText(s);

        Button buyButton = myBinding.buyButton;
        buyButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent paymentIntent = new Intent(MusicDetailActivity.this, PaymentPageActivity.class);
                startActivity(paymentIntent);

            }
        });
    }
}
