
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
        // leer un nombre
        // mostrar los datos de la nave con dicho nombre, mensaje de “no encontrado” en
        // caso contrario
        System.out.println("Ingrese el nombre de la nave a buscar: ");
        String nombre = sc.next();
        int pos = busquedaLinealNombre(misNaves, nombre);
        if (pos != -1) {
            System.out.println("La nave se ha encontrado " + misNaves[pos]);
        } else {
            System.out.println("No encontrado");
        }
        System.out.println("--------------------------------------------------------------------");
        ordenarPorPuntosBurbuja(misNaves);
        mostrarNaves(misNaves);
        System.out.println("--------------------------------------------------------------------");
        ordenarPorNombreBurbuja(misNaves);
        mostrarNaves(misNaves);
        System.out.println("--------------------------------------------------------------------");
        // mostrar los datos de la nave con dicho nombre, mensaje de “no encontrado” en
        // caso contrario
        pos = busquedaBinariaNombre(misNaves, nombre);
        if (pos != -1) {
            System.out.println("La nave se ha encontrado " + misNaves[pos]);
        } else {
            System.out.println("No encontrado");
        }
        System.out.println("--------------------------------------------------------------------");
        ordenarPorPuntosSeleccion(misNaves);
        mostrarNaves(misNaves);
        System.out.println("--------------------------------------------------------------------");
        ordenarPorNombreSeleccion(misNaves);
        mostrarNaves(misNaves);
        System.out.println("--------------------------------------------------------------------");
        ordenarPorPuntosInsercion(misNaves);
        mostrarNaves(misNaves);
        System.out.println("--------------------------------------------------------------------");
        ordenarPorNombreInsercion(misNaves);
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
            if (flota[i].getPuntos() > flota2.getPuntos()) {
                flota2 = flota[i];
            }
        }
        return flota2;
    }
    // Método para buscar la primera nave con un nombre que se pidió por teclado
    public static int busquedaLinealNombre(Nave[] flota, String s) {
        for (int i = 0; i < flota.length; i++) {
            if (flota[i].getNombre().equals(s)) {
                return i;
            }
        }
        return -1;
    }
    // Método que ordena por número de puntos de menor a mayor
    public static void ordenarPorPuntosBurbuja(Nave[] flota) {
        for (int i = 0; i < flota.length; i++) {
            for (int j = 0; j < flota.length - 1 - i; j++) {
                if (flota[j].getPuntos() > flota[j + 1].getPuntos()) {
                    Nave tempo = flota[j];
                    flota[j] = flota[j + 1];
                    flota[j + 1] = tempo;
                }
            }
        }
    }
    // Método que ordena por nombre de A a Z
    public static void ordenarPorNombreBurbuja(Nave[] flota) {
        for (int i = 0; i < flota.length; i++) {
            for (int j = 0; j < flota.length - 1 - i; j++) {
                String word1 = flota[j].getNombre();
                String word2 = flota[j + 1].getNombre();
                if (word1.compareTo(word2) > 0) {
                    Nave tempo = flota[j];
                    flota[j] = flota[j + 1];
                    flota[j + 1] = tempo;
                }
            }
        }
    }
    // Método para buscar la primera nave con un nombre que se pidió por teclado
    public static int busquedaBinariaNombre(Nave[] flota, String s) {
        int baja = 0;
        int alta = flota.length - 1;
        while (baja <= alta) {
            int media = (baja + alta) / 2;
            String name = flota[media].getNombre();
            int comparar = s.compareTo(name);
            if (comparar == 0) {
                return media;
            } else if (comparar < 0) {
                alta = media - 1;
            } else {
                baja = media + 1;
            }
        }
        return -1;
    }
    // Método que ordena por número de puntos de menor a mayor
    public static void ordenarPorPuntosSeleccion(Nave[] flota) {
        for (int i = 0; i < flota.length; i++) {
            int index = i;
            for (int j = i + 1; j < flota.length; j++) {
                if (flota[j].getPuntos() < flota[index].getPuntos()) {
                    index = j;
                }
            }
            Nave tempo = flota[i];
            flota[i] = flota[index];
            flota[index] = tempo;
        }
    }
    // Método que ordena por nombre de A a Z
    public static void ordenarPorNombreSeleccion(Nave[] flota) {
        for (int i = 0; i < flota.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < flota.length; j++) {
                String word2 = flota[j].getNombre();
                String word1 = flota[index].getNombre();
                if (word1.compareTo(word2)>0){
                    index = j;//menor valor 
                }
            }
            Nave temp = flota[i];
            flota[i] = flota[index];
            flota[index] = temp;
        }
    }
    // Método que muestra las naves ordenadas por número de puntos de mayor a menor
    public static void ordenarPorPuntosInsercion(Nave[] flota) {
        for (int i = 0; i < flota.length; i++) {
            Nave naveT = flota[i];
            int j = i - 1;
            while (j >= 0 && flota[j].getPuntos() < naveT.getPuntos()) {
                flota[j + 1] = flota[j];
                j--;
            }
            flota[j + 1] = naveT;
        }
    }
    // Método que muestra las naves ordenadas por nombre de Z a A
    public static void ordenarPorNombreInsercion(Nave[] flota) {
        for (int i = 1; i < flota.length; i++) {
            Nave naveActual = flota[i];
            int j = i - 1;
            String word1 = naveActual.getNombre();
            
            while (j >= 0 && word1.compareTo(flota[j].getNombre()) > 0) {
                flota[j + 1] = flota[j];
                j--;
            }
            flota[j + 1] = naveActual;
        }
    }
}