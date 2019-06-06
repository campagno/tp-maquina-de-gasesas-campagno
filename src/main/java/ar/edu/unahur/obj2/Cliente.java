package ar.edu.unahur.obj2;

public class Cliente {

    String nombre;
    int cantidadDeDinero;
    boolean dineroIngresado = false;

    public void presionarPalanca(MaquinaExpendedora maquina){
        if (dineroIngresado){

        }
        else {

        }
    }



    public void ingresaDinero(MaquinaExpendedora maquina) {
        this.setDineroIngresado(true);


    }

    public void setDineroIngresado(boolean dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }
}
