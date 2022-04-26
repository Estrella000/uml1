/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploempresa;

/**
 *
 * @author estrella
 */
public class Main {
    
    public static void main(String[] args) {
        // Nueva empresa sin empleados ni clientes
        Empresa empresa = new Empresa("Nombre Empresa", null);

        //nuevo empleado
        Empleado empleado = new Empleado("Pepe garcia", 38, 1000, empresa, null);
        empresa.addEmpleado(empleado);
        empleado = new Empleado("Carlos González", 52, 60000, empresa, null);
        empresa.addEmpleado(empleado);
        Cliente cliente = new Cliente("Medias Puri", 10, "555-012-345", null);
        // Asociar cliente y empresa entre sí
        empresa.addCliente(cliente);
        cliente.addEmpresa(empresa);
        // Nuevo empleado y asociar a empresa String nombre, int edad, float sueldoBruto, Empresa empresa,
        //ArrayList<Directivo> superiores, int categoria, ArrayList<Empleado> subordinados) {
        
        empresa.mostrarPlantilla();
        System.out.println("añadimos jefe");
        Directivo nuevojefe = new Directivo("superboss", 49, 80000, empresa, null, 345, empresa.getEmpleados());
        empresa.addEmpleado(nuevojefe);
        
        empresa.mostrarPlantilla();
    }
}
