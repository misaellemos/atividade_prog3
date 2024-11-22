
public class Peixe extends Animal {
  private String caracteristicas;

  // getters e setters
  public String getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
  }

  // construtor
  public Peixe() {
    super();
    this.setPatas(0);
    this.setAmbiente("Mar");
    this.setCor("Cinzenta");
    this.caracteristicas = "Barbatanas e cauda";
  }

  @Override
  public String toString() {
    return String.format("%s\n%s: %s",
        super.toString(), "Características", caracteristicas);
  }
}
