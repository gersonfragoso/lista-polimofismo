package org.example.Exercicio1_Exercicio4.model;

import org.example.Exercicio1_Exercicio4.abstracts.Animal;

public class Cachorro extends Animal {
    public Cachorro(String name, int idade) {
        super(name, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo \n");
    }
    public void correr(){
        System.out.println("Cachorro correndo...");
    }
}
