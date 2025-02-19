
public class Main {
    public static void main(String[] args) {
        // Acessando a instância única do Gerenciador de Configurações
        GerenciadorConfiguracoes gerenciador = GerenciadorConfiguracoes.getInstancia();

        // Usando o gerenciador
        System.out.println(gerenciador.getConfiguracao("url_banco_dados"));
        System.out.println(gerenciador.getConfiguracao("api_key"));

        // Verificando que é a mesma instância
        GerenciadorConfiguracoes outroGerenciador = GerenciadorConfiguracoes.getInstancia();
        System.out.println("Mesma instância? " + (gerenciador == outroGerenciador)); // true
    }
}