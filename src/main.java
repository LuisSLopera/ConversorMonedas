import java.util.Scanner;

public class main {
    static void main(String[] args) {
        boolean estadoAplicacion=true;
        int eleccionUsuario;
        double cantidadUsuario;
        while (estadoAplicacion){
            Scanner entrada= new Scanner(System.in);
            System.out.println("**********************************");
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println("\n");
            System.out.println("Elige la opción que requieras:");
            System.out.println("\n");
            System.out.println("1. De peso Colombiano a dolar");
            System.out.println("2. De dolar a peso Colombiano");
            System.out.println("3. De euro a peso Colombiano");
            System.out.println("4. De peso Colombiano a euro");
            System.out.println("5. Salir");

            eleccionUsuario=entrada.nextInt();

            switch (eleccionUsuario){
                case 1:
                    System.out.println("Digite el valor a convertir: ");
                    cantidadUsuario=entrada.nextDouble();
                    FuncionMonedas.ConversionMonedas("USD","COP",cantidadUsuario,estadoAplicacion);
                    break;
                case 2:
                    System.out.println("Digite el valor a convertir: ");
                    cantidadUsuario=entrada.nextDouble();
                    FuncionMonedas.ConversionMonedas("COP","USD",cantidadUsuario,estadoAplicacion);
                    break;
                case 3:
                    System.out.println("Digite el valor a convertir: ");
                    cantidadUsuario=entrada.nextDouble();
                    FuncionMonedas.ConversionMonedas("COP","EUR",cantidadUsuario,estadoAplicacion);
                    break;
                case 4:
                    System.out.println("Digite el valor a convertir: ");
                    cantidadUsuario=entrada.nextDouble();
                    FuncionMonedas.ConversionMonedas("EUR","COP",cantidadUsuario,estadoAplicacion);
                    break;

                case 5:
                    estadoAplicacion=false;
                    break;
            }



        }
    }
}
