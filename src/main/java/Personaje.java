public class Personaje {
    private int x;
    private int y;

    public Personaje() {
        this.x = 0;
        this.y = 0;
    }

    public void moverDerecha() {
        (this.x)++;
    }

    public void moverIzquierda() {
        (this.x)--;
    }

    public void moverAbajo() {
        (this.y)--;
    }

    public void moverArriba() {
        (this.y)++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
