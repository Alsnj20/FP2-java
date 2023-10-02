/* escribir un programa donde se creen 2 ejércitos, cada uno con un número aleatorio de soldados entre
1 y 5, considerando sólo su nombre. Sus datos se inicializan automáticamente con nombres tales como “Soldado0”,
“Soldado1”, etc. Luego de crear los 2 ejércitos se deben mostrar los datos de todos los soldados de ambos ejércitos
e indicar qué ejército fue el ganador.
Restricción: aplicar arreglos estándar y métodos para inicializar los ejércitos, mostrar ejército y mostrar ejército
ganador. La métrica a aplicar para indicar el ganador es el mayor número de soldados de cada ejército, puede
haber empates. (Todavía no aplicar arreglo de objetos)*/
public class Programa5 {
    public static void main(String[] args) {
        String[] grupo1S = new String[generateSold()];
        String[] grupo2S = new String[generateSold()];
        System.out.println("---------Ejercito 1---------");
        iniciarEjercito(grupo1S);
        mostrarEjercito(grupo1S);
        System.out.println("---------Ejercito 2---------");
        iniciarEjercito(grupo2S);
        mostrarEjercito(grupo2S);
        System.out.println("---------El Ganador es-------");
        mostrarEjercitoganador(grupo1S, grupo2S);
    }
    public static int generateSold(){
        return (int)(Math.random()*5+1);
    }
    public static void mostrarEjercito(String[] ejercito){
        for(String name: ejercito){
            System.out.println(name);
        }
    }
    public static void iniciarEjercito(String[] ejercito){
        for (int i = 0; i < ejercito.length; i++) {
            ejercito[i] = "Soldado"+i; 
        }
    }
    public static void mostrarEjercitoganador(String[] ejercito1, String[] ejercito2){
        if(ejercito1.length == ejercito2.length){
            System.out.println("EMPATE!");
        }else if(ejercito1.length > ejercito2.length){
            System.out.println("El ejercito 1 gana!");
            System.out.println("Integrantes: ");
            mostrarEjercito(ejercito1);
        }else{
            System.out.println("El ejercito 2 gana!");
            System.out.println("Integrantes");
            mostrarEjercito(ejercito2);
        }
    }   
}
