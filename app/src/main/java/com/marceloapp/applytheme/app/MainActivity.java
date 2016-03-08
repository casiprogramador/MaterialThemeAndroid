package com.marceloapp.applytheme.app;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.marceloapp.applytheme.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Welcome");
        toolbar.setSubtitle("Folk");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
//            toolbar.setElevation(10f);
        }else{

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String msg ="";
        switch (item.getItemId()){
            case R.id.discard:
                msg = "Delete";
                break;
            case R.id.edit:
                msg = "Edit";
                break;
            case R.id.search:
                msg = "Search";
                break;
            case R.id.setting:
                msg = "Setting";
                break;
            case R.id.exit:
                msg = "Exit";
                break;
        }

        Toast.makeText(this, msg + " clicked",Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
