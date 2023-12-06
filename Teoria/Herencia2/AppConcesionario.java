package Herencia2;

public class AppConcesionario {
    public static void main(String[] args) {
        Person p1 = new Person("Paola", "Torres", 46987623, "963291911");
        p1.display();
        System.out.println("-------------------------------------");
        Gerente elGerente = new Gerente ("Alisson", "Jara", 74858732, "956873234", 32, "CalleNueva 204", 6500 );     
        elGerente.display();
        Vendedor vend1 = new Vendedor ("Nicole", "Palo", 40918663, "948584858",25, 5, 86.5);
        Vendedor vend2 = new Vendedor ("Fabian", "Lomas", 29624821, "948456485", 15, 3, 76.5);
        Concesionario miEmpresa = new Concesionario ("Mejores Carros",elGerente, "Calle Peru 305", "456235");
        miEmpresa.addVendedor (vend1);//agregacion 
        miEmpresa.addVendedor (vend2); 
        miEmpresa.addAuto (new Auto ("BMW a", "A", 2005)); //composicion
        miEmpresa.addAuto (new Auto ("Tico x", "C", 2013)); 
        miEmpresa.addAuto (new Auto ("Combi y", "D", 2009));
        miEmpresa.imprimirEstatus ();
        Concesionario competencia = new Concesionario("Ultimos Modelos", elGerente, "Dean Valdivia 300", "398663");
        competencia.addAuto(new Auto("Bus 10", "M", 2015));
        competencia.addAuto(new Auto("CAR 21","J", 2019));
        competencia.addVendedor(vend2);
        competencia.imprimirEstatus();
    }
}
