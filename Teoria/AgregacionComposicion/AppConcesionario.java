package AgregacionComposicion;
public class AppConcesionario{
     public static void main(String[] args) { 
        Gerente elGerente = new Gerente ("Alisson", 32, "956873234");
        Vendedor vend1 = new Vendedor ("Nicole Palo", "948584858", 5, 86.5); 
        Vendedor vend2 = new Vendedor ("Fabian Lomas", "948456485", 3, 76.5); 
        Concesionario miEmpresa = new Concesionario ("Mejores Carros",elGerente, "Calle Peru 305", "456235"); 
        miEmpresa.addVendedor (vend1);//agregacion 
        miEmpresa.addVendedor (vend2); 
        miEmpresa.addAuto (new Auto ("BMW a", "A", 2005)); //composicion
        miEmpresa.addAuto (new Auto ("Tico x", "C", 2013)); 
        miEmpresa.addAuto (new Auto ("Combi y", "D", 2009)); 
        miEmpresa. imprimirEstatus ();
    }
}