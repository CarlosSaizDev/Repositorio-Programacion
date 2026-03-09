import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {


    public static void main(String[] args) {

        //evaluar dia de la semana y si es laborable o no es laborable

        DiasSemana diaSemana = DiasSemana.Lunes;

        switch (diaSemana) {
            case Lunes, Martes, Miercoles, Jueves, Viernes -> System.out.println("Laborable");
            case Sabado -> System.out.println("Laborable");
            case Domingo -> System.out.println("Laborable");


        }

        System.out.println("la fecha de hoy es 7 de "+MesesAnio.Noviembre+"de 2025 y es "+ DiasSemana.Viernes);
        System.out.printf("la fecha de hoy es %d de %s ",DiasSemana.Jueves);





        //final int NUMERO = 12;

        //switch (true){

           // case (NUMERO >= 0 && NUMERO <10)->{
             //   System.out.println("23123");


            //case (NUMERO > 10 && NUMERO <20)->{
            //    System.out.println("23123");
            //}

            }



        }











    }






}
