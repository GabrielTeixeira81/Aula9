package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa gabriel = new Pessoa("Gabriel", "Teixeira", 30);
        Pessoa ariane = new Pessoa("Ariane", "Stefanini", 41);
        Pessoa safira = new Pessoa("Safira", "Teixeira", 10);


        pessoas.add(gabriel);
        pessoas.add(ariane);
        pessoas.add(safira);

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome:" + pessoa.getNome() + "\nSobrenome:" + pessoa.getSobrenome() + "\n");
        }
    }
}
