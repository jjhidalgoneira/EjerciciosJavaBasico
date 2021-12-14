package es.xadrez;

public class Coche {

    String marca;
    String modelo;
    Integer puertas;
    Float cilindrada;
    Integer potenciaCv;

    public Coche() {
    }

    public Coche(String marca, String modelo, Integer puertas, Float cilindrada, Integer potenciaCv) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.cilindrada = cilindrada;
        this.potenciaCv = potenciaCv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", cilindrada=" + cilindrada +
                ", potenciaCv=" + potenciaCv +
                '}';
    }
}
