
public class PessoaJuridica extends Contribuinte {
  private String cnpj;

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public double calcularImposto() {
    return this.getRendaBruta() * 0.1;
  }

  @Override
  public String toString() {
    return String.format("[%s]\n%s%s: %s\n%s: R$%.2f\n",
        "Pessoa Jurídica", super.toString(), "CNPJ", cnpj, "Imposto", calcularImposto());
  }
}
