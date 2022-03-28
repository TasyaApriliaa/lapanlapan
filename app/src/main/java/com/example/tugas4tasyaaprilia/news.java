package com.example.tugas4tasyaaprilia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class news extends AppCompatActivity {
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.news);
    }

    public void clicktransaksi(View view){
        Intent i = new Intent(this,transaksi.class);
        startActivity(i);
    }
    public void clickmenu_agen(View view){
        Intent i = new Intent(this,menu_agen.class);
        startActivity(i);
    }
    public void clickhistory(View view){
        Intent i = new Intent(this,data_history.class);
        startActivity(i);
    }
    public void clicknews(View view){
        Intent i = new Intent(this,news.class);
        startActivity(i);
    }
}
