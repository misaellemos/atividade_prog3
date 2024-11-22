
public class PessoaFisica extends Contribuinte {
  private String cpf;

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public double calcularImposto() {

    double renda = this.getRendaBruta();

    if (renda <= 1400) {
      return 0;
    }

    if (renda <= 2100) {
      return (renda * 0.1) - 100;
    }

    if (renda <= 2800) {
      return (renda * 0.15) - 270;
    }

    if (renda <= 3600) {
      return (renda * 0.25) - 500;
    }

    // maior que 3600
    return (renda * 0.3) - 700;
  }

  @Override
  public String toString() {
    return String.format("[%s]\n%s%s: %s\n%s: R$%.2f\n",
        "Pessoa Física", super.toString(), "CPF", cpf, "Imposto", calcularImposto());
  }
}
