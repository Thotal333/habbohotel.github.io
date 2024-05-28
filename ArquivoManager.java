import java.util.ArrayList;
import java.util.List;

public class ArquivoManager {
    private List<Hotel> hoteis;

    public ArquivoManager() {
        this.hoteis = new ArrayList<>();
    }

    public void salvarDados(List<Hotel> hoteis) {
        // Implementar lógica para salvar dados em arquivo
        this.hoteis = hoteis;
    }

    public List<Hotel> recuperarDados() {
        // Implementar lógica para recuperar dados de arquivo
        return this.hoteis;
    }
}
