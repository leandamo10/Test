package Test4;


public class EmpleadoConAuto extends Empleado {

    private Coche coche;

    public EmpleadoConAuto() {
    }

    public EmpleadoConAuto(String nombre, String apellido, int dni, String direccion, String telefono, double sueldo) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
    }

    public EmpleadoConAuto(String nombre, String apellido, int dni, String direccion, String telefono, double sueldo, Coche coche) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }


    public Coche cambiarCoche(Coche coche1) {
        coche = coche1;
        return coche;
    }
}
