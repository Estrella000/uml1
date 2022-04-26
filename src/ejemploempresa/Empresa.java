package ejemploempresa;

import java.util.ArrayList;

/**
 *
 * @author estrella
 */
public class Empresa {

    /**
     * Nombre de la empresa
     */
    private String nombre;

    /**
     * Lista de empleados que trabajan en la empresa
     */
    private final ArrayList<Empleado> empleados;
    /**
     * Lista de clientes a los que presta servicio
     */
    private ArrayList<Cliente> clientes;

    /**
     * Constructor vacío
     */
    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    /**
     * Constructor con nombre y clientes pero sin empleados
     *
     * @param nombre
     * @param clientes
     */
    public Empresa(String nombre, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.empleados = new ArrayList<>();
    }

    /**
     * Añade un cliente a la lista de clientes
     *
     * @param cliente
     */
    public void addCliente(Cliente cliente) {
        if (this.getClientes() == null) {
            this.clientes = new ArrayList<>();
        }
        this.getClientes().add(cliente);
    }

    /**
     * Añade un empleado a la lista de empleados
     *
     * @param empleado
     */
    public void addEmpleado(Empleado empleado) {
        this.getEmpleados().add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        this.getClientes().remove(empleado);
    }
public void mostrarPlantilla(){
    for(int i=0; i<this.getEmpleados().size(); i++){
        this.getEmpleados().get(i).mostrar();
        if(this.getEmpleados().get(i) instanceof Directivo)
            System.out.println("es directivo");
    }
}

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @return the empleados
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}
