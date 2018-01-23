package com.fluffy.samrith.tool_sqliteassethelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Cinema> cinemas;
    Database db;
    TextView text ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
        initData();
    }

    public void initData(){
        cinemas = new ArrayList<>();
        cinemas = db.getData(this).getData();
        String test ="";
        for(Cinema c : cinemas){
            test+=c.toString();
        }

        text.setText(test);


    }

    /*
    *  How to use SqliteAssetHelper
    *
    *  - add gradle compile 'com.readystatesoftware.sqliteasset:sqliteassethelper:+'
    *  - create a model class
    *  - copy the existed database to src/main/assets/database folder
    *  - create a Database class (singleton) and name the database correctly
    *  - call the db.getData(); in the activity
    *  - Done !
    * */
}
