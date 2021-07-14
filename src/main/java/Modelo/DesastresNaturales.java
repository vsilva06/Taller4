package Modelo;

import java.util.ArrayList;

public class DesastresNaturales {
    private int año;
    private int cantidadDesastre;
    private String tipo;
    private String lugar;
    private int tiempo;
    private ArrayList<Afectados> afectados;
    private Economico economico;

    public DesastresNaturales(int año, int cantidadDesastre, String tipo, String lugar, int tiempo, ArrayList<Afectados> afectados, Economico economico) {
        this.año = año;
        this.cantidadDesastre = cantidadDesastre;
        this.tipo = tipo;
        this.lugar = lugar;
        this.tiempo = tiempo;
        this.afectados = afectados;
        this.economico = economico;
    }
    public void detalleDesastre(){

    }
    public void listaDesaparecidos(){

    }

    public void actualizarListaDesaparecidos(){}

}
