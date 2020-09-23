package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class CupomNF {
    private List<String> erros = new ArrayList<String>();
    private Loja infoLoja;
    private String texto;

    public CupomNF(Loja infoLoja) {
        this.infoLoja = infoLoja;
    }

    public void verify() throws RuntimeException {
        if (infoLoja.NOME_LOJA.isEmpty()){
            throw new RuntimeException("O campo nome da loja é obrigatório");
        }

        if (infoLoja.LOGRADOURO.isEmpty()){
            throw new RuntimeException("O campo logradouro do endereço é obrigatório");
        }

        if (infoLoja.MUNICIPIO.isEmpty()){
            throw new RuntimeException("O campo município do endereço é obrigatório");
        }

        if (infoLoja.ESTADO.isEmpty()){
            throw new RuntimeException("O campo estado do endereço é obrigatório");
        }

        if (infoLoja.CNPJ.isEmpty()){
            throw new RuntimeException("O campo CNPJ da loja é obrigatório");
        }

        if (infoLoja.INSCRICAO_ESTADUAL.isEmpty()) {
            throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
        }
    }

    public String imprime(){
        this.texto = String.format("%s\n",infoLoja.NOME_LOJA);
        if (infoLoja.NUMERO == 0){
            this.texto += String.format("%s, %s %s\n",infoLoja.LOGRADOURO,"s/n",infoLoja.COMPLEMENTO);
        } else {
            this.texto += String.format("%s, %d %s\n",infoLoja.LOGRADOURO,infoLoja.NUMERO,infoLoja.COMPLEMENTO);
        }
        this.texto += String.format("%s - %s - %s\n",infoLoja.BAIRRO,infoLoja.MUNICIPIO,infoLoja.ESTADO);
        this.texto += String.format("CEP:%s Tel %s\n",infoLoja.CEP,infoLoja.TELEFONE);
        this.texto += String.format("%s\n",infoLoja.OBSERVACAO);
        this.texto += String.format("CNPJ: %s\n",infoLoja.CNPJ);
        this.texto += String.format("IE: %s\n",infoLoja.INSCRICAO_ESTADUAL);
        return this.texto;
    }

}