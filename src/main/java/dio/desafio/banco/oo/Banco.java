package dio.desafio.banco.oo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Data
public class Banco {
    @NonNull
    private String nomeBanco;

    @Setter(value = AccessLevel.PRIVATE)
    private List<Conta> contas = new ArrayList<>();

    public void listarContas() {
        System.out.println("LISTANDO CONTAS DO BANCO " + nomeBanco);
        contas.stream()
                .forEach(conta -> {
                    System.out.println("####################################");
                    System.out.println("CPF: " + conta.getCliente().getCpf());
                    System.out.println("Nome: " + conta.getCliente().getNome());
                    System.out.println("Conta " + conta.getTipoConta().toString() + ": " + conta.getAgencia() + " " + conta.getNumero());
                    System.out.println("Saldo: " + conta.getSaldo());
                });
    }

    public void adicionarConta(Conta novaConta){
        this.contas.add(novaConta);
    }

    public void adicionarContas(Collection<? extends Conta> contas){
        this.contas.addAll(contas);
    }
}
