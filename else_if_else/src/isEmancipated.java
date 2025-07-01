import java.util.Scanner;


public class isEmancipated {
    public static void main(String [] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();
        System.out.println("voce e emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

         if (age>= 18){
            System.out.printf("%s, voce tem %s anos e pode dirigir \n", name, age);

        } else if (age >=  16 && isEmancipated){
            System.out.printf("%s apesar de voce ter %s anos, voce e emancipado e pode dirigir\n", name, age);

        }else{
            System.out.printf("%s, voce nao pode dirigir\n", name);
        }

    }


}
