import java.util.Scanner;

/**
 * Created by Oscar on 29/09/2016.
 */
public class nota {
    public static void main(String[]args){

       Scanner s=new Scanner(System.in);
        System.out.print("Dime la nota que has sacado ");
       int n=s.nextInt();
        switch(n){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("Insuficiente");
                break;
            case 5:
                System.out.print("Suficiente");
                break;
            case 6:
                System.out.print("Bien");
                break;
            case 7:
            case 8:
                System.out.print("Notable");
                break;
            case 9:
            case 10:
                System.out.print("Excelente");
                break;
            default:
                System.out.print("El valor que me has dado no es válido");
                break;
        }
    }
}
