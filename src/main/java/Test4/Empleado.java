package Test4;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private int antiguedad;
    private String telefono;
    private double sueldo;
    private Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int dni, String direccion, String telefono, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return (getNombre() + " " + getApellido());
    }


    public String toString(Empleado empleado) {
        return (nombre + " " + apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(JefeDeZona jefeDeZona) {
        supervisor = jefeDeZona;
        this.supervisor = supervisor;
    }

    public void cambiarSupervisor(JefeDeZona jefeDeZona) {
        supervisor = jefeDeZona;
        this.supervisor = supervisor;
    }

    public void aumentarSalario(double aumento) {
        sueldo = aumento + sueldo;
        setSueldo(sueldo);
    }
}

