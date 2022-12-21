public class human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String job;


    public human(String name, int yearOfBirth, String town, String job) {
        if (name == null || name.equals("")) {
            this.name = "нет данных";
        } else {
            this.name = name;
        }

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (town == null || town.equals("") ) {
            this.town = "нет данных";
        } else {
            this.town = town;
        }

        if (job == null || job.equals("")) {
            this.job = "нет данных";
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.equals("")) {
            this.town = "нет данных";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + getTown() + ". Год моего рождения "
                + getYearOfBirth() + ". Я работаю на должности " + this.job + ". Будем знакомы!";
    }
}

