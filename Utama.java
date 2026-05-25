public class Utama {
    public static void main(String[] args) {

        Percobaan9 o = new Percobaan9();

        o.methodA();

        try {
            o.methodB();
        }
        catch(Exception e) {
            System.out.println("Error di Method B");
        }
        finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}