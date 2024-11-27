public class Main {
  public static void main(String[] args) {
    iPhone iphone = new iPhone("iPhone 14", 128);
    iphone.ligar();

    ReprodutorMusical reprodutor = new ReprodutorMusical("Música");
    reprodutor.reproduzir();

    AparelhoTelefonico telefone = new AparelhoTelefonico("123456789");
    telefone.fazerChamada();

    NavegadorInternet navegador = new NavegadorInternet("(link unavailable)");
    navegador.navegar();
  }
}
