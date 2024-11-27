public class NavegadorInternet implements Navegador {
  private String urlAtual;

  public NavegadorInternet(String urlAtual) {
    this.urlAtual = urlAtual;
  }

  public String getUrlAtual() {
    return urlAtual;
  }

  public void setUrlAtual(String urlAtual) {
    this.urlAtual = urlAtual;
  }

  @Override
  public void navegar() {
    System.out.println("Navegando.");
  }

  @Override
  public void voltar() {
    System.out.println("Voltando.");
  }
}
