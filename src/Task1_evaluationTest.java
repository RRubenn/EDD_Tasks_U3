import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1_evaluationTest {

    @Test
    void evaluate() {
        Task1_evaluation ev = new Task1_evaluation();
        //.....................................Camino independiente (1)
        ev.setPracticas(true);      //Practicas: true
        ev.setNotaTeoría(5);        //NT >= 4.5
        ev.setNotaTrabajos(5);      //NTr >= (10 - NT)
        ev.evaluate();

        Task1_evaluation ev2 = new Task1_evaluation();
        //.....................................Camino independiente (2)
        ev2.setPracticas(true);      //Practicas: true
        ev2.setNotaTeoría(5);        //NT >= 4.5
        ev2.setNotaTrabajos(4.1);    //NTr < (10 - NT)
        ev2.evaluate();

        Task1_evaluation ev3 = new Task1_evaluation();
        //.....................................Camino independiente (3)
        ev3.setPracticas(true);     //Practicas: true
        ev3.setNotaTeoría(4.2);     //NT < 4.5
        ev3.setNotaTrabajos(6);     //Indiferente
        ev3.evaluate();
        Task1_evaluation ev4 = new Task1_evaluation();
        //.....................................Camino independiente (4)
        ev4.setPracticas(false);     //Practicas: false
        ev4.setNotaTeoría(8);       //Indiferente
        ev4.setNotaTrabajos(8);     //Indiferente
        ev4.evaluate();
    }
}