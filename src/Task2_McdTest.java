import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2_McdTest {

    @Test
    void calculoMcd() {
        Task2_Mcd mcd1 = new Task2_Mcd();        //Prueba válida
        mcd1.setN1(156);
        mcd1.setN2(120);
        int esperado1 = 12;
        assertEquals(esperado1, mcd1.calculoMcd());
    }

    @Test
    void calculoMcd2() {
        Task2_Mcd mcd2 = new Task2_Mcd();        //Prueba no válida
        mcd2.setN1(72);
        mcd2.setN2(16);
        int esperado2 = 4;
        assertEquals(esperado2, mcd2.calculoMcd());
    }
}

