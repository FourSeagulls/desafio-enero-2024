package com.programandoenjava.parte2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Implementa en Java que tenga un método
 * para agregar números enteros y otro método para calcular
 * la suma de todos los elementos en la lista.
 */
public class Parte2 {
    Scanner entrada = new Scanner(System.in);
    public ArrayList<Integer> listaNum = new ArrayList<>();
    int num = 0;
    /**
     * Calcula la suma de todos los números enteros.
     *
     * @return La suma de los números enteros.
     */
    public int sumarNumeros() {
        int resultado = 0;
        for(int i=listaNum.size()-1; i>=0; i--){
            resultado += listaNum.get(i);
        }
        return resultado;
    }

    /**
     * Agrega un número entero a la lista.
     *
     * @param numero El número entero que se va a agregar.
     */
    public void agregarNumero(int numero) {
        num = numero;
        int contador=0;
        listaNum.add(num);
        do{
            try{

                System.out.print("""
                                   Si ingresas 0 esto terminará.
                                   Dame otro valor entero para agregar: """);
                num = entrada.nextInt();


                if(num == 0){
                    break;
                }
                listaNum.add(num);
                contador++;

            }catch (InputMismatchException ex){
                System.out.println("Debe de ser un número entero\nNo valen letras");
                entrada.nextLine();
            }

        }while(num != 0);

        System.out.println("Contenido de la lista: " + listaNum);
        entrada.close();
    }
}
