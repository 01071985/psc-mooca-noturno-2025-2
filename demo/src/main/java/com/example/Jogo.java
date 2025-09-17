package com.example;


public class Jogo {

    public static void main(String[] args) {
        Personagem cacador = new Personagem("João",10, 10, 5);
        Personagem soneca = new Personagem("Danilo",4,3,5);
        
        while(true){
        cacador.cacar();
        soneca.dormir();
        cacador.comer();
        soneca.dormir();
        cacador.dormir();
        soneca.dormir();
        cacador.cacar();
        soneca.comer();
        cacador.cacar();
        soneca.cacar();
        System.out.println("========================");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
