package es.xadrez;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        String cadena = "hola mundo";
        String cadenaNueva="";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaNueva = cadenaNueva+cadena.charAt(i);
        }

        System.out.println(cadenaNueva);


        // Ejercicio 1

        String miArray[] = {"Hola ", "que ","tal ","están ","ustedes? "};

        for (String s : miArray) {
            System.out.println("Elemento del array: "+s);
        }


        //Ejercicio 2

        int miBiArray[][] = {{ 1, 2, 3, 4, 5 }, { 11, 12, 13, 14, 15 }};

        for (int j = 0; j < miBiArray.length; j++) {
            for (int k=0; k < miBiArray[j].length; k++){
                System.out.println("Posición "+j+","+k+" Valor: "+miBiArray[j][k]);
            }
        }


        // Ejercicio 3

        Vector<String> vector = new Vector();
        vector.add("Hola ");
        vector.add("que ");
        vector.add("tal ");
        vector.add("están ");
        vector.add("ustedes? ");
        System.out.println("Vector antes: "+vector);
        vector.remove(1);
        vector.remove(1);
        System.out.println("Vector después: "+vector);

        // Ejercicio 4

        //El coste computacional de la copia de los elementos de un array a otro

        }
    }
