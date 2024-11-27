public class ReprodutorMusical implements Reprodutor {
  private String musicaAtual;

  public ReprodutorMusical(String musicaAtual) {
    this.musicaAtual = musicaAtual;
  }

  public String getMusicaAtual() {
    return musicaAtual;
  }

  public void setMusicaAtual(String musicaAtual) {
    this.musicaAtual = musicaAtual;
  }

  @Override
  public void reproduzir() {
    System.out.println("Reproduzindo música.");
  }

  @Override
  public void pausar() {
    System.out.println("Música pausada.");
  }

  @Override
  public void parar() {
    System.out.println("Música parada.");
  }
}
