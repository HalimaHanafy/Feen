package feen.com.feenproject;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sarah on 5/19/2015.
 */
public class MyActivity extends ActionBarActivity {

    TextView txt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feen_activity);
        setTitle(null);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        topToolBar.setTitle("Feeeeen?");
        setSupportActionBar(topToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txt= (TextView) findViewById(R.id.textView);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/W3THGH01.TTF");
        txt.setTypeface(face);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==android.R.id.home) {
            onBackPressed();
            Toast.makeText(MyActivity.this, "back", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.action_new){
            Toast.makeText(MyActivity.this, "Create Text", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
