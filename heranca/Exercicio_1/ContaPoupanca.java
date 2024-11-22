
import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
  private int diaRendimento;

  // setter
  public void setDiaRendimento(int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  // metodos
  public boolean calcularNovoSaldo(double taxaRendimento) {

    Calendar hoje = Calendar.getInstance();

    if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
      this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return String.format("\n%s\n%s: %d\n%s", "[Conta Poupança]",
        "Dia de Rendimento", diaRendimento, super.toString());
  }
}
