package Menus;

import Utils.Constantes;

public class MenuPrincipal implements MenusInterfaz {

    @Override
    public void iniciarMenu() {
        int opcion=0;
        while(opcion!=5){
            try {
                System.out.println("1.-Jugar Partida");
                System.out.println("2.-Ranking");
                System.out.println("3.-Histórico");
                System.out.println("4.-Jugadores");
                System.out.println("5.-Salir");
                // TODO: 25/04/2024 añadir teclado
                if (opcion < 1 && opcion > 5) {
                    System.out.println("introduce un valor entre los especificados");
                } else {
                    MenuPrincipal.elegirOpcion(opcion);
                }
            }catch (Exception){

            }finally{

            }
        }
    }
    public void elegirOpcion(int opcion){
        switch(opcion){
            case 1:
                System.out.println(Constantes.mensajeSeleccionPartida);
                PartidaMenu.iniciarMenu;
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
                JugadoresMenu.iniciarMenu;
            case 5:
                System.out.println(Constantes.mensajeSeleccionSalir);
                break;

        }
    }
}
