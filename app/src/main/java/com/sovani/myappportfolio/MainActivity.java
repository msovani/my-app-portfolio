package com.sovani.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStreamer = (Button) findViewById(R.id.button_streamer);
        Button buttonFootballscore = (Button) findViewById(R.id.button_football_score);
        Button buttonLibrary = (Button) findViewById(R.id.button_library);
        Button buttonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        Button buttonXyzReader = (Button) findViewById(R.id.button_xyz_reader);
        Button buttonCapstone = (Button) findViewById(R.id.button_capstone);

        buttonStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my streamer app");
            }
        });

        buttonFootballscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Football Scores app");
            }
        });

        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Library app");
            }
        });

        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Build it bigger app");
            }
        });

        buttonXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my XYZ Reader app");
            }
        });

        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Capstone app");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void showToast(CharSequence text )
    {
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
