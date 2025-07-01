public class For {


    public static void main(String[] args) {
    // numeros pares
        for (var i = 2; i <= 100; i+=2){

       // decrescente
           for (var i = 200; i <= 0; i--){

        // numeros impares
           for (var i = 0; i <= 100; i++){
            if (i % 2 == 0) continue;

            System.out.println(i);
        }
    }
}
