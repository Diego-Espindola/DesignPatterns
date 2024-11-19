package example.structural.proxy;

public class Cliente {
    public static void main(String[] args) {
        Imagem imagem = new ProxyImagem("imagem_teste.jpg");
        System.out.println("Criou e salvou o arquivo, sem carregar ainda, apenas no this.arquivo");
        // A imagem não será carregada neste momento
        imagem.exibir(); // Aqui a imagem será carregada e exibida
        imagem.exibir();

    }
}
