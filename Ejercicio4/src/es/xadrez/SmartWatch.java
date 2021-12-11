package es.xadrez;

public class SmartWatch extends SmartDevice{
    String materialCorrea;
    String colorCorrea;
    String memInterna;
    Boolean reloj;
    Boolean cuentapasos;
    Boolean cardio;
    Boolean velocidad;
    Boolean distancia;
    Boolean musica;

    public SmartWatch() {
    }



    public SmartWatch(String fabricante, String modelo, Float pantallaPulgadas, String resolucion,
                      String color, boolean GPS, float bateriamAh, float duracion, String materialCorrea,
                      String colorCorrea, String memInterna, Boolean reloj, Boolean cuentapasos,
                      Boolean cardio, Boolean velocidad, Boolean distancia, Boolean musica) {
        super(fabricante, modelo, pantallaPulgadas, resolucion, color, GPS, bateriamAh, duracion);
        this.materialCorrea = materialCorrea;
        this.colorCorrea = colorCorrea;
        this.memInterna = memInterna;
        this.reloj = reloj;
        this.cuentapasos = cuentapasos;
        this.cardio = cardio;
        this.velocidad = velocidad;
        this.distancia = distancia;
        this.musica = musica;


    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pantallaPulgadas=" + pantallaPulgadas +
                ", resolucion='" + resolucion + '\'' +
                ", color='" + color + '\'' +
                ", GPS=" + GPS +
                ", bateriamAh=" + bateriamAh +
                ", duracion=" + duracion +
                ", materialCorrea='" + materialCorrea + '\'' +
                ", colorCorrea='" + colorCorrea + '\'' +
                ", memInterna='" + memInterna + '\'' +
                ", reloj=" + reloj +
                ", cuentapasos=" + cuentapasos +
                ", cardio=" + cardio +
                ", velocidad=" + velocidad +
                ", distancia=" + distancia +
                ", musica=" + musica +
                '}';
    }
}

