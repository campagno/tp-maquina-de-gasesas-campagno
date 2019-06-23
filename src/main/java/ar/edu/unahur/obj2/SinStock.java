package ar.edu.unahur.obj2;

public class SinStock implements EstadoMaquina {

    Maquina maquina;
    Lista lista;


    @Override
    public void palancaPresionada(Maquina maquina) {

        System.out.println("No Hay Gaseosas Disponibles");

    }

    @Override
    public void ingresarDInero(int cantidad, Maquina maquina) {

        maquina.darVuelto(cantidad);
    }
}
