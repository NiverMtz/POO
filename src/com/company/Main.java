package com.company;

public class Main {

    public static void main(String[] args) {
	    Perro lomito = new Perro();
        lomito.nombre = "Firulais";
        lomito.raza = "Pomeranian";
        lomito.edad = 1;
        lomito.tamanio = "Grande";
        lomito.caracteristicas();
        lomito.dormir();

        Perro lomito2 = new Perro();
        lomito2.nombre = "El Jajas";
        lomito2.raza = "Shihuahua";
        lomito2.edad = 2;
        lomito2.tamanio = "Chico";
        lomito2.caracteristicas();
        lomito2.dormir();
    }
}
