public class Main {
    public static void main(String[] args) {

        int secondAge = 15;
        if (secondAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (secondAge >=5 && secondAge <= 14) {
            System.out.println("Ребенок может кататься на аттракицоне в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }

    }
}