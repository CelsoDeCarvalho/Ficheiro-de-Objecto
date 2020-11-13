/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.model;

/**
 *
 * @author celso
 */
public class Conta {
    
    private long numero_conta;
    private String data_cracao,data_expiro,nome_user;
    private double saldo;
    private int senha;

    public Conta(long numero_conta, String data_cracao, String data_expiro, String nome_user, double saldo, int senha) {
        this.numero_conta = numero_conta;
        this.data_cracao = data_cracao;
        this.data_expiro = data_expiro;
        this.nome_user = nome_user;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    public Conta(){
        
    }

    public long getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(long numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getData_cracao() {
        return data_cracao;
    }

    public void setData_cracao(String data_cracao) {
        this.data_cracao = data_cracao;
    }

    public String getData_expiro() {
        return data_expiro;
    }

    public void setData_expiro(String data_expiro) {
        this.data_expiro = data_expiro;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    
}
