package Test4;

public class Coche {
    private String marca;
    private String modelo;
    private String matriz;

    public Coche(String marca, String modelo, String matriz) {
        this.marca = marca;
        this.modelo = modelo;
        this.matriz = matriz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatriz() {
        return matriz;
    }

    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    public String toString(Coche e) {
        return ("Marca: " + getMarca() + " " + getModelo() + " Matriz: " + getMatriz());
    }
}
