package es.xadrez;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Ejercicio 8

        try {
            InputStream fileIn = new FileInputStream("c:/data/fichero.txt");
            try {
                byte[] datos = fileIn.readAllBytes();

                PrintStream fileOut = new PrintStream("c:/data/salida.txt");
                fileOut.write(datos);
                fileOut.close();
                fileIn.close();

            }catch (IOException e){
                System.out.println("ERROR: "+ e.getMessage());
            }
        }catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


        // Ejercicio 9

        /*
        Juego de "Hundir la flota", al que se puede jugar tradicionalmente
        (A1->Agua) o con códigos para decir las iniciales, al estilo de las comunicaciones
        por radio (Eco 1 para decir E1->Agua, Alfa 2 para decir A2, etc.)
        El programa hace un mapa en disco duro de los disparos efectuados,
        que quedan grabados después de la partida en la carpeta c:\data,
        con el texto "Agua" o "Hundido" y de nombre las coordenadas del disparo.
        */


        char numero='0';
        char inicial='a';
        String rutaSalida="";
        char barcoLetra='H';
        char barcoNum='7';
        String barco;
        char mar [][]= {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                        };
        HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
        mapa.put('a',1);
        mapa.put('b',2);
        mapa.put('c',3);
        mapa.put('d',4);
        mapa.put('e',5);
        mapa.put('f',6);
        mapa.put('g',7);
        mapa.put('h',8);

        mapa.put('1',1);
        mapa.put('2',2);
        mapa.put('3',3);
        mapa.put('4',4);
        mapa.put('5',5);
        mapa.put('6',6);
        mapa.put('7',7);
        mapa.put('8',8);



        try {
            String rutaEntrada="c:/data/datacard.txt";
            InputStream DataCard = new FileInputStream(rutaEntrada);
            try {
                byte[] datos= DataCard.readAllBytes();
                for (byte dato : datos) {
                    System.out.print((char)dato);
                    }
                DataCard.close();

                barco=(barcoLetra +Character.toString(barcoNum)).toLowerCase(Locale.ROOT);
                rutaSalida = "c:/data/"+barco+".txt";
                PrintStream fileOut = new PrintStream(rutaSalida);
                fileOut.write(datos);
                fileOut.close();
            }catch (IOException e){
                System.out.println("ERROR: "+ e.getMessage());
            }
        }catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        do{
            try {
                InputStream fallo = new FileInputStream("c:/data/agua.txt");
                try {
                    byte[] datos = fallo.readAllBytes();
                    fallo.close();


                    String lectura;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Letra (A-H)?:");
                    lectura = scanner.nextLine();
                    inicial = lectura.toLowerCase(Locale.ROOT).charAt(0);
                    System.out.println("Número (1-8)?");
                    lectura = scanner.nextLine();
                    numero = lectura.charAt(0);
                    mar[mapa.get(inicial)-1][mapa.get(numero)-1]='X';

                    if (inicial == barcoLetra && barcoNum == numero) {
                        System.out.println(" Hundido!!");
                    } else {

                        rutaSalida = "c:/data/" + inicial + numero + ".txt";
                        PrintStream aguaOut = new PrintStream(rutaSalida);
                        aguaOut = new PrintStream(rutaSalida);
                        aguaOut.write(datos);
                        aguaOut.close();
                        System.out.println("ABCDEFGH");
                        for (int i=0; i<8; i++){
                            for (int j=0; j<8; j++) {
                                System.out.print(mar[i][j]);
                            }
                            System.out.println(" "+(i+1));
                        }
                    }

                } catch (IOException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            } catch (FileNotFoundException e) {
                System.out.println("ERROR: " + e.getMessage());

            }
        }while(inicial != barcoLetra && barcoNum != numero);
        System.out.println("¡¡   H u n d i d o   !!");

    }
}
