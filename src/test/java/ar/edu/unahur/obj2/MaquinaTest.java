package ar.edu.unahur.obj2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaquinaTest {

    Maquina maquina = new Maquina(3);
    Persona persona = new Persona(40);


    @Test
    public void testPrecionarPalancaSinIngreso() {
        Maquina maquina = new Maquina(3);
        Persona persona = new Persona(40);

        persona.presionarPalanca(maquina);

    }

    @Test
    public void testDineroInsuficiente() {
        Maquina maquina = new Maquina(3);
        Persona persona = new Persona(40);

        persona.insertarDinero(maquina,15);
        assertEquals(15,maquina.getDineroRecibido());
        persona.presionarPalanca(maquina);

    }

    @Test
    public void testDineroJusto() {
        Maquina maquina = new Maquina(3);
        Persona persona = new Persona(40);

        persona.insertarDinero(maquina,20);
        assertEquals(20,maquina.getDineroRecibido());
        persona.presionarPalanca(maquina);
        assertEquals(2,maquina.getStockDeBebidas());
        assertEquals(40 - 20,persona.getDinero());

    }

    @Test
    public void testDineroSobrante() {

        persona.insertarDinero(maquina,30);
        assertEquals(30,maquina.getDineroRecibido());
        persona.presionarPalanca(maquina);
        assertEquals(2,maquina.getStockDeBebidas());
        persona.recibirVuelto(maquina);
        assertEquals(40 - 20,persona.getDinero());


    }

    @Test
    public void testSinStock() {
        Maquina maquina = new Maquina(1);
        Persona persona = new Persona(30);

        persona.insertarDinero(maquina,20);
        assertEquals(20,maquina.getDineroRecibido());
        persona.presionarPalanca(maquina);
        assertEquals(0,maquina.getStockDeBebidas());

        persona.presionarPalanca(maquina);

    }
}