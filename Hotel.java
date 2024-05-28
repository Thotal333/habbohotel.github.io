public class Hotel {
    private int id;
    private String nome;
    private String endereco;
    private int quartos;

    // Construtores, getters e setters
    public Hotel(int id, String nome, String endereco, int quartos) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = quartos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
}
