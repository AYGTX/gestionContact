package com.example.gestioncontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context con;
    ArrayList<Contact> data;

    MyAdapter(Context con, ArrayList<Contact> data){
    this.con=con;
    this.data=data;

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inf =  LayoutInflater.from(con);
        View v= inf.inflate(R.layout.view_contact,null);
        TextView tvnom=v.findViewById(R.id.tv_firstName_view);
        TextView tvprenom=v.findViewById(R.id.tv_lastName_view);
        TextView tvnum=v.findViewById(R.id.tv_phone_view);

        tvnom.setText(data.get(i).nom);
        tvprenom.setText(data.get(i).prenom);
        tvnum.setText(data.get(i).numero);
        return v;
    }
}
