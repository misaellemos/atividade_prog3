
public class Mamifero extends Animal {
  private String alimento;

  // getters e setters
  public String getAlimento() {
    return alimento;
  }

  public void setAlimento(String alimento) {
    this.alimento = alimento;
  }

  // construtor
  public Mamifero() {
    super();
    this.setCor("Castanho");
    this.setAmbiente("Terra");
    this.alimento = "Mel";
  }

  @Override
  public String toString() {
    return String.format("%s\n%s: %s",
        super.toString(), "Alimento", alimento);
  }
}
