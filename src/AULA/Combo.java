package AULA;

public class Combo
{
    private Bebida bebida;
    private Sobremesa sobre;
    private Burger burg;

    public Combo() {
        this.bebida = new Bebida((String)null, 0.0, 0);
        this.sobre = new Sobremesa((String)null, 0.0, (String)null);
        this.burg = new Burger(null, 0.0, null);
    }

    public void CriarCombo(final int tipo) {
        if (tipo == 1) {
            this.burg.setTamanho("150 Gramas");
            this.burg.setDescricao("Uma delicia");
            this.sobre.setTamanho("M");
            this.burg.setPreco(40.5);
            this.bebida.setMl(250);
        }
        else if (tipo == 2) {
            this.burg.setTamanho("300 Gramas");
            this.sobre.setTamanho("G");
            this.burg.setPreco(60.5);
            this.bebida.setMl(600);
        }
    }

    @Override
    public String toString() {
        return "SEU COMBO:  " + this.burg.getTamanho() + "\n" + this.sobre.getTamanho() + "\n" + this.bebida.getMl() + "mL";
    }
}
