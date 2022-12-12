import java.util.HashMap;
import java.util.Objects;

public class Human {

    String name;
    String town;
    String jobTitle;
    int yearOfBirth;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town ;
        this.jobTitle = jobTitle;
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
        this.name = name;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(town, human.town) && Objects.equals(jobTitle, human.jobTitle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, town, jobTitle, yearOfBirth);
    }

}
