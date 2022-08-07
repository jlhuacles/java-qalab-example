public class MainResta {

        private int num1;
        private int num2;



        public MainResta(int num1, int num2 ){
            this.num1 = num1;
            this.num2 = num2;

        }

        public int restar(){
            int suma = 0;
            suma = this.num1 - this.num2;
            return suma;
        }



}
