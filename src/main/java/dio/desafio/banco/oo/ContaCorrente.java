package dio.desafio.banco.oo;

import lombok.NonNull;

public class ContaCorrente extends Conta {

    public ContaCorrente(@NonNull Cliente cliente) {
        super(cliente, TipoConta.CORRENTE);
    }

}
