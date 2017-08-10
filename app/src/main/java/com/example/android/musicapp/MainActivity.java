package com.example.android.musicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.musicapp.databinding.ActivityMainBinding;

import static android.R.attr.button;
import static android.R.id.message;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding myBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        Button searcButton = myBinding.searchButton;
        searcButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent searchResultIntent = new Intent(MainActivity.this, ListResultsActivity.class);

                // Start the new activity
                startActivity(searchResultIntent);
            }
        });

    }
}
