package org.example.Exercicio1_Exercicio4.model;

import org.example.Exercicio1_Exercicio4.abstracts.Animal;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguiça fazendo som \n");
    }

    public void subirEmArvore() {
        System.out.println("Preguiça subindo em árvore...");
    }
}

