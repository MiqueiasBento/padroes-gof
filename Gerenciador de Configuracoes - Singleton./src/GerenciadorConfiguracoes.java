
// Classe Singleton
public class GerenciadorConfiguracoes {
    // 1. Atributo estático para armazenar a instância única
    private static GerenciadorConfiguracoes instancia;

    // 2. Construtor privado para impedir instanciação direta
    private GerenciadorConfiguracoes() {
        // Carrega as configurações do sistema
        System.out.println("Configurações carregadas.");
    }

    // 3. Metodo estático para acessar a instância única
    public static GerenciadorConfiguracoes getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorConfiguracoes();
        }
        return instancia;
    }

    // Métodos de negócio
    public String getConfiguracao(String chave) {
        // Simulação de busca de configuração
        return "Valor da configuração: " + chave;
    }
}
