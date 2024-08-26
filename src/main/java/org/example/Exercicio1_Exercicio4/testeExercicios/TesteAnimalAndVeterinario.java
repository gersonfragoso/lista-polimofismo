package org.example.Exercicio1_Exercicio4.testeExercicios;

import org.example.Exercicio1_Exercicio4.model.Cachorro;
import org.example.Exercicio1_Exercicio4.model.Cavalo;
import org.example.Exercicio1_Exercicio4.model.Preguica;
import org.example.Exercicio1_Exercicio4.model.Veterinario;

public class TesteAnimalAndVeterinario {
    Cachorro cachorro = new Cachorro("Rex", 5);
    Cavalo cavalo = new Cavalo("Spirit", 7);
    Preguica preguica = new Preguica("Sid", 3);

    public void TestarAnimal() {

        //Teste cachorro
        cachorro.correr();
        System.out.println();
        //Teste cavalo
        cavalo.correr();
        System.out.println();
        //Teste preguiça
        preguica.subirEmArvore();
        System.out.println();

        //Teste Emitir som poliformicamente
        cachorro.emitirSomDeAnimal(cachorro);
        cavalo.emitirSomDeAnimal(cavalo);
        preguica.emitirSomDeAnimal(preguica);
    }
    public void TestarVeterinario(){
        Veterinario veterinario = new Veterinario();
        //Veterinario Teste
        System.out.println("Veterinario:");
        veterinario.Examinar(cachorro);
        veterinario.Examinar(cavalo);
        veterinario.Examinar(preguica);

    }
}
