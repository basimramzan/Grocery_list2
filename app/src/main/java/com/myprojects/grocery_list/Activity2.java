package com.myprojects.grocery_list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class Activity2 extends AppCompatActivity {
   ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        lv1 = findViewById(R.id.listview);
        final String[] grocery ={"Rice","Milk","Wheat","Eggs","Sugar","Salt","cookies","Chilly Powder","Peanut Butter","Vegetables","Pasta","Butter","Garam Masala","Coke","Tomato Ketchup"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1, Arrays.asList(grocery));
        lv1.setAdapter(arrayAdapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Activity2.this,grocery[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}