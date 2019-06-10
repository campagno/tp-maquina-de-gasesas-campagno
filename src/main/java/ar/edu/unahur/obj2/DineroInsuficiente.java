package ar.edu.unahur.obj2;

public class DineroInsuficiente implements EstadoMaquina {

    @Override
    public void presionarPalanca(Maquina maquina) {
        System.out.println("Restan Ingresar $"+ (maquina.getPrecioGaseosa() - maquina.getDineroRecibido()));
    }
}
