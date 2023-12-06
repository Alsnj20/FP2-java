package Cartas;

import java.util.ArrayList;
public class Jugador {
    private String name;
    private ArrayList<Carta> baraja = new ArrayList<>();
    private Baraja cartas;
    public Jugador(String n){
        name = n;
    }
    public ArrayList<Carta> getCartas(){
        return baraja;
    }
    public void displayCart(){
        
    }
}
