// Laboratorio Nro 2 - Ejercicio1
//Autor: Mariel Jara
import java.util.Scanner;
public class Juego_Ahorcado {
    public static void main(String[] args) {
        String ahor1 = 
                " +---+ \n" +
                " |   | \n" +
                "     | \n" +
                "     | \n" +
                "     | \n" +
                "     | \n" +
                "========= ";
        String ahor2 = 
                " +---+ \n" +
                " |   | \n" +
                " O   | \n" +
                "     | \n" +
                "     | \n" +
                "     | \n" +
                "=========";

        String ahor3 =  
                " +---+ \n" +
                " |   | \n" +
                " O   | \n" +
                " |   | \n" +
                "     | \n" +
                "     | \n" +
                "=========";

        String ahor4 = 
                " +---+ \n" +
                " |   | \n" +
                " O   | \n" +
                "/|   | \n" +
                "     | \n" +
                "     | \n" +
                "=========";

        String ahor5 = 
                " +---+ \n" +
                " |   | \n" +
                " O   | \n" +
                " /|\\| \n" +
                "     | \n" +
                "     | \n" +
                "=========";

        String ahor6 = 
                " +---+ \n" +
                " |   | \n" +
                " O   | \n" +
                " /|\\| \n" +
                " /   | \n" +
                "     | \n" +
                "=========";

        String ahor7 = 
                " +---+ \n" +
                " |   | \n" +
                " O   | \n" +
                " /|\\| \n" +
                " / \\| \n" +
                "     | \n" +
                "=========";

        String[] figuras = { ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7 };
        String[] palabras = { "programacion", "java", "indentacion", "clases", "objetos", "desarrollador", "pruebas" };
        String palSecreta = getPalabraSecreta(palabras);
        System.out.println(figuras[0]);
        System.out.println(mostrarBlancos(palSecreta));//muestra para completar
        // COMPLETAR Y/O CORREGIR PARA QUE FUNCIONE EL JUEGO
        String wordM = mostrarBlancos(palSecreta);
        int contador = 1;
        Boolean gano = false;
        while (contador <= 6) { // intentos
            String letra = ingreseLetra();
            if (palSecreta.contains(letra)) {
                String letraActualizada = mostrarBlancosActualizados(letra, palSecreta);
                wordM = combinarPalabras(wordM, letraActualizada);
                System.out.println(wordM);
                if ((vaciarSpace(wordM)).equals(palSecreta)) {
                    System.out.println("Encontro la palabra");
                    gano = true;
                    break;
                }
            } else {
                System.out.println(figuras[contador]);
                contador++;
            }
        }
        // COMPLETAR PARA INDICAR SI GANÓ, PERDIÓ Y CUÁNTOS TURNOS NECESITÓ
        if(gano){
            System.out.println("Usted gano con: "+contador+" intentos de "+6);
        }else{
            System.out.println("Usted perdio. Intentelo Nuevamente");
            System.out.println("La Palabra a adivinar era: "+palSecreta);
        }   
        System.out.println("\n");
    }
    public static String getPalabraSecreta(String [] lasPalabras){
        int ind;
        int indiceMayor = lasPalabras.length -1;
        int indiceMenor =0;
        ind = (int) (Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor);
        String palSecreta = lasPalabras[ind];
        return palSecreta; //seleccionando una palabra al azar.
    }
    public static String mostrarBlancos(String palabra) {
        String vacio ="";
        for (int i = 0; i < palabra.length(); i++)
            vacio += "_ ";
        return vacio;
    }
    public static String ingreseLetra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        String laLetra = sc.next();
        while (laLetra.length() != 1 && (laLetra.charAt(0)>='a' && laLetra.charAt(0)<='z')) { // COMPLETAR PARA VALIDAR CARACTERES PERMITIDOS a-z
            System.out.println("Ingrese letra: ");
            laLetra = sc.next();
        }
        return laLetra;
    }
    public static boolean letraEnPalabraSecreta(String letra, String palSecreta) {
        // COMPLETAR
        return (palSecreta.contains(letra))? true : false;
    }
    public static String mostrarBlancosActualizados(String letra,String palabraAdivinada) {
        String vacio= "";
        // COMPLETAR
        for (int i = 0; i < palabraAdivinada.length(); i++) {
            if(palabraAdivinada.substring(i, i+1).equals(letra) ){
                vacio +=letra+" ";
            
            }else{
                vacio += "_ ";
            }
        }
        return vacio;
    }
    public static String combinarPalabras(String word1, String word2) {
        String vacio="";
        System.out.println("PROCESANDO.....");
        for (int i = 0; i < word2.length(); i++) {
            String word1l = word1.substring(i, i+1);
            String word2l = word2.substring(i, i+1);
            if(word1l.equals(word2l)){
                vacio +=word1l.charAt(0);
            }else if(word1l.charAt(0)>='a' && word1l.charAt(0)<='z'){
                vacio +=word1l.charAt(0);
            }else if(word2l.charAt(0)>='a' && word2l.charAt(0)<='z'){
                vacio +=word2l.charAt(0);
            }else{
                vacio +="";
            }
        }
        return vacio;
    }
    public static String vaciarSpace(String word){
        String vacio = "";
        for (int i = 0; i < word.length(); i++) {    
            if(word.charAt(i) != ' '){
                vacio +=word.charAt(i);
            }
        }
        return vacio;
    }
}