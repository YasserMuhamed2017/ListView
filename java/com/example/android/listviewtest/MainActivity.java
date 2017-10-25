package com.example.android.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ContactData data ;
    ArrayList<ContactData> contactlist ;
    ArrayAdapter adapter ;
    ListView listView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list);
        contactlist = new ArrayList<ContactData>();
        data = new ContactData();
        data.name = "Ahmed";
        data.num = 12563489;
        imageView = (ImageView) findViewById(R.id);

        contactlist.add();
        contactlist.add("Ababs");
        contactlist.add("Ababs");
        contactlist.add("Ababs");
        adapter = new ArrayAdapter(this,R.layout.list_item,contactlist);

    }
}
