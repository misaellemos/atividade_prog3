
public class Principal {

  public static void main(String[] args) {
    PessoaFisica p1 = new PessoaFisica();
    p1.setNome("Contribuinte 01");
    p1.setRendaBruta(600);
    p1.setCpf("123.456.789-00");

    PessoaJuridica p2 = new PessoaJuridica();
    p2.setNome("Contribuinte 02");
    p2.setRendaBruta(1600);
    p2.setCnpj("12.345.678/0000-99");

    PessoaFisica p3 = new PessoaFisica();
    p3.setNome("Contribuinte 03");
    p3.setRendaBruta(2600);
    p3.setCpf("123.456.789-11");

    PessoaJuridica p4 = new PessoaJuridica();
    p4.setNome("Contribuinte 04");
    p4.setRendaBruta(3600);
    p4.setCnpj("12.345.678/9999-00");

    PessoaFisica p5 = new PessoaFisica();
    p5.setNome("Contribuinte 05");
    p5.setRendaBruta(4600);
    p5.setCpf("123.456.789-22");

    PessoaJuridica p6 = new PessoaJuridica();
    p6.setNome("Contribuinte 06");
    p6.setRendaBruta(5600);
    p6.setCnpj("12.345.678/0909-09");

    Contribuinte[] contribuintes = new Contribuinte[6];
    contribuintes[0] = p1;
    contribuintes[1] = p2;
    contribuintes[2] = p3;
    contribuintes[3] = p4;
    contribuintes[4] = p5;
    contribuintes[5] = p6;

    for (Contribuinte c : contribuintes) {
      System.out.println(c.toString());
    }
  }
}
