package es.xadrez;

public class Main {

    public static void main(String[] args) {

        // Ejercicio 7
        int cero;
        try {
            cero=DividePorCero();

        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse: ");
        } finally {
            System.out.println("Demo de código");
        }

    }
       public static int DividePorCero() throws ArithmeticException {
        try {
            return (2 / 0);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}

