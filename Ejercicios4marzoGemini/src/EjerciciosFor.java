public class EjerciciosFor {

public void estructuraBasica(){

    for (int i = 1; i < 6; i++) {
        System.out.println(+i);
    }

    for (int i = 5; i >= 1; i--) {
       System.out.println(+i);

    }

    for (int i = 2; i < 11; i=2+i) {
        System.out.println(+i);
    }
    System.out.println();
    for (int i = 3; i < 31 ; i=i+3) {
        System.out.println(+i);
    }
    System.out.println();

    for (int i = 10; i <101 ; i=i+10) {
        System.out.println(+i);

    }
    System.out.println();

    for (int i = 0; i < 5; i++) {
        System.out.println("Hola mundo");

    }
    System.out.println();

    for (int i = 1; i < 21; i++) {
        if (i % 2 != 0) {
            System.out.println(+i);
        }
    }
    System.out.println();

    for (int i = 1; i <31 ; i++) {
        if (i % 3 ==0 || i % 5 ==0){
            System.out.println(+i);
        }

    }

    for (int i = 1; i <11 ; i++) {
        System.out.println("7 x "+i+" = "+7*i);
    }
    System.out.println();

    int suma = 0;
    for (int i = 1; i <11 ; i++) {
        suma = suma + i;


    }
    System.out.println(+suma);

    System.out.println();


    for (int i = 1; i < 11 ; i++) {
        switch (i){
            case 1,2,3 -> System.out.println(i+ " -> BAJO");
            case 4,5,6 -> System.out.println(i+ " -> medio");
            case 7,8,9,10-> System.out.println(i+ " -> alto");


        }

    }


    for (int i = 1; i < 20; i++) {

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");


        }else if (i % 3 == 0) {
                System.out.println("Fizz");

        } else if (i % 5 == 0) {
                System.out.println("Buzz");

        }else System.out.println(i);

        }
    }
}























































