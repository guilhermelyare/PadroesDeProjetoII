public class Main {
    public static void main(String[] args) {
        ConfiguracaoJogo configuracao = ConfiguracaoJogoSingleton.getInstancia().getConfiguracao();
        System.out.println("AppId: " + configuracao.getAppId());

        ConfiguracaoJogo configuracao2 = ConfiguracaoJogoSingleton.getInstancia().getConfiguracao();
        System.out.println("AppId: " + configuracao2.getAppId());
        System.out.println("Username: " + configuracao2.getUserName());
    }
}