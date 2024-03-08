package org.example;
import  Reinos.*;
import  Reinos.Especies.*;

public class Main {
    public static void main(String[] args) {
        // Animal n = new Animal();
        Mamiferos m = new Mamiferos();
        Reptil r = new Reptil();
        Peixes p = new Peixes();
        Aves a = new Aves();
        Anfibios an = new Anfibios();
        Canguru c = new Canguru();

        m.setCorPelo("Preto");
        m.setIdade(10);
        m.setPeso(50.7f);
        m.setMembros(4);
        m.alimentar();


        r.setCorEscama("Verde");

        p.setCorEscama("Azul");

        a.setCorPena("Branca");

        an.setCorPele("amarelo");

        c.alimentar();

    }
}