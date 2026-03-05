import java.util.Scanner;

public class EjerciciosIf {

    Scanner scanner = new Scanner(System.in);

    public void gestorEnvioInternacional() {

        System.out.println("A donde quiere enviar el paquete? ");

        String destino = scanner.next();

        if (destino.equalsIgnoreCase("Nacional")) {

            System.out.println("Cuanto pesa el paquete? ");

            double pesoPaquete = scanner.nextDouble();

            if (pesoPaquete < 5) {
                System.out.println("el coste es 10€ ");

            } else  {
                System.out.println("el coste es 20€ ");

            }
        } else if (destino.equalsIgnoreCase("Internacional")) {
            System.out.println("cuanto pesa el paquete");
            double pesoPaquete = scanner.nextDouble();
            System.out.println("tipo de envio ");
            String envio = scanner.next();
            if (envio.equalsIgnoreCase("Estandar")){
                System.out.println("el coste del envio es de 50€");
            } else if (envio.equalsIgnoreCase("Express")) {
                System.out.println("el coste del envio des de 100€");


            }

        }else{
            System.out.println("destino no operado");
        }
    }


}

