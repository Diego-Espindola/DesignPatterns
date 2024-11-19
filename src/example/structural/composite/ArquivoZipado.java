package example.structural.composite;

public class ArquivoZipado implements Arquivo {

    private String nome;
    private Integer quantidadeArquivos; 
    
    public ArquivoZipado(String nome, Integer quantidadeArquivos) {
        this.nome = nome;
        this.quantidadeArquivos = quantidadeArquivos;
    }

    @Override
    public void mostrar() {
        System.out.println("Arquivo Zipado: " + nome + ", quantidade: " + quantidadeArquivos);
    }

}
