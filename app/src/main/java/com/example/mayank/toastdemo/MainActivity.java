package com.example.mayank.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        //TextView editText = (TextView) findViewById(R.id.editText);

        //Log.i("info", "Button pressed!");

        //Log.i("Name", textView.getText().toString());

        //Log.i("Second name", editText.getText().toString());

        Toast.makeText(this, " Hello " + editText.getText().toString(), Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
