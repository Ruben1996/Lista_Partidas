package com.example.ruben.test_listas;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Actllista  extends ListActivity{
    static final String[] arrayGames = new String[]{
            "Partida 1",
            "Partida 2",
            "Partida 3",
            "Partida 4",
            "Partida 5",
            "Partida 6"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actllista);



        ListAdapter adaptadorL = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, arrayGames);

        ListView listv = (ListView) findViewById(android.R.id.list);
        listv.setAdapter(adaptadorL);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.llistam, arrayGames));
        ListView lisv = getListView();
        lisv.setTextFilterEnabled(true);

        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(),((TextView)view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}

