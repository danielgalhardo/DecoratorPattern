
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public  class JardimDecoratorTest {

    @Test
    public void deveRetornarJardimComAnaoPolicial()
    {
        IJardim meuJardim = new AnaoDeJardim(new Jardim(), 2);
        assertEquals(meuJardim.enfeite(), "Decorações do Jardim:  Anao Policial;");
    }

    @Test
    public void deveRetornarJardimComPeDeMangaEFonteSimples()
    {
        IJardim meuJardim = new ArvoreJardim(new FonteDeJardim(new Jardim(),0),0);
        assertEquals(meuJardim.enfeite(), "Decorações do Jardim: Fonte Simples; Pé de Manga;");
    }

    @Test

    public void deveRetornarExcessaoCodigoInexistente()
    {
        try
        {
            IJardim meuJardim = new AnaoDeJardim(new Jardim(), 4);
            fail();
        }
        catch (IllegalArgumentException ex)
        {
            assertEquals("Codigo invalido", ex.getMessage());
        }
    }
}
