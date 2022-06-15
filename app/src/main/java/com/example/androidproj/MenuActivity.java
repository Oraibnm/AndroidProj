package com.example.androidproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity  {
    ListView listView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView= (ListView)findViewById(R.id.menu_list);

          String[] captions = new String[com.example.androidproj.Menu.menus.length];
          int[] ids = new int[com.example.androidproj.Menu.menus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = com.example.androidproj.Menu.menus[i].getName();
            ids[i] = com.example.androidproj.Menu.menus[i].getImageID();
        }
                ArrayAdapter <Menu> listAdapter = new ArrayAdapter <Menu>(this,
                android.R.layout.simple_list_item_1);
        listView.setAdapter(listAdapter);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MenuActivity.this, TypeActivity.class);
                    intent.putExtra("type_id",(int)id);
                    startActivity(intent);
                }
            }
        };

        listView.setOnItemClickListener(itemClickListener);
    }
}
