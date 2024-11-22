
public abstract class Contribuinte {
  private String nome;
  private double rendaBruta;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getRendaBruta() {
    return rendaBruta;
  }

  public void setRendaBruta(double rendaBruta) {
    this.rendaBruta = rendaBruta;
  }

  public abstract double calcularImposto();

  @Override
  public String toString() {
    return String.format("%s: %s\n%s: R$%.2f\n",
        "Nome", nome, "Renda Bruta", rendaBruta);
  }
}
