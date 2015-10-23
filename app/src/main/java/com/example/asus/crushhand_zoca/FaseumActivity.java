package com.example.asus.crushhand_zoca;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.support.v7.app.AppCompatActivity;

public class FaseumActivity extends AppCompatActivity implements View.OnClickListener {

    int nfase;
    Button btVoltar;
    Button btWin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faseum);

        /*int[] lista = new int[]{R.drawable.a, R.drawable.b, R.drawable.c,
                                R.drawable.d, R.drawable.e, R.drawable.f,
                                R.drawable.g, R.drawable.h, R.drawable.fasesestrela};

        GridView gv = (GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new Adaptador(this, lista));

        GridLayout gv = new GridLayout(this);
        for(int i=0; i<5; i++){
            for(int j=0;j<5;j++){
                GridLayout.Spec linha = GridLayout.spec(i);
                GridLayout.Spec coluna = GridLayout.spec(j);
                GridLayout.LayoutParams lp = new GridLayout.LayoutParams(linha, coluna);

                ImageView iv = new ImageView(this);
                iv.setImageResource(R.drawable.ic_launcher);

            }
        }*/

        btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(this);

        btWin = (Button) findViewById(R.id.btWin);
        btWin.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_faseum, menu);
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

        switch(v.getId()) {
            case R.id.btVoltar:
                Intent i6= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i6);
                break;

            case R.id.btWin:
                Intent i7 = new Intent(getApplicationContext(), WinActivity.class);
                startActivity(i7);
                break;
        }

    }
}