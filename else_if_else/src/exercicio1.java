import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
    var scanner  = new Scanner (System.in);
    System.out.println("Informe um numero");
    var number = scanner.nextInt();

    while(true){
        System.out.println("Informe um numero para verificacao");
        var toVerify = scanner.nextInt();
        if (toVerify < number){
            System.out.printf("Infomre um numero maior que %s\n", number);
            continue;
        }
        var result = toVerify % number;
        System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        if (result != 0) break;
    }
}
}