import java.util.Scanner;

public class EjerciciosSwitch {

//Reto 1: El Selector de Entornos
//Pide al usuario un número del 1 al 3.
//
//Usa un switch con flechas (->).
//
//Los casos serán:
//
//1: "Entorno de Desarrollo (Local)".
//
//2: "Entorno de Pruebas (Staging)".
//
//3: "Entorno de Producción (Cloud)".
//
//Default: "Opción no válida".
    Scanner scanner = new Scanner(System.in);
    public void selectorEntornos(){
        System.out.println("Elija un numero del 1 al 3");
        System.out.println("1. Entorno de Desarrollo (Local) ");
        System.out.println("2. Entorno de Pruebas (Staging) ");
        System.out.println("3. Entorno de Producción (Cloud) ");

        int entorno = scanner.nextInt();

        switch (entorno) {
            case 1 -> {
                System.out.println("ha elegido el entorno 1");
                System.out.println("Bienvenido al entorno de desarrollo");
            }

            case 2 -> {
                System.out.println("ha elegido el entorno 2");
                System.out.println("Bienvenido al entorno de pruebas");
            }
            case 3 -> {
                        System.out.println("ha elegido el entorno 3");
                         System.out.println("Bienvenido al entorno de produccion");
            }
            default -> {
                System.out.println("Error de codigo");
                System.out.println("intentelo de nuevo por favor");
            }
            }



        }


//Crea el méto do planificadorCertificaciones().
//
//Pide el nombre de la certificación por consola (AZ900, SC900 o Security+).
//
//Usa un switch de flechas para mostrar tu calendario según tu plan:
//
//"AZ900": "Examen programado para Julio 2026".
//
//"SC900": "Examen programado para Agosto 2026".
//
//"Security+": "Estudio intensivo de Septiembre a Diciembre 2026".
//
//Default: "Certificación no encontrada en el plan actual".


    public void planificadorCertificaciones(){
        System.out.println("Nombre de la certificacion ");
        String certificacion = scanner.next().toUpperCase();

        switch (certificacion){
            case "AZ900" -> System.out.println("Examen programado para Julio 2026");
            case "SC900" -> System.out.println("Examen programado para Agosto 2026");
            case "Security+" -> System.out.println("Estudio intensivo de Septiembre a Diciembre 2026");
            default -> System.out.println("Certificación no encontrada en el plan actual");

        }
        System.out.println("buena suerte Carlos");

    }



    public void diaSemana(){
        System.out.println("introduzca el numero");
        int dia = scanner.nextInt();


        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");

        }




    }





































}


































