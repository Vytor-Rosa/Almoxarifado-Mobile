package com.example.exemplo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VisaoGeralActivity extends AppCompatActivity {

    public static List<Produto> produtos = new ArrayList<Produto>();
    private MyAdapter mAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visao_geral);



        Drawable drawable = getResources().getDrawable(R.drawable.eletrico);
        produtos.add(new Produto("String nome",
                "String descricao",
                "String caracteristicas",
                "String classificao",
                "String localizacao",
                10,
                true,
                drawable,
                drawable));

        recyclerView = findViewById(R.id.recycler_view); // Inicializa o RecyclerView

        mAdapter = new MyAdapter(produtos); // Instancia o Adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(mAdapter); // Configura o Adapter na RecyclerView
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            recyclerView.getAdapter().notifyDataSetChanged();
        }
    }
}
