package templateexemplo;

import java.io.IOException;


public class TemplateMain {

   
    public static void main(String[] args) throws IOException {
      String texto = "linha 1\n" + "linha2\n" + "fim\n";
      
      FileWord word = new FileWord();
      word.export(texto);
      
      FileHtml html = new FileHtml();
      html.export(texto);
    }
    
}
