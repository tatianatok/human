public class Main {
    public static void main(String[] args) {
        human maxim = new human("Максим", -1990, "Москва", "инженер");
        human anna = new human("Анна", 1991, "", "дизайнер");
        human katy = new human("Катя", 1993, "Владивосток", "");
        human artem = new human("Артем", 1980, "Казань", "водитель");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(katy);
        System.out.println(artem);
    }
}