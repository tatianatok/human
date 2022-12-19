public class human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String job;

    public human (String name, int yearOfBirth, String town, String job) {
        if (name == null || name.equals("")) {
            this.name = "нет данных";
        } else {
            this.name = name;
        }

        if (town == null || town.equals("")) {
            this.town = "нет данных";
        }else{
            this.town = town;
        }

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (job == null || job.equals("")) {
            this.job = "нет данных";
        }else {
            this.job = job;
        }
    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Год моего рождения "
                + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!";
    }
}
