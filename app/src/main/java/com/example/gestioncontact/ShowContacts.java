package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowContacts extends AppCompatActivity {
    ListView lv_showContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_contacts);
//        ArrayAdapter ad=new ArrayAdapter(ShowContacts.this, android.R.layout.simple_list_item_1,Accueil.data);
//        lv_showContacts= findViewById(R.id.lv_showContacts);
//        lv_showContacts.setAdapter(ad);
        MyAdapter ad=new MyAdapter(ShowContacts.this,Accueil.data);
        lv_showContacts= findViewById(R.id.lv_showContacts);
        lv_showContacts.setAdapter(ad);
    }
}