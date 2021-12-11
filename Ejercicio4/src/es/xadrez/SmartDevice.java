package es.xadrez;

public class SmartDevice {
    String fabricante;
    String modelo;
    Float pantallaPulgadas;
    String resolucion;
    String color;
    boolean GPS;
    float bateriamAh;
    float duracion;

    public SmartDevice() {
    }

    public SmartDevice(String fabricante, String modelo, Float pantallaPulgadas, String resolucion,
                       String color, boolean GPS, float bateriamAh, float duracion) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pantallaPulgadas = pantallaPulgadas;
        this.resolucion = resolucion;
        this.color = color;
        this.GPS = GPS;
        this.bateriamAh = bateriamAh;
        this.duracion = duracion;
    }


}
