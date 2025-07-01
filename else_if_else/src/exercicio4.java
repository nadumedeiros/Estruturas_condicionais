import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
    var scanner  = new Scanner (System.in);

    System.out.println("Informe o primeiro numero");
    int number1 = scanner.nextInt();

    System.out.println("Informe um numero maior que o primeiro numero");
    int number2 = scanner.nextInt();

    if (number2 < number1){
        System.out.println("O segundo numero deve ser maior que o primeiro");
        return;
    }

    System.out.println("Digite 1 para pares e dois para impares:  \n");
    int option = scanner.nextInt();

    for (int i = number2; i >= number1; i--){
        if(option == 1 && i % 2 == 0){
            System.out.println(i);
        } else if (option == 2 && i % 2 != 0){
            System.out.println(i);
         }
        }

    }
}