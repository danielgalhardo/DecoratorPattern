import java.util.Random;

public class AnaoDeJardim extends JardimDecorator {

    private int codigo;
    public AnaoDeJardim(IJardim jardim, int codigo)
    {
        super(jardim);
        if(codigo != 0 && codigo != 1 && codigo != 2) throw new IllegalArgumentException("Codigo invalido");
        this.codigo = codigo;
    }

    public String enfeite()
    {
        return super.enfeite() + adicionaAnaoDeJardim();
    }

    private String  adicionaAnaoDeJardim()
    {
        switch(this.codigo) {
            case 0:
                return " Anao Elfo;";
            case 1:
                return " Anao Construtor;";
            case 2:
                return "  Anao Policial;";
        }
        throw new IllegalArgumentException("Codigo invalido");
    }
}
