package ar.edu.unahur.obj2;

public class DineroSobrante implements EstadoMaquina {


    @Override
    public void presionarPalanca(Maquina maquina) {
        System.out.println("Disfrute su Bebida");
        maquina.setStockDeBebidas(maquina.getStockDeBebidas() -1);
        System.out.println("Su Vuelto es $" + (maquina.getDineroRecibido()-maquina.getPrecioGaseosa()));
    }
}
