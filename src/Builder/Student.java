package Builder;

/**
 * Builder pattern helps when there are a lot of properties and we need to set some at time of creation
 * depending on the need, either we create constructors with different combinations or we implement
 * builder pattern.
 *
 * @author Amin Motiwala
 */
public class Student {
    String firstName;
    String lastName;
    Integer idNumber;
    String grade;

    private Student(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public String getGrade() {
        return grade;
    }

    private Student(StudentBuilder b){
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.idNumber = b.idNumber;
        this.grade = b.grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static class StudentBuilder{
        String firstName;
        String lastName;
        Integer idNumber;
        String grade;

        public StudentBuilder(Integer idNumber){
            this.idNumber = idNumber;
        }

        public StudentBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setGrade(String grade){
            this.grade = grade;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
