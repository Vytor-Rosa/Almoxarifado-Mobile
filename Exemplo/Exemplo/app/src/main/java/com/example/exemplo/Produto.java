package com.example.exemplo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Produto extends AppCompatActivity {
    private String nome, descricao, caracteristicas, classificao, localizacao;
    private Integer quantidade;
    private boolean descartavel;
    private Drawable imagem, anexo;

    public Produto(String nome, String descricao, String caracteristicas, String classificao, String localizacao, Integer quantidade, boolean descartavel, Drawable imagem, Drawable anexo) {
        this.nome = nome;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
        this.classificao = classificao;
        this.localizacao = localizacao;
        this.quantidade = quantidade;
        this.descartavel = descartavel;
        this.imagem = imagem;
        this.anexo = anexo;
    }

    public Produto(int contentLayoutId, String nome, String descricao, String caracteristicas, String classificao, String localizacao, Integer quantidade, boolean descartavel, Drawable imagem, Drawable anexo) {
        super(contentLayoutId);
        this.nome = nome;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
        this.classificao = classificao;
        this.localizacao = localizacao;
        this.quantidade = quantidade;
        this.descartavel = descartavel;
        this.imagem = imagem;
        this.anexo = anexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getClassificao() {
        return classificao;
    }

    public void setClassificao(String classificao) {
        this.classificao = classificao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDescartavel() {
        return descartavel;
    }

    public void setDescartavel(boolean descartavel) {
        this.descartavel = descartavel;
    }

    public Drawable getImagem() {
        return imagem;
    }

    public void setImagem(Drawable imagem) {
        this.imagem = imagem;
    }

    public Drawable getAnexo() {
        return anexo;
    }

    public void setAnexo(Drawable anexo) {
        this.anexo = anexo;
    }
}
