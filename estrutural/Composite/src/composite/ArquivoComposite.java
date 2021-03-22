package composite;

import java.util.ArrayList;

/**
 *
 * @author eduarda
 */
public class ArquivoComposite extends ArquivoComponent {
 
    ArrayList<ArquivoComponent> arquivos = new ArrayList<ArquivoComponent>();
 
    public ArquivoComposite(String nomeDoArquivo) {
        this.nome = nomeDoArquivo;
    }
 
    public void printNomeDoArquivo() {
        System.out.println(this.nome);
        for (ArquivoComponent arquivoTmp : arquivos) {
            arquivoTmp.printNomeDoArquivo();
        }
    }
 
    public void adicionarArquivo(ArquivoComponent novoArquivo) {
        this.arquivos.add(novoArquivo);
    }
 
    public void removerArquivo(String nomeDoArquivo) throws Exception {
        for (ArquivoComponent arquivo : arquivos) {
            if (arquivo.getNomeDoArquivo() == nomeDoArquivo) {
                this.arquivos.remove(arquivo);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
 
    @Override
    public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
        for (ArquivoComponent arquivo : arquivos) {
            if (arquivo.getNomeDoArquivo() == nomeDoArquivo) {
                return arquivo;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
}
 
