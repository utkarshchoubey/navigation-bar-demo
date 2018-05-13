package com.example.utkarsh.local;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class orderPizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_pizza);
    }
    public void click(){
        Intent intent1=new Intent(orderPizza.this,menuItems.class);
        startActivity(intent1);
    }
}
