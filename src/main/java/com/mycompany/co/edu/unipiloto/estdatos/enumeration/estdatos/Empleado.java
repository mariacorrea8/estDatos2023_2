package com.mycompany.co.edu.unipiloto.estdatos.enumeration.estdatos;

/**
 *
 * @author Alejandra
 */
enum Categoria {
    TECNOLOGIA,
    FINANZAS,
    VENTAS,
    MARKETING
}

enum Nivel {
    SENIOR,
    JUNIOR,
    INTERMEDIO,

}

public class Empleado {

    private String nombre;
    private Categoria categoria;
    private Nivel nivelExperiencia;

    public Empleado(String nombre, Categoria categoria, Nivel nivelExperiencia) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.nivelExperiencia = nivelExperiencia;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", categoria=" + categoria + ", nivelExperiencia=" + nivelExperiencia + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public Nivel getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(Nivel nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public boolean tieneNivel(Nivel nivel) {
        return this.nivelExperiencia == nivel;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
