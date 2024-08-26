package org.example.Exercicio1_Exercicio4.testeExercicios;

import org.example.Exercicio1_Exercicio4.model.Cachorro;
import org.example.Exercicio1_Exercicio4.model.Cavalo;
import org.example.Exercicio1_Exercicio4.model.Preguica;
import org.example.Exercicio1_Exercicio4.model.Zoologico;

public class TesteZoologico {
   public void TestarZoologico(){
       Zoologico zoologico = new Zoologico();

       zoologico.adicionarAnimal(0, new Cachorro("Rex", 5));
       zoologico.adicionarAnimal(1, new Cavalo("Spirit", 7));
       zoologico.adicionarAnimal(2, new Preguica("Sid", 3));
       zoologico.adicionarAnimal(3, new Cachorro("Bolt", 4));
       zoologico.adicionarAnimal(4, new Cavalo("Pé de Pano", 6));
       zoologico.adicionarAnimal(5, new Preguica("Flash", 2));
       zoologico.adicionarAnimal(6, new Cachorro("Buddy", 3));
       zoologico.adicionarAnimal(7, new Cavalo("Thunder", 8));
       zoologico.adicionarAnimal(8, new Preguica("Lazy", 1));
       zoologico.adicionarAnimal(9, new Cachorro("Max", 7));
       System.out.println("Testando o Zoológico:");
       zoologico.percorrerJaulas();
   }
}
