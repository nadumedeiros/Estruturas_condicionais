import java.util.Scanner;

public class Whilea_do_while {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var name = "";

        do{
        while(!name.equals("exit")){
            System.out.println("Informe um nome");
            name = scanner.next();
            System.out.println(name);

        } while (!name.equalsIgnoreCase("exit"));
        
       }
      }
    }

