package ar.edu.unahur.obj2;

public class ConDinero implements EstadoMaquina {

    Maquina maquina;
    ConDineroSuficiente conDineroSuficiente = new ConDineroSuficiente();

    @Override
    public void palancaPresionada(Maquina maquina) {

            System.out.println("Restan Ingresar $" + (maquina.getPrecioGaseosa()-maquina.getDineroIngresado()));

    }

    @Override
    public void ingresarDInero(int cantidad, Maquina maquina) {

        maquina.setDineroIngresado(maquina.getDineroIngresado() + cantidad);
        if (maquina.getDineroIngresado() >= maquina.getPrecioGaseosa()) {
            maquina.setEstadoMaquina(conDineroSuficiente);
        }

    }
}
