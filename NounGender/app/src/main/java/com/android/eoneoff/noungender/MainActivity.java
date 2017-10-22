package com.android.eoneoff.noungender;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton maleRadil;
    private RadioButton femaleRadio;
    private  RadioButton neutralRadio;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton maleRadil = (RadioButton)findViewById(R.id.maleRadio);
        RadioButton femaleRadio = (RadioButton)findViewById(R.id.femaleRadio);
        RadioButton neutralRadio = (RadioButton)findViewById(R.id.neutralRadio);
        TextView resultView = (TextView)findViewById(R.id.resultView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    public void onClick(View view)
    {
        int idSelected = view.getId();
        String gender;
        switch (idSelected)
        {
            case(R.id.maleRadio):
                gender = "мужского";
                break;
            case(R.id.femaleRadio):
                gender = "женского";
                break;
            case (R.id.neutralRadio):
                gender="";
                break;
            default:
                gender = "непонятного";
                break;
        }

        //resultView.setText("Это существительное"+gender+"рода");
    }
}
