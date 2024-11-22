import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println(
          "\n// ---------------------------------------------\n" +
              "// Menu\n" +
              "// ---------------------------------------------");
      System.out.println(
          "\nEscolha o exercício a analisar:\n1 - Lampada\n2 - Conta corrente\n3 - Aluno\n4 - jogo da velha\n0 - sair");
      opcao = scanner.nextInt();
      scanner.nextLine(); // limpando buffer do teclado
      switch (opcao) {
        case 0:
          System.out.println("Saindo...");
          break;
        case 1:
          exercicio_1();
          break;
        case 2:
          exercicio_2();
          break;
        case 3:
          exercicio_3(scanner);
          break;
        case 4:
          exercicio_4(scanner);
          break;
        default:
          System.out.println("Valor inválido");
          break;
      }
    } while (opcao != 0);

    scanner.close();
  }

  public static void exercicio_1() {
    System.out.println(
        "\n// ---------------------------------------------\n" +
            "// Exercicio 1\n" +
            "// ---------------------------------------------");

    Lampada lampada = new Lampada("xiaomi", "led", "WASD123", 54.23, 40, 4500);

    System.out.println(lampada);
    lampada.mostrarEstado();

    lampada.apertarInterruptor();
    lampada.mostrarEstado();

    lampada.desligar();
    lampada.mostrarEstado();

    lampada.ligar();
    lampada.mostrarEstado();
  }

  public static void exercicio_2() {
    System.out.println(
        "\n// ---------------------------------------------\n" +
            "// Exercicio 2\n" +
            "// ---------------------------------------------");

    ContaCorrente conta = new ContaCorrente(4312, "Tim maia", "123.456.789-00", "Banco Racional", true, 5000, 500);

    System.out.println(conta);

    conta.saldo();
    conta.deposito(600);
    conta.saque(1500);

    System.out.println("Verificar uso de Cheque especial: " +
        ((conta.verificarUsoChequeEspecial()) ? "Está usando!" : "Não está usando!"));

    conta.limiteEspecial();

  }

  public static void exercicio_3(Scanner scanner) {
    System.out.println(
        "\n// ---------------------------------------------\n" +
            "// Exercicio 3\n" +
            "// ---------------------------------------------");

    Aluno aluno = new Aluno();

    System.out.println("\tCadastrando aluno");

    System.out.println("Nome:");
    aluno.setNome(scanner.nextLine());

    System.out.println("Matricula:");
    aluno.setMatricula(scanner.nextLine());

    System.out.println("Curso:");
    aluno.setCurso(scanner.nextLine());

    for (int i = 0; i < aluno.getDisciplinas().length; i++) {
      System.out.println("Cadastre o nome da " + (i + 1) + "º disciplina:");
      aluno.setDisciplinasPosicional(scanner.nextLine(), i);

      for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
        System.out.println("Cadastre a " + (j + 1) + "º nota de " + aluno.getDisciplinas()[i]);
        aluno.setNotasDisciplinasPosicional(scanner.nextDouble(), i, j);
      }

      scanner.nextLine();
    }

    System.out.println(aluno);

    for (int i = 0; i < aluno.getDisciplinas().length; i++) {
      System.out.println("\nDisciplina " + aluno.getDisciplinas()[i] + " (nota de corte = 7.0):");
      if (aluno.verificarSituacao(i)) {
        System.out.println("Aluno aprovado com média " + aluno.media(i) + ".");
        continue;
      }
      System.out.println("Aluno reprovado com média " + aluno.media(i) + ".");
    }

  }

  public static void exercicio_4(Scanner scanner) {
    System.out.println(
        "\n// ---------------------------------------------\n" +
            "// Exercicio 4\n" +
            "// ---------------------------------------------");

    JogoDaVelha jogoDaVelha = new JogoDaVelha();
    int x;
    char yc;
    boolean jogoAcabou = false;

    // System.out.println("Jogador 1: X");
    // System.out.println("Jogador 2: O");

    do {
      System.out.println("\nJogador " + ((jogoDaVelha.vezJogador1()) ? "1: X" : "2: O")
          + "\nDigite as coordenadas da linha e da coluna, respectivamente");

      System.out.println(jogoDaVelha);

      System.out.println("linha (número):");
      x = scanner.nextInt();
      scanner.nextLine(); // limpando buffer do teclado

      System.out.println("coluna (letra):");
      yc = scanner.nextLine().toLowerCase().charAt(0);

      // convertendo os dados recebidos para o valor correto a ser recebido pelo array
      x = x - 1;
      int y = yc - 'a';

      if (jogoDaVelha.validandoCoordenada(x, yc) && jogoDaVelha.validarJogada(x, y)) {
        if (jogoDaVelha.jogoFinalizado(x, y))
          jogoAcabou = true;
      } else {
        System.out.println("\tJogada inválida! Tente novamente.");
      }

      if (jogoDaVelha.getRodada() > 9) {
        System.out.println(jogoDaVelha);
        System.out.println("Deu velha!\nNinguém ganhou.");
        return;
      }

    } while (!jogoAcabou);

    System.out.println(jogoDaVelha);
    System.out.println("Jogador " + ((jogoDaVelha.vezJogador1()) ? 1 : 2) + " Venceu!");
  }
}
