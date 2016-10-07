package edu.calvin.cl43.lab05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

/**
 *  Chris Li, cl43, cs262, lab 05, Prof. Vanderlinden
 *  <p>
 *  This app has a menu in the top-right corner that takes you to a settings page. There is a checkbox that you can click to set preference. User can use the Android return button to go back to the main page.
 */

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

        /* Although it was the hero's INTENT to slay the evil beast Dividius Zero.
         * He put on his armor and equipped his weapon, but much was on his mind.
         * The hero knew that this was his destiny to free Aerith Maticia and save its people.
         * But he wondered "Why me? Why was I chosen?".
         * IF he did not find out why he was the chosen hero, he could not put himself in the action's setting.
         * He traveled on to other realms to learn what the beast, Dividius Zero, is really ABOUT.
         */
        if (id == R.id.action_settings) {
            //If the about page has been clicked, it will bring it up.
            Intent intent=new Intent(this,Main2Activity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}