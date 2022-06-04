package Dan02_06Z4;

public class JednakostranicniTrougao extends Figura{
    private int a;

    public JednakostranicniTrougao(int a) {
        this.a = a;
    }

    public JednakostranicniTrougao() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int povrsina() {
        return a*a;
    }

    @Override
    public int obim() {
        return 3*a;
    }
}
