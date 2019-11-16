package com.example.vorakgergokockadobas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button ButtonDobas;
    private TextView Eredmeny;
    private ImageView ImageGep,ImageJatekos;
    private int jatekosPont, gepPont;
    private Random rand;
    private int JatekosDob,gepDob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ButtonDobas.setOnClickListener(this);
    }
    private void init() {
        ButtonDobas = findViewById(R.id.ButtonDobas);
        Eredmeny = findViewById(R.id.Eredmeny);
        ImageJatekos = findViewById(R.id.ImageJatekos);
        ImageGep = findViewById(R.id.ImageGep);
        rand = new Random();
        jatekosPont = 0;
        gepPont = 0;
    }

    @Override
    public void onClick(View v) {
        JatekosDob = rand.nextInt(6) + 1;
        gepDob = rand.nextInt(6) + 1;

            switch (JatekosDob) {
                case 1:
                    ImageJatekos.setImageResource(R.drawable.kocka1);
                    break;
                case 2:
                    ImageJatekos.setImageResource(R.drawable.kocka2);
                    break;
                case 3:
                    ImageJatekos.setImageResource(R.drawable.kocka3);
                    break;
                case 4:
                    ImageJatekos.setImageResource(R.drawable.kocka4);
                    break;
                case 5:
                    ImageJatekos.setImageResource(R.drawable.kocka5);
                    break;
                case 6:
                    ImageJatekos.setImageResource(R.drawable.kocka6);
                    break;
            }
            switch (gepDob) {
                case 1:
                    ImageGep.setImageResource(R.drawable.kocka1);
                    break;
                case 2:
                    ImageGep.setImageResource(R.drawable.kocka2);
                    break;
                case 3:
                    ImageGep.setImageResource(R.drawable.kocka3);
                    break;
                case 4:
                    ImageGep.setImageResource(R.drawable.kocka4);
                    break;
                case 5:
                    ImageGep.setImageResource(R.drawable.kocka5);
                    break;
                case 6:
                    ImageGep.setImageResource(R.drawable.kocka6);
                    break;
            }
            if (gepDob > JatekosDob) {
                gepPont++;
            } else if (gepDob == JatekosDob) {
                gepPont+=0;
                jatekosPont+=0;
            } else {
                jatekosPont++;
            }
            Eredmeny.setText("Eredmény:"+jatekosPont+"-"+gepPont);
            if (jatekosPont==3)
            {
                ButtonDobas.setEnabled(false);
                Toast.makeText(MainActivity.this, "Nyertél", Toast.LENGTH_SHORT).show();finish();
            }
            else if (gepPont==3)
            {
                ButtonDobas.setEnabled(false);
                Toast.makeText(MainActivity.this, "Vesztettél", Toast.LENGTH_SHORT).show();finish();
            }


    }
}
