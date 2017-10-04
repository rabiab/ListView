package com.example.hp.listview;

import android.media.session.PlaybackState;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.ListView;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mlist;
        mlist= (ListView) findViewById(R.id.listView);
        CustomAdapter cust=new CustomAdapter(this);
        mlist.setAdapter(cust);



    }


}
