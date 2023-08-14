
package co.edu.unipiloto.estdatos.tallergen.mundo;


public class Computador extends Electronico {
    
    public enum SistemaOp{
    LINUX,MICROSOFT,MAC_OS
}
    private SistemaOp sistema;
    
    public Computador(Gama pGama, double pPrecio, SistemaOp sistema) {
        super(pGama, pPrecio);
        this.sistema=sistema;
    }

    @Override
    public String toString() {
        return "Computador{" +"  "+ "Gama= "+gama+ " "+"Precio= "+precio+ " "+ "sistema=" + sistema + '}';
    }

  

   
    
    
}
