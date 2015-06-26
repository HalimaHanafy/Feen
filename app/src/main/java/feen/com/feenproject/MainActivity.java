package feen.com.feenproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import feen.com.feenproject.GridViewAdapter.ItemObject;
import feen.com.feenproject.GridViewAdapter.RecyclerViewAdapter;

public class MainActivity extends ActionBarActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(null);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        topToolBar.setTitle("Main Menu");
        setSupportActionBar(topToolBar);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        topToolBar.setLogo(R.drawable.logo);
//        topToolBar.setLogoDescription(getResources().getString(R.string.logo_desc));

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
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

        if(id==android.R.id.home) {
            onBackPressed();
            Toast.makeText(MainActivity.this, "back", Toast.LENGTH_LONG).show();
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.action_new){
            Toast.makeText(MainActivity.this, "Create Text", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList(){
        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Restaurants", R.drawable.one));
        allItems.add(new ItemObject("Super Markets", R.drawable.three));
        allItems.add(new ItemObject("Cafes", R.drawable.three));
        allItems.add(new ItemObject("Hospitals", R.drawable.one));
        allItems.add(new ItemObject("Cafes", R.drawable.one));
        allItems.add(new ItemObject("Cafes", R.drawable.three));
        allItems.add(new ItemObject("Cafes", R.drawable.three));
        allItems.add(new ItemObject("Cafes", R.drawable.one));
        allItems.add(new ItemObject("Cafes", R.drawable.one));
        allItems.add(new ItemObject("Cafes", R.drawable.one));
        allItems.add(new ItemObject("Cafes", R.drawable.three));
        allItems.add(new ItemObject("Cafes", R.drawable.one));
        allItems.add(new ItemObject("Cafes", R.drawable.three));
        allItems.add(new ItemObject("Cafes", R.drawable.one));
        return allItems;
    }
}
