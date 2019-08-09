package Test3;

public class Rueda {

    private String tipo;
    private String marca;
    private double grosor;
    private double diametro;


    public Rueda(String tipo, String marca, double grosor, double diametro) {
        this.tipo = tipo;
        this.marca = marca;
        this.grosor = grosor;
        this.diametro = diametro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }


    public int comprobarDimensiones() {
        if (getDiametro() > 1.4) {
            if (getGrosor() < 0.4) {
                return 4;
            }
            return 1;
        } else if (getDiametro() <= 1.4 && getDiametro() > 0.8) {
            if (getGrosor() < 0.25) {
                return 5;
            }
            return 2;
        } else {
            return 3;
        }
    }
}
