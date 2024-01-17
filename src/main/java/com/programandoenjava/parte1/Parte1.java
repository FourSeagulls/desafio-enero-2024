package com.programandoenjava.parte1;
import java.util.*;
public class Parte1 {
    StringTokenizer st;
    ArrayList<String> palabras = new ArrayList<>();
    String palabraInvertida = "";
    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {
        st = new StringTokenizer(cadena);
        while(st.hasMoreTokens()){
            palabras.add(st.nextToken()+" ");
        }
        for(String palabra : palabras){
            for(int i=palabra.length()-1; i>=0; i--){
                palabraInvertida+= palabra.charAt(i);
            }
        }

        return palabraInvertida;
    }
}
