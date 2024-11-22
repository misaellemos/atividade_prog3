import java.text.DecimalFormat;

public class Principal {
  public static void main(String[] args) {

    System.out.println(
        "\n// ---------------------------------------------\n" +
            "// Teste ContaBancaria\n" +
            "// ---------------------------------------------");

    ContaBancaria contaSimples = new ContaBancaria();
    contaSimples.setNomeCliente("Cliente Conta Simples");
    contaSimples.setNumConta("1234");

    contaSimples.depositar(555);
    System.out.println(contaSimples);

    realizarSaque(contaSimples, 300);
    realizarSaque(contaSimples, 200);

    System.out.println();
    System.out.println(contaSimples);

    System.out.println(
        "\n// ---------------------------------------------\n" +
            "// Teste ContaPoupanca\n" +
            "// ---------------------------------------------");

    ContaPoupanca contaPoupacanca = new ContaPoupanca();
    contaPoupacanca.setNomeCliente("Cliente Conta Poupança");
    contaPoupacanca.setNumConta("22222");
    contaPoupacanca.setDiaRendimento(3);

    contaPoupacanca.depositar(100);
    System.out.println(contaPoupacanca);

    realizarSaque(contaPoupacanca, 50);
    realizarSaque(contaPoupacanca, 70);

    if (contaPoupacanca.calcularNovoSaldo(0.5)) {
      DecimalFormat d = new DecimalFormat();
      d.setMaximumFractionDigits(2);
      d.setMinimumFractionDigits(2);

      System.out.println("\nRendimento aplicado, novo saldo é de R$" + d.format(contaPoupacanca.getSaldo()));
    } else {
      System.out.println("\nHoje não é dia de rendimento, saldo se mantém o mesmo");
    }

    System.out.println(contaPoupacanca);

    System.out.println(
        "\n// ---------------------------------------------\n" +
            "// Teste contaEspecial\n" +
            "// ---------------------------------------------");

    ContaEspecial contaEspecial = new ContaEspecial();
    contaEspecial.setNomeCliente("Cliente Conta Especial");
    contaEspecial.setNumConta("33333");
    contaEspecial.setLimite(50);

    contaEspecial.depositar(100);
    System.out.println(contaEspecial);

    realizarSaque(contaEspecial, 50);
    realizarSaque(contaEspecial, 70);
    realizarSaque(contaEspecial, 80);

    System.out.println(contaEspecial);
  }

  private static void realizarSaque(ContaBancaria conta, double valor) {
    DecimalFormat d = new DecimalFormat();
    d.setMaximumFractionDigits(2);
    d.setMinimumFractionDigits(2);

    if (conta.sacar(valor)) {
      System.out.println(
          "\nSaque de R$" + d.format(valor) + " efetuado com sucesso, novo saldo é de R$" + d.format(conta.getSaldo()));
    } else {
      System.out.println(
          "\nSaldo insuficiente para saque de R$" + d.format(valor) + "; seu saldo é de R$" + d.format(conta.getSaldo()));
    }
  }

}
