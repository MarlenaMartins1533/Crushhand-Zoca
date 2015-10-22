package com.example.asus.crushhand_zoca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class FasesActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox chkFase1;
    CheckBox chkFase2;
    CheckBox chkFase3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fases);

        chkFase1 = (CheckBox) findViewById(R.id.chkFase1);
        chkFase1.setOnClickListener(this);

        chkFase2 = (CheckBox) findViewById(R.id.chkFase2);
        chkFase2.setOnClickListener(this);

        chkFase3 = (CheckBox) findViewById(R.id.chkFase3);
        chkFase3.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fases, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.chkFase1:
                Intent i9 = new Intent(getApplicationContext(), FaseumActivity.class);//alterar para fase1
                i9.putExtra("nfase", 1);
                startActivity(i9);
                break;

            case R.id.chkFase2:
                Intent i10 = new Intent(getApplicationContext(), FasesActivity.class);//alterar para fase2
                i10.putExtra("nfase", 2);
                startActivity(i10);
                break;

            case R.id.chkFase3:
                Intent i11 = new Intent(getApplicationContext(), FasesActivity.class);//alterar para fase3
                i11.putExtra("nfase", 3);
                startActivity(i11);
                break;

        }
    }

}
