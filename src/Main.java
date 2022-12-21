public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        human maxim = new human("Максим", currentYear - 30, "Москва", "инженер");
        human anna = new human("Анна", currentYear - 28, "", "дизайнер");
        human katy = new human("Катя", currentYear - 40, "Владивосток", "");
        human artem = new human("Артем", currentYear - 22, "Казань", "водитель");
        human vladimir = new human( "Владимир", currentYear - 21, "Казань", "безработный");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(katy);
        System.out.println(artem);
        System.out.println(vladimir);
    }
}