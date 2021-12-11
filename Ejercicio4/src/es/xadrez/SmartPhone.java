package es.xadrez;

public class SmartPhone extends SmartDevice{
    int G;
    boolean teclado;
    boolean giroscopio;
    boolean brujula;
    int SDInterna;
    int SDExterna;
    int SDExternaMax;

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, Float pantallaPulgadas, String resolucion,
                      String color, boolean GPS, float bateriamAh, float duracion, int g,
                      boolean teclado, boolean giroscopio, boolean brujula, int SDInterna, int SDExterna,
                      int SDExternaMax) {
        super(fabricante, modelo, pantallaPulgadas, resolucion, color, GPS, bateriamAh, duracion);
        G = g;
        this.teclado = teclado;
        this.giroscopio = giroscopio;
        this.brujula = brujula;
        this.SDInterna = SDInterna;
        this.SDExterna = SDExterna;
        this.SDExternaMax = SDExternaMax;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pantallaPulgadas=" + pantallaPulgadas +
                ", resolucion='" + resolucion + '\'' +
                ", color='" + color + '\'' +
                ", GPS=" + GPS +
                ", bateriamAh=" + bateriamAh +
                ", duracion=" + duracion +
                ", G=" + G +
                ", teclado=" + teclado +
                ", giroscopio=" + giroscopio +
                ", brujula=" + brujula +
                ", SDInterna=" + SDInterna +
                ", SDExterna=" + SDExterna +
                ", SDExternaMax=" + SDExternaMax +
                '}';
    }
}
