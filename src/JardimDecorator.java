public abstract class JardimDecorator implements IJardim {
    private IJardim jardim;

    public JardimDecorator(IJardim jardim) {
        this.jardim = jardim;
    }
    @Override
    public String enfeite() {
        return jardim.enfeite();
    }
}
