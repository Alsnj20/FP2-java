
import javax.swing.*;
class Program2{
    public static void main(String[] args) {
        String r1 = JOptionPane.showInputDialog(null, "Ingrese el nombre para reino 1: ");
        String r2 = JOptionPane.showInputDialog(null, "Ingrese el nombre para reino 2: "); 
        String answer = "";
        while(true){
            int n = (int)(Math.random()*(20-5+1)+5);
            int r1P = 0; int r2P = 0; int emp = 0;
            JOptionPane.showMessageDialog(null, "------La Guerra ha comenzado------");
            for (int i = 0; i < n; i++) {
                Soldado s1 = fillSoldado();
                Soldado s2 = fillSoldado();
                clashSoldado(r1, r2, s1, s2);
                if(s1.getLife() > s2.getLife()){
                    r1P++;
                }else if(s1.getLife() < s2.getLife()){
                    r2P++;
                }else{emp++;}
            }
            JOptionPane.showMessageDialog(null, "---------MARCADOR FINAL---------\n"+
                    "Partidas ganadas por "+r1+": "+r1P+"\n"+
                    "Partidas ganadas por "+r2+": "+r2P+"\n"+
                    "Empates: "+emp);
            System.out.println("---------RESULTADO FINAL--------");
            if (r1P == r2P) {
                JOptionPane.showMessageDialog(null, "EMPATE!");
            } else if (r1P > r2P) {
                JOptionPane.showMessageDialog(null, "El reino "+r1+" ha ganado la guerra con:  "+r1P+"/"+n);
            } else {
                JOptionPane.showMessageDialog(null, "El reino " +r2+ " ha ganado la guerra con: " + r2P +"/"+n);
            }
            answer = JOptionPane.showInputDialog("¿Desea iniciar otra batalla? (s/n)");
            if (answer.equals("n")) break;
        }
    }
    public static int generateLife(int m, int n){
        return (int)(Math.random()*(n-m+1)+m);
    }
    public static Soldado fillSoldado(){
        String[] names = {"Arquero", "Espadachin", "Caballero"};
        int n = (int)(Math.random()*names.length);
        String name = names[n];
         int life;
        if(names[n].equals("Arquero")){
                life = generateLife(3,5);
            }else if(names[n].equals("Espadachin")){
                life = generateLife(5,7);
            }else{
                life = generateLife(7,9);
            }
        return new Soldado(name, life);
    }
    public static void clashSoldado(String r1, String r2, Soldado s1, Soldado s2){
        int total = s1.getLife()+s2.getLife();
        double s1P =  (s1.getLife()*100)/total;
        double s2P = (s2.getLife()*100)/total;
        JOptionPane.showMessageDialog(null, r1+":"+s1+" => "+s1P+"%   vs   "+r2+":"+s2+" => "+s2P+"%");
    }
}