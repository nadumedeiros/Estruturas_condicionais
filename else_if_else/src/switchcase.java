import java.util.Scanner;


public class switchcase {
    public static void main(String [] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 ate 7");
        int option = scanner.nextInt();

        switch (option){
            case 1:
            System.out.println("domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("terca");
            break;
            case 4:
            System.out.println("quarta");
            break;
            case 5:
            System.out.println("quinta");
            break;
            case 6:
            System.out.println("sexta");
            break;
            case 7: 
            System.out.println("sabado");
            break;

            default:
            System.out.println("Opcao invalida");
        }


    }
}