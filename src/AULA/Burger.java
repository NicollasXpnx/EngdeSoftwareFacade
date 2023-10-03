package AULA;

public class Burger extends Produto
{
    String tamanho;

    public Burger(final String descricao, final double preco, final String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(final String tamanho) {
        this.tamanho = tamanho;
    }
}
