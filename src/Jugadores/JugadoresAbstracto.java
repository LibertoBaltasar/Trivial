package Jugadores;

public abstract class JugadoresAbstracto {
    private int puntuacion;
    private String nombre;
    public void sumarPuntuacion(){
        this.puntuacion++;
    }
    public abstract char responderLengua();
    public abstract char responderIngles();
    public abstract char responderMatematicas();
    public int getPuntuacion() {
        return puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

}
