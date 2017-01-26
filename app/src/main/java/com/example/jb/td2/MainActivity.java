package com.example.jb.td2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);
        Button b_next = (Button)findViewById(R.id.next);
        b_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View layout_relative) {
                Intent intent = new Intent(MainActivity.this, NumberPickerActivity.class);  //Lancer l'activité DisplayVue
                startActivity(intent);    //Afficher la vue

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        //restoreActionBar();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle("Mon Super Menu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_settings:
        //faites un toast !
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
