public class DevSuma {
    private int num1;
    private int num2;



    public DevSuma(int num1, int num2 ){
        this.num1 = num1;
        this.num2 = num2;

    }

    public int sumar(){
        int suma = 0;
        suma = this.num1 + this.num2;
        return suma;
    }

}
