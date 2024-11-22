
public class Lampada {
  private final String marca;
  private final String tipo;
  private final String modelo;
  private double preco;
  private final int potencia;
  private final int temperatura_cor;
  private boolean ligada;

  // construtor
  public Lampada(String marca, String tipo, String modelo, double preco, int potencia, int temperatura_cor) {
    this.marca = marca;
    this.tipo = tipo;
    this.modelo = modelo;
    this.potencia = potencia;
    this.temperatura_cor = temperatura_cor;
    this.preco = preco;
    this.ligada = false;
  }

  public Lampada(String marca, String tipo, String modelo, double preco, int potencia, int temperatura_cor,
      boolean ligada) {
    this.marca = marca;
    this.tipo = tipo;
    this.modelo = modelo;
    this.potencia = potencia;
    this.temperatura_cor = temperatura_cor;
    this.preco = preco;
    this.ligada = ligada;
  }

  // funções para ligar e desligar a lampada
  public void ligar() {
    setLigada(true);
  }

  public void desligar() {
    setLigada(false);
  }

  public void mostrarEstado() {
    System.out.println("A lâmpada está " + ((isLigada()) ? "ligada" : "desligada"));
  }

  public void apertarInterruptor() {
    ligada = !ligada;
  }

  // getters e setters
  public String getMarca() {
    return marca;
  }

  public String getTipo() {
    return tipo;
  }

  public String getModelo() {
    return modelo;
  }

  public double getPotencia() {
    return potencia;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public boolean isLigada() {
    return ligada;
  }

  public void setLigada(boolean ligada) {
    this.ligada = ligada;
  }

  public int getTemperatura_cor() {
    return temperatura_cor;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    // return super.toString();
    return String
        .format(
            "Lâmpada \n%s: %s \n%s: %s \n%s: %s \n%s: R$%.2f\n%s: %d W\n%s: %d K\n",
            "Marca", marca, "Tipo", tipo, "Modelo", modelo, "Preço", preco, "Potência", potencia, "Temperatuda da cor",
            temperatura_cor);
  }
}
