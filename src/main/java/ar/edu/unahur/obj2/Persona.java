package ar.edu.unahur.obj2;

public class Persona {

    private String nombre;
    private int dinero;

    public Persona(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public void presionarPalanca (Maquina maquina) {
        maquina.palancaPresionada();
    }
    public void insertarDinero (Maquina maquina, int cantidadDinero) {
        maquina.ingresarDInero(cantidadDinero, maquina);
        this.setDinero(this.getDinero()-cantidadDinero);
    }

}
