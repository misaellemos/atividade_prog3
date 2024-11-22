
public class ContaBancaria {
  private String nome;
  private String numConta;
  private double saldo;

  // getters e setters
  public void setNomeCliente(String nome) {
    this.nome = nome;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  // metodos
  public void depositar(double valor) {
    if (valor <= 0.0)
      throw new IllegalArgumentException("O depósito deve ser > 0 reais.\n");

    saldo += valor;
  }

  public boolean sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;

      return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return String.format("%s\n%s: %s\n%s: %s\n%s%.2f", "[Conta Bancária]",
        "Número da conta", numConta, "Nome", nome, "Saldo: R$", saldo);
  }
}
