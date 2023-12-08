    public class Main {
        public static void main(String[] args) {

            //automobile

            Automobile auto = new Automobile();
            auto.accelerare(30);
            auto.decelerare(10);
            auto.fermarsi();

            System.out.println(); //separo outputs

            //moto

            Moto moto = new Moto();
            moto.accelerare(20);
            moto.decelerare(5);
            moto.fermarsi();
        }
    }
