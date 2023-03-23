package com.example.exemplo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
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

        this.mAdapter = new MyAdapter(getApplicationContext(), produtos);
        mAdapter.setOnItemClickListener((int position) -> {
            Intent it = new Intent(VisaoGeralActivity.this, DetalhesProdutos.class);

            it.putExtra("nome", produtos.get(position).getNome());
            it.putExtra("descricao", produtos.get(position).getDescricao());
            it.putExtra("caracteristicas", produtos.get(position).getCaracteristicas());
            it.putExtra("classificao", produtos.get(position).getClassificao());
            it.putExtra("localizacao", produtos.get(position).getLocalizacao());
            it.putExtra("quantidade", produtos.get(position).getQuantidade());
            it.putExtra("descartavel", produtos.get(position).isDescartavel());

            Bitmap bitmap1 = ((BitmapDrawable) produtos.get(position).getImagem()).getBitmap();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bitmap1.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] byteArray = stream.toByteArray();
            it.putExtra("imagem", byteArray);

            Bitmap bitmap2 = ((BitmapDrawable) produtos.get(position).getAnexo()).getBitmap();
            bitmap2.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] byteArray2 = stream.toByteArray();
            it.putExtra("anexo", byteArray2);

            startActivityForResult(it, 1);
        });

        Drawable drawable = getResources().getDrawable(R.drawable.eletrico);
        produtos.add(new Produto("String nome",
                "String descricao",
                "String caracteristicas",
                "String classificao",
                "String localizacao",
                "10 unidades",
                true,
                drawable,
                drawable));
        produtos.add(new Produto("String nome",
                "String descricao",
                "String caracteristicas",
                "String classificao",
                "String localizacao",
                "10 unidades",
                true,
                drawable,
                drawable));
        produtos.add(new Produto("String nome",
                "String descricao",
                "String caracteristicas",
                "String classificao",
                "String localizacao",
                "10 unidades",
                true,
                drawable,
                drawable));

        recyclerView = findViewById(R.id.recycler_view); // Inicializa o RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(this.mAdapter); // Configura o Adapter na RecyclerView
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            recyclerView.getAdapter().notifyDataSetChanged();
        }
    }
}
