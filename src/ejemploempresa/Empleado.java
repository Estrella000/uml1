/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploempresa;

import java.util.ArrayList;

/**
 *
 * @author estrella
 */
public class Empleado extends Persona {
    /**
     * El sueldo bruto anual en euros.
     */
    private float sueldoBruto;

    /**
     * La empresa para la que trabaja
     */
    private Empresa empresa;

    /**
     * Los directivos que están por encima de la persona en la jerarquía.
     */
    private ArrayList<Directivo> superiores;

    /**
     * Constructor vacío
     */
    public Empleado() {
    }

    /**
     * COnstructor con todos los atributos:
     * @param nombre
     * @param edad
     * @param sueldoBruto
     * @param empresa
     * @param superiores
     */
    public Empleado(String nombre, int edad, float sueldoBruto, Empresa empresa, ArrayList<Directivo> superiores) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
        this.empresa = empresa;
        this.superiores = superiores;
    }

    /**
     * Sobrescribe el método de la clase madre
     * @see Persona#mostrar()
     */
    @Override
    public void mostrar() {
        super.mostrar();
    }

    /**
     * Calcula el salario neto teniendo en cuenta 14 pagas al año
     */
    public float calcularSalarioNeto() {
        return sueldoBruto / 14;
    }
}
