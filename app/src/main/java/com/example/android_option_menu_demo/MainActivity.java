package com.example.android_option_menu_demo;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        int id = item.getItemId();

        switch(id){
            case R.id.setting:
                Toast.makeText(this, "Settings option is chosen", Toast.LENGTH_LONG).show();
                return true;
            case R.id.profile:
                Toast.makeText(this,"Profile option is chosen", Toast.LENGTH_LONG).show();
                return true;
            case R.id.ShuffleList:
                Toast.makeText(this, "Shuffle List option is chosen", Toast.LENGTH_LONG).show();
                return true;
            case R.id.aboutUs:
                Toast.makeText(this, "AboutUS option is chosen", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Logout:
                Toast.makeText(this, "Logout option is chosen", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }


}