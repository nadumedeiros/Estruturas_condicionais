import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
    var scanner  = new Scanner (System.in);
    
    System.out.println("Informe o numero");
    int number = scanner.nextInt();

    for (int i = 1; i <=10; i++){
        int result = number * i;
        System.out.println(number + "x" + i + "=" + result);
    }





    }
}