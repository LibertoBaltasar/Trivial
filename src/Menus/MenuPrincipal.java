package Menus;

import Utils.Constantes;

import java.util.Scanner;

public class MenuPrincipal implements MenusInterfaz {

    @Override
    public void iniciarMenu( Scanner teclado) {
        int opcion=0;
        while(opcion!=5){
            try {
                System.out.println("1.-Jugar Partida");
                System.out.println("2.-Ranking");
                System.out.println("3.-Histórico");
                System.out.println("4.-Jugadores");
                System.out.println("5.-Salir");
                opcion=teclado.nextInt();
                // TODO: 25/04/2024 añadir teclado
                if (opcion < 1 && opcion > 5) {
                    System.out.println("introduce un valor entre los especificados");
                } else {
                    this.elegirOpcion(opcion, teclado);
                }
            }catch (Exception){

            }finally{

            }
        }
    }
    public void elegirOpcion(int opcion, Scanner teclado){
        MenusInterfaz menu;
        switch(opcion){
            case 1:
                System.out.println(Constantes.mensajeSeleccionPartida);
                menu =new PartidaMenu();
                menu.iniciarMenu(teclado);
                break;
            case 2:
                System.out.println(Constantes.mensajeSeleccionRanking);
                // TODO: 25/04/2024 rellenar cuando sepa que va en el ranking
                break;
            case 3:
                // TODO: 25/04/2024 rellenar cuando sepa que va en el histórico
                System.out.println(Constantes.mensajeSeleccionHistorico);
                break;
            case 4:
                System.out.println(Constantes.mensajeSeleccionJugadores);
                menu=new GestionJugadores();
                menu.iniciarMenu(teclado);
                break;
            case 5:
                System.out.println(Constantes.mensajeSeleccionSalir);
                break;

        }
    }
}
