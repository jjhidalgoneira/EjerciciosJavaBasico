package es.xadrez;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("Estoy grabando un coche con el método SAVE");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Estoy encontrando un coche con el método FINDALL");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Estoy borrando un coche con el método DELETE");
    }
}
