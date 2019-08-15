package Test4;

public class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellido, int dni, String direccion, String telefono, double sueldo) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
        this.fax = fax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public void aumentarSalario(double aumento) {
        aumento = aumento + (aumento * 0.05) + getSueldo();
        setSueldo(aumento);
    }


    @Override
    public String toString(Empleado empleado) {
        return ("Nombre: " + getNombre() + " " + getApellido() + "\nCargo: " + getClass().getSimpleName() + "\nDNI: " + getDni() + "\nDireccion: " + getDireccion() + "\nAntiguedad: "
                + getAntiguedad() + "\nTelefono: " + getTelefono() + "\nFax: " + getFax() +"\nSueldo: " + getSueldo() + "\nSupervisor: " + getSupervisor() + "\nDespacho: "
                + getDespacho() +  "\n");
    }


}