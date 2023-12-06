package Cartas;

import java.util.ArrayList;
//clase jugador
public class JuegoCartas {
    public static void main(String[] args) {
        ArrayList<Carta> jugador1 = new ArrayList<>();
        ArrayList<Carta> jugador2 = new ArrayList<>();
        Baraja bar = new Baraja();
        bar.iniciarCarta();
        bar.mezclar();
        bar.repartirCartas(jugador1, jugador2);
        System.out.println("---------INICIANDO JUEGO---------------------");
        while(!jugador1.isEmpty() && !jugador2.isEmpty()){
            System.out.println("Poniendo Carta en la mesa");
            Carta j1 = choose(jugador1);
            Carta j2 = choose(jugador2);
            System.out.println("J1: "+j1+"|------|J2: "+j2);
            if(mostCard(j1, j2) == 1){
                System.out.println("Jugador 1 gana");
                System.out.println(j1);
                jugador1.add(j2); jugador2.remove(j2);
            }else{
                System.out.println("Jugador 2 gana");
                System.out.println(j2);
                jugador2.add(j1); jugador1.remove(j1);
            }
        }
        String ganador = (jugador1.size() != 0)?"Jugador1": "Jugador2";
        System.out.println(jugador1.size());
        System.out.println(jugador2.size());
        System.out.println("El ganador es :"+ganador);
    }
    public static void displayCartasPlay(ArrayList<Carta> j){
        for(Carta c: j)
         System.out.println(c);
    }
    public static Carta choose(ArrayList<Carta> j){
        int n = (int)(Math.random()*j.size());
        Carta c = j.get(n);
        j.remove(c);//sin cartas repetidas el jugador solo ganara el que tenga una carta
        return c;
    }
    public static int getNumberValue(String valorCarta) {
        if (valorCarta.equals("A")) {
            return 14;
        } else if (valorCarta.equals("K")) {
            return 13;
        } else if (valorCarta.equals("Q")) {
            return 12;
        } else if (valorCarta.equals("J")) {
            return 11;
        } else {
            return Integer.parseInt(valorCarta);
        }
    }
    public static int mostCard(Carta c1, Carta c2){
        int a = getNumberValue(c1.getValor());
        int b = getNumberValue(c2.getValor());
        if(a>=b) return 1;
        else return -1;
    }
}
