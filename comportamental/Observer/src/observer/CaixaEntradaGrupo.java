package observer;

/**
 *
 * @author eduarda
 */
public class CaixaEntradaGrupo extends Observable {
  private String mensagem;

  public void setNovaMensagem(String msg) {
    this.mensagem = msg;

    notifyObserver();
  }

  public String getMensagem(){
    return this.mensagem;
  }
}