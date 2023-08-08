package com.mycompany.co.edu.unipiloto.estdatos.enumeration.estdatos;



/**
 *
 * @author Alejandra
 */
public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alejandra ", Categoria.FINANZAS, Nivel.JUNIOR);
        Empleado empleado2 = new Empleado("Andres", Categoria.MARKETING, Nivel.SENIOR);
        Empleado empleado3 = new Empleado("Daniel", Categoria.VENTAS, Nivel.INTERMEDIO);
        Empleado empleado4 = new Empleado("Camila", Categoria.TECNOLOGIA, Nivel.INTERMEDIO);

        
        System.out.println("Información:");
        System.out.println("Empleado 1 ---- " + empleado1);
        System.out.println("Empleado 2 ---- " + empleado2);
        System.out.println("Empleado 3 ---- " + empleado3);
        System.out.println("Empleado 4 ----" + empleado4);
        
         Nivel buscarN = Nivel.JUNIOR;
        switch (buscarN) {
            case JUNIOR:
                System.out.println(empleado3.getNombre() + " tiene el nivel JUNIOR");
                break;
            case INTERMEDIO:
                System.out.println(empleado3.getNombre() + " tiene el nivel INTERMEDIO");
                break;
            case SENIOR:
                System.out.println(empleado3.getNombre() + " tiene el nivel SENIOR");
                break;
            default:
                System.out.println(empleado3.getNombre() + " no tiene el nivel " + buscarN);
                break;
        }
        
        empleado1.setCategoria(Categoria.VENTAS);
        empleado1.setNivelExperiencia(Nivel.INTERMEDIO);
        empleado2.setCategoria(Categoria.TECNOLOGIA);
        empleado2.setNivelExperiencia(Nivel.JUNIOR);
        empleado3.setCategoria(Categoria.MARKETING);
        empleado3.setNivelExperiencia(Nivel.JUNIOR);
        empleado4.setCategoria(Categoria.FINANZAS);
        empleado4.setNivelExperiencia(Nivel.SENIOR);
        
         System.out.println("\nInformación actualizada de los empleados:");
          System.out.println("Empleado 1 ---- " + empleado1);
        System.out.println("Empleado 2 ---- " + empleado2);
        System.out.println("Empleado 3 ---- " + empleado3);
        System.out.println("Empleado 4 ----" + empleado4);
         
        
        
        


        
    }
    
}
