package Test4;


import java.util.ArrayList;

public class JefeDeZona extends EmpleadoConAuto {

    private String despacho;
    private String secretario;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();

    public JefeDeZona() {
    }

    public JefeDeZona(String nombre, String apellido, int dni, String direccion, int antiguedad, String telefono, double sueldo) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
    }

    @Override
    public String toString(Empleado e) {
        return ("Nombre: " + getNombre() + " " + getApellido() + "\nCargo: " + getClass().getSimpleName() + "\nDNI: " + getDni() + "\nDireccion: " + getDireccion() + "\nAntiguedad: "
                + getAntiguedad() + "\nTelefono: " + getTelefono() + "\nSueldo: " + getSueldo() + "\nSecretario personal: " + secretario + "\nDespacho: " + getDespacho()
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

    public void setSecretario(Empleado E) {
        secretario = E.getApellido() + " " + E.getNombre();
        this.secretario = secretario;
    }

    public void cambiarSecretario(Empleado E) {
        secretario = E.getApellido() + " " + E.getNombre();
        this.secretario = secretario;
    }

    public void agregarVendedor(Vendedor V) {
        listaVendedores.add(V);
    }

    public void imprimirListaVendedores() {
        System.out.println(listaVendedores.toString());
    }


}


