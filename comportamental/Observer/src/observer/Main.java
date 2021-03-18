package observer;

/**
 *
 * @author eduarda
 */
public class Main {

    public static void main(String[] args) {
        MembroEmail mem_e1 = new MembroEmail("duda@gmail.com");
        MembroEmail mem_e2 = new MembroEmail("bia@hotmail.com");

        CaixaEntradaGrupo cx_e = new CaixaEntradaGrupo();
        cx_e.addObserver(mem_e1);
        cx_e.addObserver(mem_e2);
        
        cx_e.setNovaMensagem("Hello, mi amigos.");

    }
    
}
