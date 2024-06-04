package dio.desafio.banco.oo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("CAIXA");

        Cliente nathan = new Cliente("000.000.00-99", "Marcos Nathan");
        Cliente matheus = new Cliente("111.111.11-00", "Matheus Batista");

        Conta cc = new ContaCorrente(nathan);
        Conta poupanca = new ContaPoupanca(nathan);

        Conta ccMatheus = new ContaCorrente(matheus);
        Conta poupancaMatheus = new ContaPoupanca(matheus);

        banco.adicionarContas( List.of(cc, poupanca, ccMatheus, poupancaMatheus));

        cc.depositar(100);
        cc.transferir(50, poupanca);

        //cc.imprimirExtrato();
        //poupanca.imprimirExtrato();

        ccMatheus.depositar(500);
        ccMatheus.transferir(230, cc);
        ccMatheus.transferir(50, poupancaMatheus);
        ccMatheus.transferir(250, poupancaMatheus);

        banco.listarContas();
        

    }

    

    
}