package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaquinaTest {

    private Maquina maquina;
    private Persona persona;
    private EstadoMaquina estadoMaquina;

    private Lista lista;
    private ConDinero conDinero;
    private ConDineroSuficiente conDineroSuficiente;
    private SinStock sinStock;

    @BeforeTest
    public void setupTest(){

        lista = new Lista();
        conDinero = new ConDinero();
        conDineroSuficiente = new ConDineroSuficiente();
        sinStock = new SinStock();
        persona = new Persona("Cliente",20);

        maquina = new Maquina(3,10,5,lista);
        maquina.setPersona(persona);

    }

    @Test
    public void MaquinaTest() {

        persona.presionarPalanca(maquina);

        assertEquals(10,maquina.getCantDinero());
        assertEquals(3,maquina.getStockGaseosas());
        assertEquals(20,persona.getDinero());

        persona.insertarDinero(maquina,7);
        persona.presionarPalanca(maquina);

        assertEquals(2,maquina.getStockGaseosas());
        assertEquals(15,persona.getDinero());
        assertEquals(15,maquina.getCantDinero());

        persona.insertarDinero(maquina,5);
        persona.presionarPalanca(maquina);

        persona.insertarDinero(maquina,5);
        persona.presionarPalanca(maquina);

        assertEquals(25,maquina.getCantDinero());
        assertEquals(5,persona.getDinero());
        assertEquals(0,maquina.getStockGaseosas());

        persona.presionarPalanca(maquina);
        persona.insertarDinero(maquina,5);

        assertEquals(5,persona.getDinero());

        maquina.setStockGaseosas(10);

        persona.presionarPalanca(maquina);

        assertEquals(10,maquina.getStockGaseosas());
        assertEquals(5,persona.getDinero());

        persona.insertarDinero(maquina,5);
        persona.presionarPalanca(maquina);

        assertEquals(9,maquina.getStockGaseosas());
        assertEquals(0,persona.getDinero());
        assertEquals(30,maquina.getCantDinero());



    }


}