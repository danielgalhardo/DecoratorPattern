public class FonteDeJardim extends  JardimDecorator {

    private int codigo;

    public FonteDeJardim(IJardim jardim, int codigo)
    {
        super(jardim);
        if(codigo != 0 && codigo != 1 && codigo != 2) throw new IllegalArgumentException("Codigo invalido");
        this.codigo = codigo;
    }


    public String enfeite() {

        return super.enfeite() + adicionaFonteDeJardim();
    }

    private String  adicionaFonteDeJardim()
    {
        switch(this.codigo) {
            case 0:
                return " Fonte Simples;";
            case 1:
                return " Fonte Antiga;";
            case 2:
                return " Fonte Iluminada;";
        }
        throw new IllegalArgumentException("Codigo invalido");
    }
}
