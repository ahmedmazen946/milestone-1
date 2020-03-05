package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
                button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
                button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
                button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
                button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                openActivity3()

            }
        });
    }
    public void openActivity3(){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);


    }
}
