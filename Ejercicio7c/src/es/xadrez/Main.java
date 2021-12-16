package es.xadrez;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 5

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Primer elemento");
        aList.add("Segundo elemento");
        aList.add("Tercer elemento");
        aList.add("Cuarto elemento");

        LinkedList<String> lList = new LinkedList<String>(aList);

        for (String cadena :aList) {
            System.out.println("Elemento en Array List: "+cadena);
        }
        for (String cadena :lList) {
            System.out.println("Elemento en Linked List: "+cadena);
        }

        //Ejercicio 6

        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i=1; i<=10; i++) {
            numList.add(i);
        }
        System.out.println("Lista:"+numList);

        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int j=0; j<10; j++) {
            if ((numList.get(j))%2!=0){
                impares.add(numList.get(j));
            };
        }

        ArrayList<Integer> Afinal=new ArrayList<Integer>(impares);

        System.out.println("Lista final :"+Afinal);

    }
}
