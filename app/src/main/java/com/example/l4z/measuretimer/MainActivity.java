package com.example.l4z.measuretimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));
        items.add(new Item(R.drawable.material_icon));

        Adapter adapter = new Adapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;
            case R.id.action_add:
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }
}
