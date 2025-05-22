package ExercicioDaContaBancaria.test;

import ExercicioDaContaBancaria.domain.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        System.out.println("Eu tenho uma conta com 1500 em saldo! ");

        ContaBancaria conta = new ContaBancaria(1500, "Eric");

        System.out.println(" Vou depositar 1000 pila na conta ");

        conta.depositar(1000);

        System.out.println("Vou ver quanto ainda tenho na conta ");

        conta.mostrarSaldo();

        System.out.println("Vou sacar 100 da conta ");

        conta.sacar(100);


    }
}
