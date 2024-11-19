package example.structural.composite;

public class Main {
    public static void main(String[] args) {
        Arquivo meuArquivo = new ArquivoSimples("Documento.docx");
        Arquivo minhaMusica = new ArquivoSimples("Musica.mp3");
        Arquivo arquivoZipado = new ArquivoZipado("Arquivo Compactado", 10);

        Pasta minhaPasta = new Pasta("Minha Pasta");
        minhaPasta.adicionar(meuArquivo);
        minhaPasta.adicionar(minhaMusica);
        minhaPasta.adicionar(arquivoZipado);

        minhaPasta.mostrar();
    }
}

