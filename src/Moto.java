    public class Moto implements Veicolo {
        private int velocita;

        @Override
        public void accelerare(int valore) {
            velocita += valore;
            System.out.println("Moto accelerata. Nuova velocità: " + velocita);
        }

        @Override
        public void decelerare(int valore) {
            velocita -= valore;
            System.out.println("Moto decelerata. Nuova velocità: " + velocita);
        }

        @Override
        public void fermarsi() {
            velocita = 0;
            System.out.println("Moto fermata.");
        }
    }
