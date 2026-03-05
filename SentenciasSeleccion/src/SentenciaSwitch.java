import java.util.Locale;
import java.util.Scanner;

public class SentenciaSwitch {

    public void usoSwhichint() {
        int valor = 3;
        switch (valor) {
            case 1:
                //cuerpo cuando la variable toma valor 1
                System.out.println("toma valor de 1");
                break;

            case 5:
                //cuerpo cuando la variable toma valor 5
                System.out.println("toma valor de 5");

                break;

            case 7:
                //cuerpo cuando la variable toma valor 5
                System.out.println("toma valor de 7");

                break;


            default:
                System.out.println("valor no contemplado");


        }


    }

    public void usoSwitchString() {
        String nombre = "Borja";
        switch (nombre.toLowerCase()) {
            case "borja":
                System.out.println("el nombre es Broja");
                break;

            case "maria":
                System.out.println("el nombre es Maria");
                break;


            case "juan":
                System.out.println("el nombre es Juan");
                break;


            default:
                System.out.println("Nombre no contemplado");

        }
        System.out.println("terminado de analizar el nombre");


    }

    public void usoSwitchChar() {
        char letra = 'A';
        switch (letra) {
            case 'A':
                break;

            case 'B':
                break;

            case 'a':
                break;

            case 'C':
                break;

            case 'd':
                break;

            case 'E':
                break;

            default:
                System.out.println("Letra no contemplada");


        }


    }


    public void usoSwitchLambda() {
        int nota = 7;
        switch (nota) {
            case 1 -> {
                System.out.println("seleccionado caso 1");
            }
            case 2 -> {
                System.out.println("seleccionado caso 2");
            }
            case 3 -> {
                System.out.println("seleccionado caso 3");
            }
            case 4, 5, 6, 7, 8 -> {
                System.out.println("seleccionado caso 4");
            }
            default -> {
                System.out.println("sin contemplar");
            }


        }
    }


    public void menuOperaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Menu operaciones");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multi");
        System.out.println("4.Dividir");
        System.out.println("5.Modulo");
        System.out.println("que operacione quieres hacer");
        int opcion = scanner.nextInt();
        System.out.println("dime el primer operando");
        int op1 = scanner.nextInt();
        System.out.println("dime el segundo operando");
        int op2 = scanner.nextInt();
        double resultado = 0;


        switch (opcion) {
            case 1 -> {
                System.out.println("vas a sumar");
                resultado = op1 + op2;
            }

            case 2 -> {
                System.out.println("vas a restar");
                resultado = op1 - op2;
            }

            case 3 -> {
                System.out.println("vas a multi");
                resultado = op1 * op2;
            }
            case 4 -> {
                System.out.println("vas a dividir");
                resultado = (double) op1 / op2;
            }
            case 5 -> {
                System.out.println("vas a modulo");
                resultado = op1 % op2;
            }

            default -> {
                System.out.println("datos incorrectos");
            }

        }
        System.out.printf("el resultado de la operacion es %.1f%n", resultado);

    }


}













