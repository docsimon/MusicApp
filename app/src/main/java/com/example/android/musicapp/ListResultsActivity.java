package com.example.android.musicapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.android.musicapp.databinding.ActivityListResultsBinding;

import static com.example.android.musicapp.R.id.searchField;


public class ListResultsActivity extends AppCompatActivity {

    ActivityListResultsBinding myBinding;
    TextView musicTitleTextView;
    TextView musicTitleTextView2;
    TextView musicTitleTextView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBinding = DataBindingUtil.setContentView(this, R.layout.activity_list_results);

        String s = getIntent().getStringExtra("Result Title");


        TextView mainTitle = myBinding.searchMainTitle;
        String cippa =  getResources().getString(R.string.main_title_search, s);

        mainTitle.setText(cippa);

        musicTitleTextView = myBinding.resultTitleOne;
        musicTitleTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}

                // get the reference and content of the edit
                String query = musicTitleTextView.getText().toString();

                    // define the intent
                    Intent musicDetailIntent = new Intent(ListResultsActivity.this, MusicDetailActivity.class);
                    // passing the search query to the intent
                    musicDetailIntent.putExtra("Music Title", query);
                    // Start the new activity
                    startActivity(musicDetailIntent);

            }
        });

        musicTitleTextView2 = myBinding.resultTitleTwo;
        musicTitleTextView2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}

                // get the reference and content of the edit
                String query = musicTitleTextView2.getText().toString();

                // define the intent
                Intent musicDetailIntent = new Intent(ListResultsActivity.this, MusicDetailActivity.class);
                // passing the search query to the intent
                musicDetailIntent.putExtra("Music Title", query);
                // Start the new activity
                startActivity(musicDetailIntent);

            }
        });

        musicTitleTextView3 = myBinding.resultTitleThree;
        musicTitleTextView3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}

                // get the reference and content of the edit
                String query = musicTitleTextView3.getText().toString();

                // define the intent
                Intent musicDetailIntent = new Intent(ListResultsActivity.this, MusicDetailActivity.class);
                // passing the search query to the intent
                musicDetailIntent.putExtra("Music Title", query);
                // Start the new activity
                startActivity(musicDetailIntent);

            }
        });

    }
}
