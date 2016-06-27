package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    private TextView mResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mResults = (TextView) findViewById(R.id.results);

        Intent showMadLibs = getIntent();
        String noun = showMadLibs.getStringExtra("noun");
        String adjective = showMadLibs.getStringExtra("adjective");
        String verb = showMadLibs.getStringExtra("verb");
        mResults.setText("I think you are " + adjective + " and I " + verb + " you a lot with " + noun + "!");

    }
}
