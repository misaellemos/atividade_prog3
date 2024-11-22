
public class ContaEspecial extends ContaBancaria {
  private double limite;

  // setter
  public void setLimite(double limite) {
    this.limite = limite;
  }

  // metodos
  @Override
  public boolean sacar(double valor) {
    double saldoComLimite = this.getSaldo() + limite;

    if (valor <= saldoComLimite) {
      this.setSaldo(this.getSaldo() - valor);

      return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return String.format("\n%s\n%s%.2f\n%s", "[Conta Especial]",
        "Limite: R$", limite, super.toString());
  }
}
