public class Task2_Mcd {
    private int n1;
    private int n2;

    public Task2_Mcd() {
        n1 = 0;
        n2 = 0;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int calculoMcd() {
        int num1;
        int num2 = n1;
        int num3 = n2;

        do {
            num1 = num2;
            num2 = num3;
            num3 = num1 % num2;
            //System.out.println(num1 +" / " + num2 + " = " + num3);
        } while (num3 != 0);

        //System.out.println("Mcd = " + num2);
        return num2;
    }
}