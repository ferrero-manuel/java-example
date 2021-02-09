import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {
    @Test
    public void testPersonajeSeMueveDerecha() {
        Personaje unPersonaje = new Personaje();

        unPersonaje.moverDerecha();

        assertEquals(unPersonaje.getX(), 1);
    }

    @Test
    public void testPersonajeSeMueveIzquierda() {
        Personaje unPersonaje = new Personaje();

        unPersonaje.moverIzquierda();

        assertEquals(unPersonaje.getX(), -1);
    }

    @Test
    public void testPersonajeSeMueveArriba() {
        Personaje unPersonaje = new Personaje();

        unPersonaje.moverArriba();

        assertEquals(unPersonaje.getY(), 1);
    }

    @Test
    public void testPersonajeSeMueveAbajo() {
        Personaje unPersonaje = new Personaje();

        unPersonaje.moverAbajo();

        assertEquals(unPersonaje.getY(), -1);
    }
}
