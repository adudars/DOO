/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author eduarda
 */
public class MembroEmail implements Observer{
    private String email;
  
    public MembroEmail(String email) {
      this.email = email;
    }

    @Override
    public void update(Observable observer) {
        CaixaEntradaGrupo cx_e = (CaixaEntradaGrupo) observer;
        if (!"".equals(cx_e.getMensagem())){
          System.out.println("Mensagem nova: " + cx_e.getMensagem());
        }
    }
}
