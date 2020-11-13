/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.model;

import java.io.Serializable;
import java.text.Collator;

/**
 *
 * @author celso
 */
public class Usuario implements Comparable<Usuario>,Serializable{
    
    private String nome,apelido;
    private int idade;
    private Conta conta;

    public Usuario(String nome, String apelido, int idade, Conta conta) {
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.conta = conta;
    }
    
    public Usuario(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public int compareTo(Usuario outroUsuario){
        return Collator.getInstance().compare(this.nome, outroUsuario.nome);
    }
}
