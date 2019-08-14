package Test4;

public class Cliente  {
    private String nombre;
    private String apellido;
    private int dniCliente;

    public Cliente(String nombre, String apellido, int dniCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dniCliente = dniCliente;
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

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    @Override
    public String toString() {
        return (getNombre()+ " " + getApellido() );
    }

}
