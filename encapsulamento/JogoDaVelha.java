
public class JogoDaVelha {
  private char[][] jogo;
  private int rodada;

  // construtor
  public JogoDaVelha() {
    this.jogo = new char[3][3];
    this.rodada = 1;

    // inicializando com o char padrao
    for (int i = 0; i < jogo.length; i++) {
      for (int j = 0; j < jogo.length; j++) {
        if (i == 2)
          jogo[i][j] = ' ';
        else
          jogo[i][j] = '_';
      }
    }
  }

  // getters e setters
  public int getRodada() {
    return rodada;
  }

  private void setJogo(int x, int y) {
    this.jogo[x][y] = ((rodada % 2 == 1) ? 'X' : 'O');
  }

  // metodos
  public boolean validarJogada(int x, int y) {
    if (jogo[x][y] == 'X' || jogo[x][y] == 'O')
      return false;

    return true;
  }

  public boolean validandoCoordenada(int x, char y) {
    if ((y == 'a' || y == 'b' || y == 'c') && (x >= 0 && x <= 2))
      return true;

    return false;
  }

  public boolean condicaoVitoria(int x, int y) {
    if ((jogo[0][y] == jogo[1][y] && jogo[1][y] == jogo[2][y]) // verificando coluna
        || (jogo[x][0] == jogo[x][1] && jogo[x][1] == jogo[x][2]) // verificando linha
        || (jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]) // verificando diagonal principal
        || (jogo[0][2] == jogo[1][1] && jogo[1][1] == jogo[2][0])) // verificando diagonal secundaria
    {
      return true;
    }
    return false;
  }

  public boolean vezJogador1() {
    if (rodada % 2 == 0)
      return false;

    return true;
  }

  public boolean jogoFinalizado(int x, int y) {
    setJogo(x, y);

    if (condicaoVitoria(x, y))
      return true;

    rodada++;
    return false;
  }

  @Override
  public String toString() {
    return String.format("\n    a   b   c" +
        "\n 1 _%c_|_%c_|_%c_" +
        "\n 2 _%c_|_%c_|_%c_" +
        "\n 3  %c | %c | %c \n",
        jogo[0][0], jogo[0][1], jogo[0][2],
        jogo[1][0], jogo[1][1], jogo[1][2],
        jogo[2][0], jogo[2][1], jogo[2][2]);
  }
}
