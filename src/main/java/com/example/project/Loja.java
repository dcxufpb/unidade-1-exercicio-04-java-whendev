package com.example.project;

public class Loja {

    public  String NOME_LOJA ;
    public  String LOGRADOURO;
    public  int NUMERO;
    public  String COMPLEMENTO;
    public  String BAIRRO;
    public  String MUNICIPIO;
    public  String ESTADO;
    public  String CEP;
    public  String TELEFONE;
    public  String OBSERVACAO;
    public  String CNPJ;
    public  String INSCRICAO_ESTADUAL;

    public Loja(String NOME_LOJA, String LOGRADOURO, int NUMERO, String COMPLEMENTO,
                String BAIRRO, String MUNICIPIO, String ESTADO, String CEP, String TELEFONE,
                String OBSERVACAO, String CNPJ, String INSCRICAO_ESTADUAL) {
        this.NOME_LOJA = NOME_LOJA;
        this.LOGRADOURO = LOGRADOURO;
        this.NUMERO = NUMERO;
        this.COMPLEMENTO = COMPLEMENTO;
        this.BAIRRO = BAIRRO;
        this.MUNICIPIO = MUNICIPIO;
        this.ESTADO = ESTADO;
        this.CEP = CEP;
        this.TELEFONE = TELEFONE;
        this.OBSERVACAO = OBSERVACAO;
        this.CNPJ = CNPJ;
        this.INSCRICAO_ESTADUAL = INSCRICAO_ESTADUAL;
    }
}