package es.xadrez;

public class Main {

    public static void main(String[] args) {
        double neto=100;
        double conIVA=sumaIva(neto);
        System.out.println("El precio con IVA es: " + conIVA);
    }

    static double sumaIva(double neto) {
        return neto*1.21d;
    }

}