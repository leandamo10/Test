package Test4;

import java.util.ArrayList;

public class Vendedor extends EmpleadoConAuto {

    private String celular;
    private String area;
    private double comisiones;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Vendedor(String nombre, String apellido, int dni, String direccion, String telefono, double sueldo) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
        this.celular = celular;
        this.area = area;
    }

    @Override
    public void aumentarSalario(double aumento) {
        aumento = aumento + (aumento * 0.1) + getSueldo();
        setSueldo(aumento);
    }

    @Override
    public String toString(Empleado e) {
        return ("Nombre: " + getNombre() + " " + getApellido() + "\nCargo: " + getClass().getSimpleName() + "\nDNI: " + getDni() + "\nDireccion: " + getDireccion() + "\nAntiguedad: "
                + getAntiguedad() + "\nTelefono: " + getTelefono() + "\nCelular: " + getCelular() + "\nSueldo: " + getSueldo() + "\nSupervisor: " + getSupervisor()
                + "\nArea de venta: " + area  + "\nCoche: " + getCoche() + "\n");
    }
    @Override
    public String toString(){
        return (getNombre()+ " " + getApellido());
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public Cliente crearCliente(String nombre, String apellido, int dnicliente) {
        Cliente C = new Cliente(nombre, apellido, dnicliente);
        listaClientes.add(C);
        return C;
    }

    public void borrarCliente(int dnicliente) {
        for (int i = 0;i <listaClientes.size();i++){
            if (dnicliente == listaClientes.get(i).getDniCliente()){
                listaClientes.remove(i);
            }
        }

        }






    public void imprimirListaClientes() {
        System.out.println(listaClientes.toString());
    }
}





