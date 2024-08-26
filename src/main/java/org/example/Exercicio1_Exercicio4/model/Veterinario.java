package org.example.Exercicio1_Exercicio4.model;

import org.example.Exercicio1_Exercicio4.abstracts.Animal;

public class Veterinario {
    public void Examinar(Animal animal){
        System.out.println("Veterinario examinando...");
        animal.emitirSom();
    }
}
