package ar.edu.unahur.obj2;

import java.util.List;
import java.util.stream.Stream;

public class Maquina {


    Lista lista;

    private EstadoMaquina estadoMaquina;
    private int stockGaseosas;
    private int cantDinero;
    private int precioGaseosa;
    private int dineroIngresado;
    private Persona persona;

    public Maquina(int stockGaseosas, int cantDinero, int precioGaseosa,EstadoMaquina estadoMaquina) {
        this.setEstadoMaquina(estadoMaquina);
        this.stockGaseosas = stockGaseosas;
        this.cantDinero = cantDinero;
        this.precioGaseosa = precioGaseosa;
    }
    public void darVuelto(int vuelto){
        if (vuelto > 0) {
            persona.setDinero(persona.getDinero()+vuelto);
        }
    }

    public int getDineroIngresado() {
        return dineroIngresado;
    }

    public void setDineroIngresado(int dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public EstadoMaquina getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(EstadoMaquina estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public int getStockGaseosas() {
        return stockGaseosas;
    }

    public void setStockGaseosas(int stockGaseosas) {
        this.stockGaseosas = stockGaseosas;
        if (stockGaseosas > 0) {
            this.setEstadoMaquina(lista = new Lista());
        }
    }

    public int getCantDinero() {
        return cantDinero;
    }

    public void setCantDinero(int cantDinero) {
        this.cantDinero = cantDinero;
    }

    public int getPrecioGaseosa() {
        return precioGaseosa;
    }

    public void setPrecioGaseosa(int precioGaseosa) {
        this.precioGaseosa = precioGaseosa;
    }

    public void palancaPresionada() {
        this.getEstadoMaquina().palancaPresionada(this);
    }

    public void ingresarDInero(int cantidadDinero,Maquina maquina) {
        maquina.getEstadoMaquina().ingresarDInero(cantidadDinero,this);
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
