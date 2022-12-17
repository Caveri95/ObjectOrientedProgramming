public class Main {
    public static void main(String[] args) {

        Human Maks = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human Anna = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human Kate = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human Artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Human Vladimir = new Human("Владимир", 2001, "Казань", "нигде не работает");

        System.out.println(Maks);
        System.out.println(Anna);
        System.out.println(Kate);
        System.out.println(Artem);
        System.out.println(Vladimir);

        Flower rose = new Flower("роза", "Голландия", 35.59);
        Flower chrysanthemum = new Flower("харизантема", null, 15, 5);
        Flower peony = new Flower("пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("гипсофила", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);



    }
}