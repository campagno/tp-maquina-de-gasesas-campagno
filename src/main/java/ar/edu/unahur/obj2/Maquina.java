package ar.edu.unahur.obj2;

import java.util.List;
import java.util.stream.Stream;

public class Maquina {

    private int dineroRecibido;
    private int precioGaseosa = 20;
    private int dineroFaltante;
    private int dineroSobrante;

    private int stockDeBebidas;

    private EstadoMaquina estado = new SinDinero();

    public Maquina(int stockDeBebidas) {
        this.stockDeBebidas = stockDeBebidas;
    }

    public void precionarPalanca(){

        this.getEstado().presionarPalanca(this);
    }

    public void setDineroFaltante() {
        this.dineroFaltante = precioGaseosa - dineroRecibido;
    }


    public int getDineroSobrante() {
        return dineroSobrante;
    }

    public int getDineroFaltante() {
        return dineroFaltante;
    }


    public void setEstado() {
        if (dineroRecibido == 0) { estado = new SinDinero();}
        else if (dineroRecibido < precioGaseosa) {estado = new DineroInsuficiente();}
        else if (dineroRecibido == precioGaseosa) { estado = new DineroSuficiente();}
        else if (dineroRecibido > precioGaseosa) {estado = new DineroSobrante();}
        else {}
    }

    public EstadoMaquina getEstado() {
        return estado;
    }

    public int getDineroRecibido() {
        return dineroRecibido;
    }

    public int getPrecioGaseosa() {
        return precioGaseosa;
    }

    public void setDineroRecibido(int dineroRecibido) {
        this.dineroRecibido = dineroRecibido;

    }

    public int getStockDeBebidas() {
        return stockDeBebidas;
    }

    public void setStockDeBebidas(int stockDeBebidas) {
        if (stockDeBebidas == 0) {estado = new SinStokDeBebidas();}
        this.stockDeBebidas = stockDeBebidas;
    }




}
