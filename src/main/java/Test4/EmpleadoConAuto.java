package Test4;


public class EmpleadoConAuto extends Empleado {

    private String coche;

    public EmpleadoConAuto() {
    }

    public EmpleadoConAuto(String nombre, String apellido, int dni, String direccion, String telefono, double sueldo) {
        super(nombre, apellido, dni, direccion, telefono, sueldo);
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(Coche C) {
        coche = C.getMarca() + " " + C.getModelo() + " Matriz " + C.getMatriz();
        this.coche = coche;
    }


    public String cambiarCoche(Coche B) {
        coche = B.getMarca() + " " + B.getModelo() + " Matriz " + B.getMatriz();
        return coche;
    }
}
