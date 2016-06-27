package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GameActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mPlayButton;
    private EditText mNoun;
    private EditText mAdjective;
    private EditText mVerb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mNoun = (EditText) findViewById(R.id.noun);
        mAdjective = (EditText) findViewById(R.id.adjective);
        mVerb = (EditText) findViewById(R.id.verb);
        mPlayButton = (Button) findViewById(R.id.playButton);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun = mNoun.getText().toString();
                String adjective = mAdjective.getText().toString();
                String verb = mVerb.getText().toString();
                Log.d(TAG, noun);
                Log.d(TAG, adjective);
                Log.d(TAG, verb);
                Intent goToResultPage = new Intent(GameActivity.this, ResultsActivity.class);
                goToResultPage.putExtra("noun", noun);
                goToResultPage.putExtra("adjective", adjective);
                goToResultPage.putExtra("verb", verb);
                startActivity(goToResultPage);

            }
        });
    }
}
