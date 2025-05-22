package ExercicioDaContaBancaria.domain;

public class ContaBancaria {

    private String titular;
    private double salario;
    private double valor;

    public ContaBancaria(double salario, String titular) {
        this.salario = salario;
        this.titular = titular;
    }



    public void depositar(double valor){

        this.salario = this.salario + valor;
        System.out.println("Deposito realizado com sucesso! ");
        
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: " + this.salario);
    }

    public void sacar( double valor){
        if(salario < valor){
            System.out.println("Saldo insuficiente!");
            return;

        }
        this.salario = this.salario - valor;
        System.out.println("Valor sacado com sucesso!");
        System.out.println("O seu saldo é: " + this.salario);
    }
    


}
