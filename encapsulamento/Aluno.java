
public class Aluno {

  private String nome;
  private String matricula;
  private String curso;
  private String[] disciplinas = new String[3];
  private double[][] notasDisciplinas = new double[3][4];

  // construtor
  public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notasDisciplinas) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
    this.disciplinas = disciplinas;
    this.notasDisciplinas = notasDisciplinas;
  }

  public Aluno() {
  }

  // metodos
  public void Notas() {

    System.out.println("Notas:");
    for (int i = 0; i < disciplinas.length; i++) {
      System.out.println("Disciplina: " + disciplinas[i]);

      for (var j : notasDisciplinas[i]) {
        System.out.print(" " + j);
      }

      System.out.println();
    }
  }

  public double media(int materia) {
    double total = 0;
    int quant = notasDisciplinas[materia].length;

    for (var nota : notasDisciplinas[materia]) {
      total += nota;
    }

    return total / quant;
  }

  public boolean verificarSituacao(int i) {
    if (media(i) < 7)
      return false;

    return true;
  }

  // getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String[] getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(String[] disciplinas) {
    this.disciplinas = disciplinas;
  }

  public double[][] getNotasDisciplinas() {
    return notasDisciplinas;
  }

  public void setNotasDisciplinas(double[][] notasDisciplinas) {
    this.notasDisciplinas = notasDisciplinas;
  }

  public void setDisciplinasPosicional(String disciplina, int i) {
    this.disciplinas[i] = disciplina;
  }

  public void setNotasDisciplinasPosicional(double nota, int i, int j) {
    if (nota > 10 || nota < 0)
      throw new IllegalArgumentException("\nValor inválido para nota!\nO Valor tem que estar entre 0 e 10.");

    this.notasDisciplinas[i][j] = nota;
  }

  @Override
  public String toString() {
    return String.format("\n%s\n%s: %s\n%s: %s\n%s: %s",
        "Aluno", "Nome", nome, "Matrícula", matricula, "Curso", curso);
  }
}
