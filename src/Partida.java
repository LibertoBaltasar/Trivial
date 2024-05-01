import Menus.GestionJugadores;
import Utils.Constantes;

public class Partida {
    Jugadores[] jugadores;
    int numTurnos;

    public Partida(int numTurnos, int numJugadores) {
        int jugadoresIntroducidos=0;
        String nombreJugador="**********";
        boolean jugadorValidado;
        jugadores= new Jugadores[numJugadores];
        while(numJugadores>jugadoresIntroducidos) {
            jugadorValidado=false;
            System.out.println(Constantes.mensajePreguntaJugador);
            // TODO: 30/04/2024 añadir teclado
            jugadorValidado=GestionJugadores.validarJugador(nombreJugador);
            if (jugadorValidado){
                jugadores[jugadoresIntroducidos]=GestionJugadores.buscarJugador();
                jugadoresIntroducidos++;
            }
        }
        this.numTurnos = numTurnos;
    }
}
