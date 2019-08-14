package Test3;


import com.google.gson.Gson;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo = "normal";
        String marca = "Michelin";
        double grosor = Math.random()*0.6;
        double diametro = Math.random()*2;

        Rueda primera = new Rueda(tipo, marca, grosor, diametro);
        switch (comprobarDimensiones(primera)){
            case 1 : {
                System.out.println("La rueda es para un vehiculo grande");
                break;
            }
            case 2 : {
                System.out.println("La rueda es para un vehiculo mediano");
                break;
            }
            case 3 : {
                System.out.println("La rueda es para un vehiculo pequeño");
                break;
            }
            case 4 : {
                System.out.println("La rueda es para un vehiculo grande, pero el grosor es inferior al recomendado");
                break;
            }
            case 5: {
                System.out.println("La rueda es para un vehiuclo mediano, pero el grosor es inferior al recomendado");
                break;
            }
            default: {
                System.out.println("Test de error en default");
                break;
            }
        }


        Gson gson = new Gson();
        String test = gson.toJson(primera);
        System.out.println(test);
    }

    public static int comprobarDimensiones(Rueda r) {
        if (r.getDiametro() > 1.4) {
            if (r.getGrosor() < 0.4) {
                return 4;
            }
            return 1;
        } else if (r.getDiametro() <= 1.4 && r.getDiametro() > 0.8) {
            if (r.getGrosor() < 0.25) {
                return 5;
            }
            return 2;
        } else {
            return 3;
        }
    }
}


