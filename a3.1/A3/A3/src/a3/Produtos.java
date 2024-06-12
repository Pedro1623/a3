
package a3;


public class Produtos {
    private int id;
    private String Nome;
    private String Marca;
    private float Custo;
    private float Venda;
    private int Quantidade;

    public Produtos() {
    }

    public Produtos(int id, String Nome, String Marca, float Custo, float Venda, int Quantidade) {
        this.id = id;
        this.Nome = Nome;
        this.Marca = Marca;
        this.Custo = Custo;
        this.Venda = Venda;
        this.Quantidade = Quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public float getCusto() {
        return Custo;
    }

    public void setCusto(float Custo) {
        this.Custo = Custo;
    }

    public float getVenda() {
        return Venda;
    }

    public void setVenda(float Venda) {
        this.Venda = Venda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

       
}
