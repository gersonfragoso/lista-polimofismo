package org.example.Exercicio1_Exercicio4.model;

import org.example.Exercicio1_Exercicio4.abstracts.Animal;

public class Cavalo extends Animal {
    public Cavalo(String name, int idade) {
        super(name, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Cavalo relinchando \n");
    }
    public void correr(){
        System.out.println("Cavalo correndo...");
    }

}
