package com.example.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity{
    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void onClickProyecto(View view){
        TextView textView = (TextView) findViewById(R.id.textView);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String ListaProOferta = String.valueOf(spinner.getSelectedItem());

        List<String> ofertas = expert.getBrands(ListaProOferta);
        StringBuilder categoria = new StringBuilder();
        for (String cervezas : ofertas)
            categoria.append(cervezas).append('\n');
        textView.setText(categoria);
    }
}
