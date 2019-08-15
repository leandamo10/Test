package Test4;


import java.util.ArrayList;

public class JefeDeZona extends EmpleadoConAuto {

    private String despacho;
    private Secretario secretario;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();

    public JefeDeZona() {
    }
    public JefeDeZona(String nombre, String apellido, int dni, String direccion, int antiguedad, String telefono, double sueldo) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
    }

    public JefeDeZona(String nombre, String apellido, int dni, String direccion, int antiguedad, String telefono, double sueldo, Coche coche) {
        super(nombre, apellido, dni, direccion, telefono, sueldo, coche);
    }

    @Override
    public String toString(Empleado empleado) {
        return ("Nombre: " + getNombre() + " " + getApellido() + "\nCargo: " + getClass().getSimpleName() + "\nDNI: " + getDni() + "\nDireccion: " + getDireccion() + "\nAntiguedad: "
                + getAntiguedad() + "\nTelefono: " + getTelefono() + "\nSueldo: " + getSueldo() + "\nSecretario personal: " + getSecretario() + "\nDespacho: " + getDespacho()
                + "\nCoche: " + getCoche() + "\n");
    }



    @Override
    public void aumentarSalario(double aumento) {
        aumento = aumento + (aumento * 0.2) + getSueldo();
        setSueldo(aumento);
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        secretario = secretario;
        this.secretario = secretario;
    }

    public void cambiarSecretario(Secretario secretario) {
        secretario = secretario;
        this.secretario = secretario;
    }

    public void agregarVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }

    public void imprimirListaVendedores() {
        System.out.println(listaVendedores.toString());
    }


}


