package Menus;

import Utils.Constantes;

import java.util.Scanner;

public class PartidaMenu implements MenusInterfaz{
    public void iniciarMenuSeleccionJugadores(){
        System.out.println("1.-Partida Rápida(3 turnos)");
        System.out.println("2.-Partida Corta(5 turnos)");
        System.out.println("3.-Partida Normal(10 turnos)");
        System.out.println("4.-Partida Larga(20 turnos)");
        System.out.println("5.-Salir");
    }
    public void iniciarMenu(Scanner teclado) {
        int opcion = 0;
        int numJugadores=0;
        while (opcion != 5) {
            try {
                System.out.println("1.-Partida Rápida(3 turnos)");
                System.out.println("2.-Partida Corta(5 turnos)");
                System.out.println("3.-Partida Normal(10 turnos)");
                System.out.println("4.-Partida Larga(20 turnos)");
                System.out.println("5.-Salir");
                opcion = teclado.nextInt();
                System.out.println("¿Cuántos jugadores van a jugar?(Introduce un número de 1 a 4");
                numJugadores=teclado.nextInt();
                if (opcion < 1 && opcion > 5) {
                    System.out.println("Introduce un valor entre los especificados en el menú");
                } else if(numJugadores < 1 && numJugadores > 5) {
                    System.out.println("Introduce un número de jugadores válido");
                }else{
                    this.elegirOpcion(opcion);
                    // TODO: 30/04/2024 Añadir los jugadores como opción
                }
            } catch (Exception("Introduce un valor numérico para contestar")) {

            } finally {

            }
        }
    }
    public void elegirOpcion (int opcion) {
        // TODO: 30/04/2024 consultar por qué no funciona
        // TODO: 30/04/2024 llamar al constructor de partida
        Partida partida;
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado partida rápida");
                break;
            case 2:
                System.out.println("Has seleccionado partida corta");

                break;
            case 3:
                System.out.println("Has seleccionado partida normal");

                break;
            case 4:
                System.out.println("Has seleccionado partida larga");
                break;
        }
    }
}
