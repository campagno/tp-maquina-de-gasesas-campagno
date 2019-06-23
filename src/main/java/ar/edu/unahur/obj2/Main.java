package ar.edu.unahur.obj2;

public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();
        ConDinero conDinero = new ConDinero();
        ConDineroSuficiente conDineroSuficiente = new ConDineroSuficiente();
        SinStock sinStock = new SinStock();
        Persona persona = new Persona("Cliente",20);

        Maquina maquina = new Maquina(3,10,5,lista);
        maquina.setPersona(persona);

        persona.presionarPalanca(maquina);

        persona.insertarDinero(maquina,4);
        persona.presionarPalanca(maquina);
        persona.insertarDinero(maquina,1);
        persona.presionarPalanca(maquina);

        System.out.println(maquina.getStockGaseosas());

        persona.insertarDinero(maquina,5);
        persona.presionarPalanca(maquina);

        persona.insertarDinero(maquina,7);
        persona.presionarPalanca(maquina);

        System.out.println(maquina.getCantDinero());
        System.out.println(persona.getDinero());
        persona.presionarPalanca(maquina);

        maquina.setStockGaseosas(2);

        persona.insertarDinero(maquina,5);
        persona.presionarPalanca(maquina);
        System.out.println(maquina.getStockGaseosas());
        System.out.println(persona.getDinero());


    }
}
