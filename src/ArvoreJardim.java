public class ArvoreJardim  extends  JardimDecorator
{
    private int codigo;
    public ArvoreJardim(IJardim jardim, int codigo)
    {
        super(jardim);
        if(codigo != 0 && codigo != 1 && codigo != 2) throw new IllegalArgumentException("Codigo invalido");
        this.codigo = codigo;
    }


    public String enfeite()
    {
        return super.enfeite() + adicionaArvoreDeJardim();
    }

    private String  adicionaArvoreDeJardim( )
    {
        switch(this.codigo) {
            case 0:
                return " Pé de Manga;";
            case 1:
                return " Pé de Jambo;";
            case 2:
                return " Pé de Laranja;";
        }
        throw new IllegalArgumentException("Codigo invalido");
    }
}
