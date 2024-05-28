import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação do ArrayList de hotéis
        List<Hotel> listaDeHoteis = new ArrayList<>();
        
        // Criação das instâncias das classes gerenciadoras
        ArquivoManager arquivoManager = new ArquivoManager();
        HotelManager hotelManager = new HotelManager(listaDeHoteis);
        VendaManager vendaManager = new VendaManager();
        EstoqueManager estoqueManager = new EstoqueManager();

        // Exemplo de uso das funcionalidades
        Hotel hotel1 = new Hotel(1, "Hotel A", "Endereço A", 100);
        Hotel hotel2 = new Hotel(2, "Hotel B", "Endereço B", 150);

        hotelManager.cadastrarHotel(hotel1);
        hotelManager.cadastrarHotel(hotel2);

        double venda = vendaManager.calcularVenda(200, 3);
        double vendaComDesconto = vendaManager.aplicarDesconto(venda, 10);

        estoqueManager.adicionarProduto("Sabonete", 50);
        estoqueManager.removerProduto("Sabonete", 10);

        System.out.println("Venda com desconto: " + vendaComDesconto);
        System.out.println("Estoque de sabonete: " + estoqueManager.verificarEstoque("Sabonete"));
        
        // Salvar e recuperar dados
        arquivoManager.salvarDados(listaDeHoteis);
        List<Hotel> dadosRecuperados = arquivoManager.recuperarDados();
    }
}
