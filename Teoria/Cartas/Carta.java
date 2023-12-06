package Cartas;

public class Carta {
    private String valor;
    private String palo;
    public Carta(String p, String v){
        valor = v;
        palo = p;
    }
    public String getValor(){
        return valor;
    }
    public String palo(){
        return palo;
    }
    public String toString(){
        return "Valor: "+valor+"|Palo: "+palo;
    }
}

