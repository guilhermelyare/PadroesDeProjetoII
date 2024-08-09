import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ConfiguracaoJogoSingleton {
    private static ConfiguracaoJogoSingleton instancia;
    private ConfiguracaoJogo configuracao;

    private ConfiguracaoJogoSingleton() {
        carregarConfiguracao();
    }

    public static ConfiguracaoJogoSingleton getInstancia() {
        if (instancia == null) {
            System.out.println("Criando uma nova intância");
            instancia = new ConfiguracaoJogoSingleton();
        }
        return instancia;
    }

    private void carregarConfiguracao() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/cgti/Documents/Padrões de Projeto/PadroesDeProjetoII/Singleton/configuracao.txt"))) {
            String linha;
            configuracao = new ConfiguracaoJogo();
    
            Map<String, Consumer<String>> setters = new HashMap<>();
            setters.put("AppId", (valor) -> configuracao.setAppId(Integer.parseInt(valor)));
            setters.put("UserName", configuracao::setUserName);
            setters.put("Language", configuracao::setLanguage);
            setters.put("Offline", (valor) -> configuracao.setOffline(Boolean.parseBoolean(valor)));
            setters.put("AutoDLC", (valor) -> configuracao.setAutoDLC(Boolean.parseBoolean(valor)));
            setters.put("BuildId", (valor) -> configuracao.setBuildId(Integer.parseInt(valor)));
            setters.put("DLCName", configuracao::setDlcName);
            setters.put("UpdateDB", (valor) -> configuracao.setUpdateDB(Boolean.parseBoolean(valor)));
            setters.put("Signature", configuracao::setSignature);
            setters.put("WindowInfo", configuracao::setWindowInfo);
            setters.put("LVWindowInfo", configuracao::setLvWindowInfo);
            setters.put("ApplicationPath", configuracao::setApplicationPath);
            setters.put("WorkingDirectory", configuracao::setWorkingDirectory);
            setters.put("WaitForExit", (valor) -> configuracao.setWaitForExit(Boolean.parseBoolean(valor)));
            setters.put("NoOperation", (valor) -> configuracao.setNoOperation(Boolean.parseBoolean(valor)));
    
            while ((linha = reader.readLine()) != null) {
                if (linha.isEmpty()) {
                    continue;
                }
    
                String[] partes = linha.split("=", 2); 
                if (partes.length < 2) {
                    System.out.println("Formato de linha inválido: " + linha);
                    continue;
                }
    
                String chave = partes[0].trim();
                String valor = partes[1].trim();
    
                Consumer<String> setter = setters.get(chave);
                if (setter != null) {
                    setter.accept(valor);
                } else {
                    System.out.println("Chave não encontrada: " + chave);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public ConfiguracaoJogo getConfiguracao() {
        return configuracao;
    }
}
