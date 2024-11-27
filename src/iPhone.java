public class iPhone {
  private String modelo;
  private int capacidade;

  public iPhone(String modelo, int capacidade) {
    this.modelo = modelo;
    this.capacidade = capacidade;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public void ligar() {
    System.out.println("iPhone ligado.");
  }
}
