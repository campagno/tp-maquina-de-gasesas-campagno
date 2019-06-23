package ar.edu.unahur.obj2;

public class Lista implements EstadoMaquina {

    Maquina maquina;
    ConDinero conDinero;
    ConDineroSuficiente conDineroSuficiente;

    @Override
    public void palancaPresionada(Maquina maquina) {

        System.out.println("El precio de la Gaseosa es $" + maquina.getPrecioGaseosa());

    }

    @Override
    public void ingresarDInero(int cantidad,Maquina maquina) {
        maquina.setDineroIngresado(cantidad);
        if (cantidad >= maquina.getPrecioGaseosa()) {
            maquina.setEstadoMaquina(conDineroSuficiente = new ConDineroSuficiente());
        }
        else {
            maquina.setEstadoMaquina(conDinero = new ConDinero());
        }
    }

}
