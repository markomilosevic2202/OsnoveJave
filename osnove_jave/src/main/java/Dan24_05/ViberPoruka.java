package Dan24_05;

public class ViberPoruka {
    private String tekst;
    private String vreme;
    private Korisnik poslao;
    private Korisnik primio;

    public ViberPoruka() {
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public Korisnik getPoslao() {
        return poslao;
    }

    public void setPoslao(Korisnik poslao) {
        this.poslao = poslao;
    }

    public Korisnik getPrimio() {
        return primio;
    }

    public void setPrimio(Korisnik primio) {
        this.primio = primio;
    }
    public void reakcija(){

    }

}
