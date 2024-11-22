
public class ContaCorrente {
  private int numConta;
  private final String nome;
  private final String cpf;
  private String banco;
  private boolean especial;
  private double limiteEspecial;
  private double saldo;

  // construtor
  public ContaCorrente(int numConta, String nome, String cpf, String banco, boolean especial, double limiteEspecial,
      double saldo) {
    this.numConta = numConta;
    this.nome = nome;
    this.cpf = cpf;
    this.banco = banco;
    this.especial = especial;
    this.limiteEspecial = limiteEspecial;
    this.saldo = saldo;
  }

  // metodos
  public void saldo() {
    System.out.printf("Saldo: R$%.2f\n", saldo);
  }

  public void limiteEspecial() {
    System.out.printf("Limite Especial: R$%.2f\n", limiteEspecial);
  }

  public boolean saque(double valor) {
    if (especial) {
      double limite = limiteEspecial + saldo;
      if (valor > limite)
        throw new IllegalArgumentException("Saldo insuficiente.\n");
    } else {
      if (valor > saldo)
        throw new IllegalArgumentException("Saldo insuficiente.\n");
    }

    saldo -= valor;
    return true;
  }

  public void deposito(double valor) {
    if (valor <= 0.0)
      throw new IllegalArgumentException("O depósito deve ser > 0 reais.\n");

    saldo += valor;
  }

  public boolean verificarUsoChequeEspecial() {
    return saldo < 0;
  }

  // getters e setters
  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getBanco() {
    return banco;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  public boolean isEspecial() {
    return especial;
  }

  public void setEspecial(boolean especial) {
    this.especial = especial;
  }

  public double getLimiteEspecial() {
    return limiteEspecial;
  }

  public void setLimiteEspecial(double limiteEspecial) {
    this.limiteEspecial = limiteEspecial;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    if (saldo < 0.0)
      throw new IllegalArgumentException("Saldo deve ser >= 0 reais.\n");

    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return String.format("%s\n%s: %s\n%s: %d\n%s: %s\n%s: %s\n%s%.2f", "Conta Corrente",
        "Banco", banco, "Número da conta", numConta, "Nome", nome, "CPF", cpf, "Limite Especial: R$", limiteEspecial);
  }
}
