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
public class MembroWhatsApp implements Observer{
    private int numero;
  
    public MembroWhatsApp(int num) {
      this.numero = num;
    }

    @Override
    public void update(Observable observer) {
        CaixaEntradaGrupo cx_e = (CaixaEntradaGrupo) observer;
        if (!"".equals(cx_e.getMensagem())){
          System.out.println("Mensagem nova!");
        }
    }
}
