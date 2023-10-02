import java.util.*;
class OrdenarString {
    public static void main(String[] args) {
        String[] name = {"abecedario", "Ala", "koala", "Karina", "Maria", "Barbara"};
        String[] list = {"Ala", "abecedario", "Mariel", "casa", "Pato"};
        ordenar(name);
        Arrays.sort(list);
        print(name);
        print(list);  
    }

    public static void ordenar(String[] name) {
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length - 1 - i; j++) {
                if(name[j].compareToIgnoreCase(name[j+1]) > 0) {
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
    }

    public static boolean ordenarWord(String nam, String name) {
        nam = nam.Igno
        int large = Math.min(nam.length(), name.length());
        for (int i = 0; i < large; i+=1) {
            if (nam.charAt(i) > name.charAt(i)) {
                return true;
            }else{ return false;}
        } return false;  
    }
    public static void print(String[] name){
        for (String string : name) {
            System.out.println(string);
        }
    }
    

}

