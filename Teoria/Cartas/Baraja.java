package Cartas;
import java.util.ArrayList;

import POO_1.Soldado;
public class Baraja {
    ArrayList<Carta> baraja = new ArrayList<>();
    public static final int MAX_COUNT_CART = 52;
    public Baraja(){}
    public void addCarta(Carta c){
        if(baraja.size() < Baraja.MAX_COUNT_CART){
            System.out.println("Ya no hay cartas");
        }else{
            baraja.add(c);
        }
    }
    public void mezclar(){
        for (int i = 0; i < baraja.size(); i++) {
            int n = (int)(Math.random()*baraja.size());
            if(i !=n){
                Carta tempo = baraja.get(i);
                baraja.set(i, baraja.get(n));
                baraja.set(n, tempo);
            }
        }
    }
        
    public void iniciarCarta(){
        String[] name = {"Picas","Corazones","Diamantes","Tréboles"};
        String[] name2 = {"♠","♥","♦","♣"};
        String[] nro ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < nro.length; j++) {
                baraja.add(new Carta(name[i], nro[j]));
            }
        }
        
    }
    public void displayCartas(){
       for(Carta c: baraja)
        System.out.println(c);
    }
    public void repartirCartas(ArrayList<Carta> j1, ArrayList<Carta> j2){
        for (int i = 0; i < Baraja.MAX_COUNT_CART ; i++) {
            if(i >=0 && i<=25)
                j1.add(baraja.get(i));
            else
                j2.add(baraja.get(i));
        }
    }
}
