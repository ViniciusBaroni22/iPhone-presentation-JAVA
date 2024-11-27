public class AparelhoTelefonico implements Telefonico {
  private String numeroTelefone;

  public AparelhoTelefonico(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
  }

  public String getNumeroTelefone() {
    return numeroTelefone;
  }

  public void setNumeroTelefone(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
  }

  @Override
  public void fazerChamada() {
    System.out.println("Fazendo chamada.");
  }

  @Override
  public void receberChamada() {
    System.out.println("Recebendo chamada.");
  }
}
