public class SentenciaFor {
    public void sentenciaFor() {
        // inicial; final; incrementa
        //for (int i = 0; i < 5; i++) {
        //   System.out.println("ejecuntando linea");
        // }


        for (int i = 100; i >= 0; i--) {
            System.out.println("ejecuciones " + i);

        }


    }
    public void tablaMultiplicarNumero (int numero){
        System.out.println("procedemos a escribir la tabla de multiplicar del "+numero);
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n ",i,numero,i*numero);
            
        }
        


        
    }

    public void todasLasTablas (){
        for (int i = 1; i <11 ; i++) {
            System.out.println("Sacando la tabla del "+i);
            for (int j = 0; j <11 ; j++) {

            System.out.printf("\t%d * %d = %d%n ",j,i,i*j);
            }


        }




    }


public void dibujarCuadrado(){
    for (int i = 0; i <6 ; i++) {
        System.out.print("*");

    }


}

}




































