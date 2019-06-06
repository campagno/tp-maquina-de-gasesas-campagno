package ar.edu.unahur.obj2;

import java.util.List;
import java.util.stream.Stream;

public class MaquinaExpendedora {

    private List<Bebida> bebidas;
    private int dineroRecibido;



    public int recibirDinero(int cantidad){
        return dineroRecibido += cantidad;
    }

    public void precionarPalanca() {
        if (dineroRecibido >= bebidas.stream().findAny().get());
    }

}
