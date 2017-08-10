package com.example.android.musicapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.android.musicapp.databinding.ActivityListResultsBinding;


public class ListResultsActivity extends AppCompatActivity {

    ActivityListResultsBinding myBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBinding = DataBindingUtil.setContentView(this, R.layout.activity_list_results);

        String s = getIntent().getStringExtra("Result Title");


        TextView mainTitle = myBinding.searchMainTitle;
        String cippa =  getResources().getString(R.string.main_title_search, s);

        mainTitle.setText(cippa);


    }
}
