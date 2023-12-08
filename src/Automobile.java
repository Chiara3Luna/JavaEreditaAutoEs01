    public class Automobile implements Veicolo {
        private int velocita;

        @Override
        public void accelerare(int valore) {
            velocita += valore;
            System.out.println("Automobile accelerata. Nuova velocità: " + velocita);
        }

        @Override
        public void decelerare(int valore) {
            velocita -= valore;
            System.out.println("Automobile decelerata. Nuova velocità: " + velocita);
        }

        @Override
        public void fermarsi() {
            velocita = 0;
            System.out.println("Automobile fermata.");
        }
    }

