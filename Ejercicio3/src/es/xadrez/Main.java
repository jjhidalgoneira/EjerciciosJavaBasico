package es.xadrez;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Pepe","Antonio", "Mateo"};

        String ConCadena="";

        for (String nombre : nombres) {
            ConCadena += nombre;

        }
        System.out.println(ConCadena);
    }
}
