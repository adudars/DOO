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
        
        MembroWhatsApp mem_wpp1 = new MembroWhatsApp(9238);
        MembroWhatsApp mem_wpp2 = new MembroWhatsApp(4353);
        
        CaixaEntradaGrupo cx_e2 = new CaixaEntradaGrupo();
        cx_e2.addObserver(mem_wpp1);
        cx_e2.addObserver(mem_wpp2);
        
        cx_e2.setNovaMensagem("Hola, my friends.");

        

    }
    
}
