import java.util.HashMap;
import java.util.Objects;

public class Human {

    public String name;
    private String town;
    public String jobTitle;
    private final int yearOfBirth;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {

        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }

        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return  "Привет! Меня зовут " + name  +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle +
                ". Будем знакомы!";
    }
    public String getName() {
        return name;
    }
    public String getTown() {
        return town;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
    }
    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth &&
                Objects.equals(name, human.name) &&
                Objects.equals(town, human.town) &&
                Objects.equals(jobTitle, human.jobTitle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, town, jobTitle, yearOfBirth);
    }
}
