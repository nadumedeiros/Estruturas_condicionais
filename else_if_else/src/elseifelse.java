import java.util.Scanner;

public class elseifelse {
    public static void main(String [] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();

        if (age>= 18){
            System.out.printf("%s, voce tem %s anos e pode dirigir \n", name, age);

        }else {
            System.out.printf("%s, voce nao pode dirigir\n", name);
        }
    }

}
