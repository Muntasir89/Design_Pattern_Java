public class CollegeStudent implements Student{
    String name;
    String SurName;
    String email;

    public CollegeStudent(String name, String surname, String email){
        this.name = name;
        this.SurName = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getSurName() {
        return SurName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
