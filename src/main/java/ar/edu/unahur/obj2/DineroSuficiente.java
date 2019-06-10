package ar.edu.unahur.obj2;

public class DineroSuficiente implements EstadoMaquina{


    @Override
    public void presionarPalanca(Maquina maquina) {
        System.out.println("Disfrute su Bebida");
        maquina.setStockDeBebidas(maquina.getStockDeBebidas() -1);

    }
}
