package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Accueil extends AppCompatActivity implements View.OnClickListener {
    public static ArrayList<Contact> data = new ArrayList<Contact>();
    Button addContactButton,showContactButton;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
//Recuperation du nom
        Intent passedIntent=this.getIntent();
        Bundle b=passedIntent.getExtras();
        String u = b.getString("user");

        title =findViewById(R.id.txt_title_accueil);
        title.setText("Accueil de "+u);
        addContactButton = findViewById(R.id.btn_add_accueil);
        showContactButton = findViewById(R.id.btn_show_accueil);
        addContactButton.setOnClickListener(this);
        showContactButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == addContactButton){
            Intent addContact = new Intent(this,AddContact.class);
            startActivity(addContact);
        }
        if (v == showContactButton){
            Intent showContacts = new Intent(this,ShowContacts.class);
            startActivity(showContacts);
        }
    }
}