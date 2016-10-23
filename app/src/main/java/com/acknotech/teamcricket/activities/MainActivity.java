package com.acknotech.teamcricket.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.acknotech.teamcricket.R;
import com.acknotech.teamcricket.db.DBHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    SQLiteDatabase mydatabase = openOrCreateDatabase("your database name",MODE_PRIVATE,null);
    DBHelper mydb;
    private Spinner obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydb = new DBHelper(this);
        ArrayList array_list = mydb.getAllPlayers();
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, array_list);
        obj = (Spinner) findViewById(R.id.players);
        obj.setAdapter(arrayAdapter);
    }
}
