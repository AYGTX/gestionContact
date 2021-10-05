package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity implements View.OnClickListener {
    Button addContactButton,showContactButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

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