import java.util.Scanner;

public class Ejercicios {


    public void ejercicioT312(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la contraseña a evaluar ");
        String contrasenia = scanner.next();
        boolean requisitoLong = contrasenia.length() >= 8;
        boolean contieneNumero = contrasenia.contains("1") || contrasenia.contains("2") || contrasenia.contains("3");
        boolean passInvalida = contrasenia.equals("password") || contrasenia.equals("12345678");
        System.out.println("Requisito long"+requisitoLong);
        System.out.println("Requisito numero"+contieneNumero);
        System.out.println("Requisito pass invalidad"+passInvalida);











    }




}
