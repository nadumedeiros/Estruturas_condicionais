import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
    var scanner  = new Scanner (System.in);

    System.out.println("Informe sua altura");
    float altura = scanner.nextFloat();

    System.out.println("Informe seu peso");
    float peso = scanner.nextFloat();

    float imc = peso / (altura * altura);

    if (imc <= 18.5f){
        System.out.println("Abaixo do peso");

    }else if (imc > 18.6f && imc < 24.9f){
        System.out.println("peso ideal");

    }else if (imc > 25.0f && imc < 29.9f){
        System.out.println("levemante acima do peso ideal");

    }else if (imc > 30.0f && imc < 34.9f){
        System.out.println("Obesidade grau I");

    }else if (imc > 35.0f && imc < 39.9f){
        System.out.println("Obesidade grau II (Severa)");

    } else if (imc > 40.0){
        System.out.println("Obesidade morbida");
    };

    scanner.close();







    
   

    }
}