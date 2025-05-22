import java.util.Scanner;

public class ExercicioCalculadora {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int num1 = teclado.nextInt();

        System.out.println("Digite outro número:");

        int num2 = teclado.nextInt();

        System.out.println("Escolha entre multiplicar, dividir, subtrair ou somar:");
        System.out.println("Multiplicar aperte '1' ");
        System.out.println("Dividir aperte '2' ");
        System.out.println("Subtrair aperte '3' ");
        System.out.println("Somar aperte '4'");

        int escolha = teclado.nextInt();

        if ( escolha == 1) {
            System.out.println("O resultado da multiplicação é: " + num1 * num2);
        }
        else if (escolha == 2) {
            
            if( num1 != 0) {
                System.out.println("O resultado da divisão é: " + num1/num2 );
            }
            else {
                System.out.println("Não é possivel dividir por 0");
            }
            
        }
        else if( escolha == 3 ){
            System.out.println("O resultado da operação é: " + (num1 - num2) );
        }
        else if ( escolha == 4){
            System.out.println("O resultado da soma é: " + (num1 + num2));
        }
        else {
            System.out.println("Opção inválida!");
        }
    }
}
