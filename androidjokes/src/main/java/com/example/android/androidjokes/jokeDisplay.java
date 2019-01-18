package com.example.android.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class jokeDisplay extends AppCompatActivity {
    public static final String INTENT_JOKE = "JOKE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokedisplay_activity);
        getSupportActionBar().setTitle("JOKES");
        TextView mjokeTextView = (TextView) findViewById(R.id.jokertext);
        if (getIntent() != null) {
            String joke = getIntent().getStringExtra(INTENT_JOKE);
            if (joke != null) {
                mjokeTextView.setText(joke);

            } else {
                //Toast.makeText(getApplicationContext(), "GCE error", Toast.LENGTH_SHORT).show();
                TextView textPlaceHold = (TextView) findViewById(R.id.jokerplacehold);
                mjokeTextView.setVisibility(View.GONE);
                textPlaceHold.setVisibility(View.VISIBLE);


            }
        }else{
            Toast.makeText(getApplicationContext(), R.string.place_hold_words, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}
