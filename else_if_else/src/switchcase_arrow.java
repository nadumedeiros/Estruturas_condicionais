import java.util.Scanner;


public class switchcase_arrow {
    public static void main(String [] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 ate 7");
        int option = scanner.nextInt();

       var message = switch (option){

            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sabado";
              yield String.format("Hoje e %2, fim de semana", day);
            }
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            default -> "opcao invalida";
          
        };
        System.out.println(message);


    }
}