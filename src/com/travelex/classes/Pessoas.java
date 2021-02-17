package com.travelex.classes;

import java.util.Locale;

public class Pessoas {

    private String nome;
    private String[] nomeSeparado;

    public String getNome() throws Exception {
        this.verificarNome(nome);
        return nome;
    }

    public void setNome(String nome) throws Exception {
        this.verificarNome(nome);
        this.nome = nome;
        this.splitNome(nome);
    }

    public String getPrimeiroNome() throws Exception {
        this.verificarNome(nome);
        if (nomeSeparado.length > 0)
            return nomeSeparado[0];
        else
            throw new Exception("Nome não processado");
    }

    public String getUltimoNome() throws Exception {
        this.verificarNome(nome);
        if (nomeSeparado.length > 0)
            return nomeSeparado[nomeSeparado.length - 1];
        else
            throw new Exception("Nome não processado");
    }

    public String getMaiusculasNome() throws Exception {
        this.verificarNome(nome);
        return nome.toUpperCase(Locale.ROOT);
    }

    public String getAbreviadoNome() throws Exception {
        this.verificarNome(nome);
        StringBuilder nomeAbreviado = new StringBuilder();
        if (nomeSeparado.length > 0) {
            nomeAbreviado = new StringBuilder(nomeSeparado[0]);
            for (int i = 1; i < nomeSeparado.length - 1; i++) {
                nomeAbreviado.append(" ").append(nomeSeparado[i].substring(0, 1).toUpperCase(Locale.ROOT)).append(".");
            }
            if (nomeSeparado.length - 1 > 0)
                nomeAbreviado.append(" ").append(nomeSeparado[nomeSeparado.length - 1]);
        } else
            throw new Exception("Nome não processado");

        return nomeAbreviado.toString();
    }

    private void splitNome(String nome) {
        nomeSeparado = nome.split(" ");
    }

    private void verificarNome(String nome) throws Exception {
        if (nome == null)
            throw new Exception("Nome não pode ser nulo");

        if (nome.length() == 0)
            throw new Exception("Nome não pode ser vazio");

        if (nome.trim().length() != nome.length())
            throw new Exception("Nome não pode conter espaços extras no início e no fim");

    }
}
