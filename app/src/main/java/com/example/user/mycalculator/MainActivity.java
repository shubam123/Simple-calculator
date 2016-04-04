package com.example.user.mycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button plus,minus,mul,div;
    private TextView result;
    private EditText firstnum,secondnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        init();
    }

    private void init()
    {
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        firstnum = (EditText)findViewById(R.id.firstnum);
        secondnum = (EditText)findViewById(R.id.secondnum);
        result = (TextView) findViewById(R.id.result);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        String num1 = firstnum.getText().toString();
        String num2 = secondnum.getText().toString();
        switch(view.getId()){
            case R.id.plus:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.minus:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.mul:
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(multiply));
                break;
            case R.id.div:
                try{
                    int divide = Integer.parseInt(num1) / Integer.parseInt(num2);
                    result.setText(String.valueOf(divide));
                }
                catch (Exception e){
                    result.setText("Cannot divide");

                }
                break;
        }
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








}
