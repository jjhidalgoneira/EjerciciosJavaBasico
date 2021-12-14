package es.xadrez;

public class Main {

    static CocheCRUD cocheCRUD= new CocheCRUDImpl();

    public static void main(String[] args) {



        cocheCRUD.save(new Coche("Mercedes","Vaneo",5,2.0f,130));
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche("Mercedes","Vaneo",5,2.0f,130));
    }
}
