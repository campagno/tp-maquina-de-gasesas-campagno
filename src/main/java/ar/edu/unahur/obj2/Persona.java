package ar.edu.unahur.obj2;

public class Persona {

    private int dinero;

    public Persona(int dinero) {
        this.dinero = dinero;
    }

    public void presionarPalanca(Maquina maquina){
        maquina.precionarPalanca();
    }
    public void insertarDinero(Maquina maquina,int cantDinero){
        maquina.setDineroRecibido(cantDinero);
        maquina.setEstado();
        dinero -= cantDinero;
    }
    public void recibirVuelto(Maquina maquina){
        dinero += (maquina.getDineroRecibido()-maquina.getPrecioGaseosa());
        maquina.setDineroRecibido(maquina.getDineroRecibido()-maquina.getDineroSobrante());
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}
