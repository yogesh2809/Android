package com.example.yogesh.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;

public class MainActivity extends Activity {

    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText)findViewById(R.id.etName);
        et2= (EditText)findViewById(R.id.etPass);
    }

    public void showtoast(View v)
    {


       // if(et2.equals("security"))
        if(et1.getText().toString().equals("security") && et2.getText().toString().equals("security"))
        {
            String name = et1.getText().toString();
            Toast.makeText(this,name, Toast.LENGTH_LONG).show();
        }
        else
        {
           // String name = et1.getText().toString();
            Toast.makeText(this,"Wrong password", Toast.LENGTH_LONG).show();
        }
        //String name = et1.getText().toString();
        //Toast.makeText(this,name, Toast.LENGTH_LONG).show();
    }
}
