package ar.edu.unahur.obj2;

public class ConDineroSuficiente implements EstadoMaquina {

    Maquina maquina;
    Lista lista;
    SinStock sinStock;
    private int vuelto;

    @Override
    public void palancaPresionada(Maquina maquina) {

        System.out.println(" Disfrute su Gaseosa ");
        System.out.println(" Su Vuelto Es $" + (vuelto = maquina.getDineroIngresado()-maquina.getPrecioGaseosa()));
        maquina.setCantDinero(maquina.getPrecioGaseosa()+maquina.getCantDinero());

        if (( vuelto > 0 )) {
            maquina.darVuelto(vuelto);
        }
        maquina.setStockGaseosas(maquina.getStockGaseosas()-1);
        if (maquina.getStockGaseosas()==0){
            maquina.setEstadoMaquina(sinStock = new SinStock());
        }
        maquina.setEstadoMaquina(lista = new Lista());

    }

    @Override
    public void ingresarDInero(int cantidad, Maquina maquina) {

    }
}
