//lab A-Mariel Jara
import java.util.*;
public class DemoBatalla {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Nave[] misNaves = new Nave[4];
    String nomb, col;
    int fil, punt;
    boolean est;
    for (int i = 0; i < misNaves.length; i++) {// llenando los datos para cada nave
      System.out.println("Nave " + (i + 1));
      System.out.print("Nombre: ");
      nomb = sc.next();
      System.out.print("Fila: ");
      fil = sc.nextInt();
      System.out.print("Columna: ");
      col = sc.next();
      System.out.print("Estado: ");
      est = sc.nextBoolean();
      System.out.print("Puntos: ");
      punt = sc.nextInt();
      misNaves[i] = new Nave(); // Se crea un objeto Nave y se asigna su referencia a misNaves
      misNaves[i].setNombre(nomb);
      misNaves[i].setFila(fil);
      misNaves[i].setColumna(col);
      misNaves[i].setEstado(est);
      misNaves[i].setPuntos(punt);
    }
    System.out.println("\nNaves creadas:");
    mostrarNaves(misNaves);
    System.out.println("Ingrese Nombre:");
    mostrarPorNombre(misNaves);
    System.out.println("Nave con puntos inferiores o iguales:");
    mostrarPorPuntos(misNaves);
    System.out.println("Nave con mayor número de puntos: \n" + mostrarMayorPuntos(misNaves));
    System.out.println("--------------------------------------------------------------------");
    desordenar(misNaves);
    mostrarNaves(misNaves);
  }
  // Método para mostrar todas las naves
  public static void mostrarNaves(Nave[] flota) {
    for (int i = 0; i < flota.length; i++) {
      System.out.println("Nave " + (i + 1));
      System.out.println(flota[i].toString());
    }
  }
  // Método para mostrar todas las naves de un nombre que se pide por teclado
  public static void mostrarPorNombre(Nave[] flota) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    for (int i = 0; i < flota.length; i++) {
      if (flota[i].getNombre().equals(name)) {
        System.out.println("Nave: " + (i + 1));
        System.out.println(flota[i].toString());
      }
    }
  }
  // Método para mostrar todas las naves con un número de puntos inferior o igual
  // al número de puntos que se pide por teclado
  public static void mostrarPorPuntos(Nave[] flota) {
    Scanner sc = new Scanner(System.in);
    int point = sc.nextInt();
    for (int i = 0; i < flota.length; i++) {
      if (flota[i].getPuntos() <= point) {
        System.out.println("Nave" + (i + 1));
        System.out.println(flota[i].toString());
      }
    }
  }
  // Método que devuelve la Nave con mayor número de Puntos
  public static Nave mostrarMayorPuntos(Nave[] flota) {
    Nave flota2 = flota[0];
    for (int i = 0; i < flota.length; i++) {
      if (flota[i].getPuntos() < flota2.getPuntos()) {
        flota2 = flota[i];
      }
    }
    return flota2;
  }
  // Crear un método que devuelva un nuevo arreglo de objetos con todos los
  // objetos previamente ingresados
  // pero aleatoriamente desordenados
  public static Nave[] desordenar(Nave[] flota){
    for (int i = 0; i < flota.length; i++) {
      int temp = generate(flota.length);
      if(temp !=i){
        Nave tempo = flota[temp]; 
        flota[temp] = flota[i];
        flota[i] = tempo;
      }
    }
    return flota;
  }
  public static int generate(int n) {
    return (int) (Math.random() * n);
  }
}