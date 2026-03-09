import java.util.Random;
import java.util.Scanner;

public class SentenciaWhile {

    public void ejerciciosWhile(){

       int numeros = 1;
        //while (numeros <6){

           // System.out.println(numeros);
            //numeros++;
        //}


        //do {
          //  System.out.println(numeros);
            //numeros++;


       // }while (numeros <6);
       // Scanner scanner = new Scanner(System.in);
        //int numero;
        //do{
          //  System.out.println("Introduzca un numero entre el 1 y el 10");
          // numero = scanner.nextInt();
          // if (numero < 1 || numero > 10){
           //    System.out.println("numero no valido intentalo de nuevo: "+numero);
           //}



        //}while (numero < 1 || numero > 10);
        //System.out.println("numero correcto");

        Scanner scanner = new Scanner(System.in);
       // int opcion;
        //do{
          //  System.out.println("elija una opcion;");
            //System.out.println("1. Saludar ");
            //System.out.println("2. Despedirse ");
            //System.out.println("3. Salir ");
            //opcion = scanner.nextInt();
            //switch (opcion){
             //   case 1 -> System.out.println("HOLA");
               // case 2 -> System.out.println("ADIOS");
                //case 3 -> System.out.println("SALIENDO...");
            //}
            //if (opcion < 1 || opcion >3){
             //7//   System.out.println("opcion incorrecta elija de nuevo");
            //}


        //}while (opcion !=3 );

        Random random = new Random();

        int numeroSecreto = random.nextInt(10);
        int intento;
        do {

            System.out.println("Introduce un numero: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("el numero es mayor");
                System.out.println("intentalo de nuevo");
            } else if (intento > numeroSecreto) {
                System.out.println("el numero es menor");
                System.out.println("intentalo de nuevo");

            }


        } while (numeroSecreto != intento);
        System.out.println("numero correcto premio para el caballero");



















    }


}
