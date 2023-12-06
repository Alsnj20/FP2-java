package Hora;
/*Crear la clase Hora que sólo tenga el atributo "segundos" para referirse al tiempo. 
En general para todos los métodos, si la cantidad de segundos supera la cantidad de 
segundos que tiene un día, considerar que empezó otro día (desde cero), ejemplo: si se pasa en 2
, considerar que son 0:0:2. Método setUnaHora() para poner una hora específica del día, mostrarHora()
 para imprimir en formato hh:mm:ss, mostrarHoraF() para imprimir en formato hh:mm:ss AM. 
 Además crear aumentarHora(), aumentarMinuto(), aumentarSegundo() que aumentan lo correspondiente; 
 además crear los get que correspondan. Crear el diagrama de clases de UML de la aplicación creada.
  Su clase también debe funcionar con el main() siguiente */
public class Hora {
    private int segundos;
    public Hora(){this(0);}
    public Hora(int s) {
        setSegundos(s);
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 86400) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }
    public void setUnaHora(int segundos) {
        this.segundos = segundos % 86400;
    }

    public void aumentarHora() {
        segundos = (segundos + 3600) % 86400;
    }
    public void aumentarMinuto() {
        segundos = (segundos + 60) % 86400;
    }
    public void aumentarSegundo() {
        segundos = (segundos + 1) % 86400;
    }
    public String toString() {
        int hora = segundos / 3600; 
        int minuto = (segundos % 3600) / 60;
        int segundo = segundos % 60; 
        return hora+":"+minuto+":"+segundo;
    }
    public void mostrarHora(){
        System.out.println(this);
    }public String mostrarHoraF() {
        int h = segundos / 3600;
        int m = (segundos % 3600) / 60;
        int s = segundos % 60;
        String ampm = (h >= 12 )?"PM" : "AM";
        h = h % 12;
        h = (h == 0)?12 : h;
        System.out.println(this+" "+ampm);
    }
}

