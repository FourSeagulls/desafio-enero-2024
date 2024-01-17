package com.programandoenjava;
import com.programandoenjava.parte1.Parte1;
import com.programandoenjava.parte2.Parte2;
import java.util.Scanner;
public class Main {

    static Scanner entrada = new Scanner(System.in);
    static String frase;
    static int iniciador = 0;

    public static void main(String[] args) {

        Parte1 p1 = new Parte1();
        System.out.println("Dime la frase que quieres invertir: ");
        frase = entrada.nextLine();
        System.out.println("Entrada invertida: " + p1.invertirPalabras(frase));


        Parte2 p2 = new Parte2();
        System.out.println("introduce le número de partida: ");
        iniciador = entrada.nextInt();
        p2.agregarNumero(iniciador);

        System.out.println("El resultado de la suma es: " + p2.sumarNumeros());
        entrada.close();
    }
}