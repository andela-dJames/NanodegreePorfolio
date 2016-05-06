package com.danieljames.nanodegreeporfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToPopularMovies(View view) {
        Toast.makeText(getApplicationContext(), getString(R.string.popular_movies_message), Toast.LENGTH_LONG).show();
    }

    public void goToStockHawk(View view) {
        Toast.makeText(getApplicationContext(), getString(R.string.stock_hawk_message), Toast.LENGTH_LONG).show();
    }

    public void goToCapstone(View view) {
        Toast.makeText(getApplicationContext(), getString(R.string.capstone_message), Toast.LENGTH_LONG).show();
    }

    public void goToGoUbiquitous(View view) {
        Toast.makeText(getApplicationContext(), getString(R.string.ubiquitous_message), Toast.LENGTH_LONG).show();
    }

    public void goToMakeYourAppMaterial(View view) {
        Toast.makeText(getApplicationContext(), getString(R.string.make_your_app_material_message), Toast.LENGTH_LONG).show();
    }

    public void goToBuildItBigger(View view) {
        Toast.makeText(getApplicationContext(), getString(R.string.build_it_bigger_message), Toast.LENGTH_LONG).show();
    }
}
