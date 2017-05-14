package com.example.mrityunjay.androidassignment944;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {//mainactivity
    Button button;// intializing

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);// button intialiging
        registerForContextMenu(btn);//register Context
    }

    @Override// onCreateContex
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        MenuInflater inflater = getMenuInflater();//inflator for getting
        inflater.inflate(R.menu.main_menu, menu);

    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {// menu select item
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Action 1 called", Toast.LENGTH_SHORT).show();//toast
                return true;
            case R.id.item2:
                Toast.makeText(this, "Action 2 called", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Action 3 called", Toast.LENGTH_SHORT).show();}
        return super.onOptionsItemSelected(item);
    }
}





