package com.example.b04addingatoolbar;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("welcome");
        toolbar.setSubtitle("Folks!");

        toolbar.setLogo(R.drawable.good_day);
        toolbar.setNavigationIcon(R.drawable.navigation_back);

        //we dont need this code below
      /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
           toolbar.setElevation(10f);
        }*/

        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String msg = "";

        switch (item.getItemId()) {

            case R.id.discard:
                msg = getString(R.string.delete);
                break;

            case R.id.search:
                msg = getString(R.string.search);
                break;

            case R.id.edit:
                msg = getString(R.string.edit);
                break;

            case R.id.settings:
                msg = getString(R.string.settings);
                break;

            case R.id.Exit:
                msg = getString(R.string.exit);
                break;
        }

        Toast.makeText(this, msg + " clicked !", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
