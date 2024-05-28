import java.util.HashMap;
import java.util.Map;

public class EstoqueManager {
    private Map<String, Integer> estoque;

    public EstoqueManager() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(String produto, int quantidade) {
        estoque.put(produto, estoque.getOrDefault(produto, 0) + quantidade);
    }

    public void removerProduto(String produto, int quantidade) {
        if (estoque.containsKey(produto)) {
            estoque.put(produto, estoque.get(produto) - quantidade);
            if (estoque.get(produto) <= 0) {
                estoque.remove(produto);
            }
        }
    }

    public int verificarEstoque(String produto) {
        return estoque.getOrDefault(produto, 0);
    }
}
