package composite;

/**
 *
 * @author eduarda
 */
public class ArquivoComponent {
 
    String nome;
 
    public void printNomeDoArquivo() {
        System.out.println(this.nome);
    }
 
    public String getNomeDoArquivo() {
        return this.nome;
    }
 
    public void adicionarArquivo(ArquivoComponent novoArquivo) throws Exception {
        throw new Exception("Não pode inserir arquivos em: "
                + this.nome + " - Não é uma pasta");
    }
 
    public void removerArquivo(String nomeDoArquivo) throws Exception {
        throw new Exception("Não pode remover arquivos em: "
                + this.nome + " -Não é uma pasta");
    }
 
    public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
        throw new Exception("Não pode pesquisar arquivos em: "
                + this.nome + " - Não é uma pasta");
    }
}