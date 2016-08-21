package com.tbse.happybirthdaypatrick;

// The 'package' is just the directory structure below app/src/main/java/
// So this file is at app/src/main/java/com/tbse/happybirthdaypatrick/MainActivity.java

// You know how imports work!

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


/**
 *
 * Android has come here because of the manifest, and now it will invoke the MainActivity class.
 *
 * Then it calls methods in the pattern known as the Android Lifecycle.
 *
 * Check out this image: http://www.javatpoint.com/images/androidimages/Android-Activity-Lifecycle.png
 *
 * So it will call the onCreate method, then onStart, then onResume(), ...
 * It will continue in the lifecycle forever until terminated, when it calls onStop and onDestroy.
 *
 */

public class MainActivity extends AppCompatActivity {


    /**
     * In the onCreate method you get all the things from the layout file. Get the buttons, and
     * text, and whatever is in your layout that you want to do stuff with.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The setContentView method tells Android which layout file to show to the user.
        // The big R means 'resource', so this refers to the file main/res/layout/activity_main.xml
        setContentView(R.layout.activity_main);

        // To get something from the layout, use the method findViewById, and feed it the id.
        // In the layout file, we used
        //
        // android:id="@+id/textView"
        //
        // so here we use R.id.textView
        //
        // findViewById returns a View, which is a superclass of TextView,
        // so you have to cast it to the kind of view you want to mess with.

        TextView textView = (TextView) findViewById(R.id.paragraph1);
        textView.setTextColor(ContextCompat.getColor(this, R.color.black));

        // Get the toolbar to tell Android that it's your toolbar
        // findViewById returns a View, which is a superclass of Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get the floating action button so we can add some code for when it's clicked
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        // You tell a button to do something when clicked by calling setOnClickListener
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Do stuff here when the button is clicked
                Snackbar.make(view, "Happy Birthday Patrick!!!!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /**
     *
     * This method runs when Android needs to create your menu. You add things
     *
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // You get a menu item similar to how you get a view.
        MenuItem githubMenuItem = menu.findItem(R.id.github_menu_item);
        // githubMenuItem.doSomething();

        return true;
    }


    // When an item is selected, this method is called by the Android system.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.github_menu_item) {

            // When my menu item is pressed, I intend to send the user to github
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/elliptic1/HappyBirthdayPatrick"));

            // This will launch the browser
            startActivity(browserIntent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // This method is called because I set the onClick method in the layout file
    // Look for the line 'android:onClick="as_url_click"' in activity_main.xml
    public void as_url_click(View v) {
        // When the url is clicked, I intend to send the user to github
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.android_studio_url)));
        startActivity(browserIntent);
    }

    public void manifest_click(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.manifest_url)));
        startActivity(browserIntent);
    }

    public void main_activity_click(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.main_activity_url)));
        startActivity(browserIntent);
    }

    public void main_layout_click(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.main_layout_url)));
        startActivity(browserIntent);
    }

    public void colors_click(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.colors_url)));
        startActivity(browserIntent);
    }

    public void strings_click(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.strings_url)));
        startActivity(browserIntent);
    }
}
