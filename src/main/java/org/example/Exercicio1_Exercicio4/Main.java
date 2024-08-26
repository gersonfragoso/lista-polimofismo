package org.example.Exercicio1_Exercicio4;

import org.example.Exercicio1_Exercicio4.abstracts.Animal;
import org.example.Exercicio1_Exercicio4.model.Cachorro;
import org.example.Exercicio1_Exercicio4.model.Cavalo;
import org.example.Exercicio1_Exercicio4.model.Preguica;
import org.example.Exercicio1_Exercicio4.model.Veterinario;
import org.example.Exercicio1_Exercicio4.testeExercicios.TesteAnimalAndVeterinario;
import org.example.Exercicio1_Exercicio4.testeExercicios.TesteZoologico;

public class Main {
    public static void emitirSomDeAnimal(Animal animal) {
        animal.emitirSom();
    }

    public static void main(String[] args) {
        TesteAnimalAndVeterinario testeAnimal = new TesteAnimalAndVeterinario();
        System.out.println("Testando classe Animal");
        testeAnimal.TestarAnimal();
        System.out.println();
        System.out.println("Testando classe Veterinario");
        testeAnimal.TestarVeterinario();
        System.out.println();
        TesteZoologico testeZoologico = new TesteZoologico();
        System.out.println("Testando classe Zoologico");
        testeZoologico.TestarZoologico();
    }
}
