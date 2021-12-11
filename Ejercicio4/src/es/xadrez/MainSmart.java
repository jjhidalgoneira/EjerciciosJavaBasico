package es.xadrez;

public class MainSmart {
    public static void main(String[] args) {

        SmartPhone LG_G4 = new SmartPhone("LG", "G4", 5.5f, "2048x1024", "oro",
                true, 5000.0f, 24.0f, 4, false, true, true, 64,
                64, 128);
        SmartWatch miFit = new SmartWatch("mi", "miFit", 2.0f, "200x300", "negro",
                true, 200f, 48f, "Plástico", "negra", "16Mb", true,
                true, true, true, true, true);

        System.out.println(LG_G4);
        System.out.println(miFit);
    }

}