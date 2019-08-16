package Test4;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {

        String nombre = "Juan";
        String apellido = "Gomes";
        int dni = 36133133;
        String direccion = "Av libertador 244";
        int antiguedad = 10;
        String telefono = "1143143311";
        double sueldo = 40000;
        String celular = "1169123125";
        String area = "finanzas";

        String nombrev2 = "Claudio";
        String apellidov2 = "Hernandez";
        int dniv2 = 36341320;
        String direccionv2 = "Lima 11";
        int antiguedadv2 = 3;
        String telefonov2 = "3512703939";
        double sueldov2 = 35000;
        String celularv2 = "3513692323";
        String areav2 = "salud";

        String nombre1 = "Pedro";
        String apellido1 = "Perez";
        int dni1 = 17321441;
        String direccion1 = "Ugarte 2713";
        int antiguedad1 = 20;
        String telefono1 = "1155443322";
        double sueldo1 = 70000;
        String despacho1 = "5to A";

        String nombre2 = "Carlos";
        String apellido2 = "Solis";
        int dni2 = 25431651;
        String direccion2 = "Rosario 231";
        int antiguedad2 = 5;
        String telefono2 = "1121214141";
        double sueldo2 = 30000;
        String despacho2 = "4to A";
        String fax2 = "1149312331";

        double aumento = 10000;

        String coche1marca = "Ford";
        String coche1modelo = "Focus";
        String coche1matriz = "ATX661";

        String clienteN = "Marcos";
        String clienteA = "Lopez";
        int clienteC = 13333444;
        String cliente2N = "Facundo";
        String cliente2A = "Jonas";
        int cliente2C = 35431231;
        String cliente3N = "Santiago";
        String cliente3A = "Silva";
        int cliente3C = 34213518;


        // creo el jefe, el secretario, vendedores y un coche.
        Empleado jefeDeZona = new JefeDeZona(nombre1, apellido1, dni1, direccion1, antiguedad1, telefono1, sueldo1);
        Secretario secretario = new Secretario(nombre2, apellido2, dni2, direccion2, telefono2, sueldo2);
        Vendedor vendedor = new Vendedor(nombre, apellido, dni, direccion, telefono, sueldo);
        Vendedor vendedor2 = new Vendedor(nombrev2, apellidov2, dniv2, direccionv2, telefonov2, sueldov2);
        Coche coche = new Coche(coche1marca, coche1modelo, coche1matriz);
        Coche cocheNull = new Coche("No", "tiene", "coche");

        // asigno todos los parametros al jefe
        jefeDeZona.setAntiguedad(antiguedad1);
        jefeDeZona.aumentarSalario(aumento);
        ((JefeDeZona) jefeDeZona).setSecretario(secretario);
        ((JefeDeZona) jefeDeZona).setDespacho(despacho1);
        ((JefeDeZona) jefeDeZona).setCoche(coche);

        // asigno todos los parametros a los vendedores
        vendedor.setAntiguedad(antiguedad);
        vendedor.setSupervisor(jefeDeZona);
        vendedor.aumentarSalario(aumento);
        vendedor.setCelular(celular);
        vendedor.setArea(area);
        vendedor2.setAntiguedad(antiguedadv2);
        vendedor2.setSupervisor(jefeDeZona);
        vendedor2.aumentarSalario(aumento);
        vendedor2.setCelular(celularv2);
        vendedor2.setArea(areav2);
        vendedor2.setCoche(cocheNull);


        // creo clientes
        vendedor.crearCliente(clienteN, clienteA, clienteC);
        vendedor.crearCliente(cliente2N, cliente2A, cliente2C);
        vendedor2.crearCliente(cliente3N, cliente3A, cliente3C);

        // asigno el vendedor creado a un jefe
        ((JefeDeZona) jefeDeZona).agregarVendedor(vendedor);
        ((JefeDeZona) jefeDeZona).agregarVendedor(vendedor2);


        // asigno todos los parametros al secretario
        secretario.setAntiguedad(antiguedad2);
        secretario.setSupervisor((JefeDeZona) jefeDeZona);
        secretario.aumentarSalario(aumento);
        secretario.setDespacho(despacho2);
        secretario.setFax(fax2);

        // imprimo el auto del jefe
        System.out.println(((JefeDeZona) jefeDeZona).getCoche());

        // cambio el auto del jefe y lo imprimo

        String coche2marca = "Fiat";
        String coche2modelo = "Uno";
        String coche2matriz = "XAT411";
        Coche coche1 = new Coche(coche2marca, coche2modelo, coche2matriz);
        ((JefeDeZona) jefeDeZona).setCoche(coche1);
        System.out.println(((JefeDeZona) jefeDeZona).getCoche().toString());


        // aca uso un auto ya existente y se lo asigno al vendedor
        vendedor.cambiarCoche(coche);
        System.out.println(vendedor.getCoche());
        System.out.println(vendedor2.getCoche());

        // imprimo cada uno de los empleados
        System.out.println(jefeDeZona.toString(jefeDeZona));
        System.out.println(vendedor.toString(vendedor));
        System.out.println(vendedor2.toString(vendedor2));
        System.out.println(secretario.toString(secretario));

        // imprimo empleados a cargo del jefe
        ((JefeDeZona) jefeDeZona).imprimirListaVendedores();

        // imprimo las lista de clientes
        vendedor.imprimirListaClientes();

        // borro un cliente
        vendedor.borrarCliente(cliente2C);
        vendedor.imprimirListaClientes();
        vendedor2.imprimirListaClientes();


        Gson gson = new Gson();
        String test = gson.toJson(vendedor);
        String test1 = gson.toJson(vendedor2);
        String test2 = gson.toJson(secretario);
        String test3 = gson.toJson(jefeDeZona);
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);


    }
}
