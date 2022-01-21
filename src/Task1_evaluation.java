public class Task1_evaluation {
    private double notaTeoría, notaTrabajos, notaFinal;
    private boolean Practicas;
    private String s = "Nota final:";

    public Task1_evaluation() {
        this.notaTeoría = 0;
        this.notaTrabajos = 0;
        this.notaFinal = 0;
        Practicas = false;
    }

    public void setNotaTeoría(double notaTeoría) {
        this.notaTeoría = notaTeoría;
    }

    public void setNotaTrabajos(double notaTrabajos) {
        this.notaTrabajos = notaTrabajos;
    }

    public void setPracticas(boolean practicas) {
        Practicas = practicas;
    }

    public void evaluate() {
        if (!Practicas) {           //Si no hay prácticas, no se permite evaluación. NF = 4
            notaFinal = 4;
        } else if (notaTeoría < 4.5) {      //Si NT < 4.5, NF = NT. Suspenso.
            notaFinal = notaTeoría;
        } else {                                    //Si NT >= 4.5, permite evaluación y sumar NTr
            notaFinal = notaTeoría + notaTrabajos;
        }

        if (notaFinal >= 10) {
            s += " Matrícula de honor";
        } else {
            s += " " + notaFinal;
        }
        System.out.println(s);
    }
}

/*
Leer nota Teoría
Leer Prácticas
Leer nota Trabajos

if (NP = NO APTO) {
    NF = 4
} else if ( NT < 4.5) {
    NF = NT
} else {
    NT = NT + NTr
}
if { NF >= 10) {
    stringN += "Matrícula
} else {
    stringN += NF
}
sout stringN
 */
