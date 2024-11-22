
public class Animal {
  private String nome;
  private int comprimento;
  private int patas;
  private String cor;
  private String ambiente;
  private double velocidade;

  // getters e setters
  public Animal() {
    this.patas = 4;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setComprimento(int comprimento) {
    this.comprimento = comprimento;
  }

  public void setPatas(int patas) {
    this.patas = patas;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public void setVelocidade(double velocidade) {
    this.velocidade = velocidade;
  }

  public String getNome() {
    return nome;
  }

  public int getComprimento() {
    return comprimento;
  }

  public int getPatas() {
    return patas;
  }

  public String getCor() {
    return cor;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public double getVelocidade() {
    return velocidade;
  }

  @Override
  public String toString() {
    return String.format("%s: %s\n%s: %d\n%s: %d\n%s: %s\n%s: %s\n%s: %.2f m/s",
        "Animal", nome, "Comprimento", comprimento, "Patas", patas, "Cor", cor,
        "Ambiente", ambiente, "Velocidade", velocidade);
  }
}
