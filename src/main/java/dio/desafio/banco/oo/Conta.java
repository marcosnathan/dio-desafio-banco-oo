package dio.desafio.banco.oo;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class Conta implements IConta {
    public enum TipoConta {
        CORRENTE("CORRENTE"),
        POUPANCA("POUPANÇA");

        private String tipo;

        private TipoConta(String tipo) {
            this.tipo = tipo;
        }

        public String toString(){
            return this.tipo;
        }

    }
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
    private final int agencia = AGENCIA_PADRAO;
    private final int numero = SEQUENCIAL++;
    private double saldo;
    @NonNull
    private Cliente cliente;
    @NonNull
    private TipoConta tipoConta;
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("####################################");
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Conta " + tipoConta.toString() + ": " + agencia + " " + numero);
        System.out.println("Saldo: " + saldo);
    }
    @Override
    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo Insuficiente. Operação cancelada!");
            return;
        }

        this.saldo -= valor;

    }
    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (this.saldo < valor) {
            System.out.println("Saldo Insuficiente. Operação cancelada!");
            return;
        }
        contaDestino.depositar(valor);
        this.saldo -= valor;
    }

}
