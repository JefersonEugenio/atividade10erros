// O Exercicio começa a partir da linha 18
// Criar um arquivo com o nome ProgramaPrincipal.java
public class ProgramaPrincipal {
    // Esse código esta correto
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1234, "João da Silva");
        ContaBancaria conta2 = new ContaBancaria(5678, "Maria Souza");

        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.sacar(300);
        conta2.sacar(700);

        System.out.println("Saldo da conta 1: " + conta1.obterSaldo());
        System.out.println("Saldo da conta 2: " + conta2.obterSaldo());
    }
}

// Existem 10 erros
class ContaBancaria {
    // Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldoAtual;

    // Método Construtor
    public ContaBancaria(int numeroConta, String nomeTitular) { // 1) faltou nome completo metodo construtor
        this.numeroConta = numeroConta; // 2) faltou this
        this.nomeTitular = nomeTitular; // 3) faltou this
    }

    // Métodos
    public double depositar(double valorDeposito) { // 4) private troca public e 5) String troca double
        return saldoAtual = saldoAtual + valorDeposito; // 6) faltou return
    }

    public void sacar(double valorSaque) { // 7) private troca public
        if (valorSaque > saldoAtual) {
            System.out.println("Saldo insuficiente");
        } else {
            saldoAtual = saldoAtual - valorSaque;
        }
    }

    public double obterSaldo() { // 8) private troca public e 9) void troca double
        return saldoAtual;
    }
}