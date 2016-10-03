package info.androidhive.jsonparsing;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by NA-27 on 26/09/2016.
 */
public class NextActivity extends AppCompatActivity {


    private ProgressDialog pDialog;
    private ListView list;
  String name,jackpot,date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);

        ListView listView=(ListView)findViewById(R.id.listview) ;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            name = extras.getString("name");
        }
        if (extras != null) {
            jackpot = extras.getString("jackpot");
        }
        if (extras != null) {
            date = extras.getString("date");
        }


      /*  Intent intent = getIntent();
        name = intent.getExtras().getString("name");
        jackpot = intent.getExtras().getString("jackpot");
        date = intent.getExtras().getString("date"); */


        System.out.print("name :" + name);
        System.out.print("jackpot :" + jackpot);

        System.out.print("date :" + date);


    }

    }

