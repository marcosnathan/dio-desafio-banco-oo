package dio.desafio.banco.oo;

import lombok.NonNull;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(@NonNull Cliente cliente) {
        super(cliente, TipoConta.POUPANCA);
    }
}
