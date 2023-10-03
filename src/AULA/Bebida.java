package AULA;

public class Bebida extends Produto
{
    int Ml;

    public Bebida(final String descricao, final double preco, final int Ml) {
        super(descricao, preco);
        this.Ml = Ml;
    }

    public int getMl() {
        return this.Ml;
    }

    public void setMl(final int ml) {
        this.Ml = ml;
    }
}
