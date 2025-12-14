import java.util.List;

public class Student {

    private String name;
    private Long id;
    private Integer age;
    private List<Double>grades;

    public Student(String name, Long id, Integer age, List<Double> grades) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grades = grades;
    }

    public void addGrade(Double g){
        if(g<0.0 && g>5.0){
            return;
        }
        grades.add(g);
    }

    public Double gradesAverage(){
        return grades.stream()
        .mapToDouble(Double::doubleValue) //Se mapea el stream a double para acceder al metodo .average
        .average()
        .orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student \nname =" + name + 
        "\nid = " + id + 
        "\nage = " + age + 
        "\ngrades = " + grades + "";
    }

    

    

    
    
}
