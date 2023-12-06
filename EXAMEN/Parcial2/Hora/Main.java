package Hora;
public class Main {
    public static void main(String[] args) {
        Hora h1=new Hora();
        Hora h2=new Hora(5500);
        h1.setUnaHora(86399);
        h1.mostrarHora();
        //h1.mostrarHoraU();
        h1.aumentarSegundo();
        h1.mostrarHora();

        //h1.mostrarHoraU();

        h1.aumentarMinuto();

        h1.mostrarHora();

        //h1.mostrarHoraU();

        h1.aumentarHora();

        h1.mostrarHora();

        //h1.mostrarHoraU();

        h2.mostrarHora();

        //h2.mostrarHoraU();

        //h2.mostrarCantidadObjetos();
    }
}
