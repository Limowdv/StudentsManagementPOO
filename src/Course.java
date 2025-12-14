import java.util.List;
import java.util.stream.Collectors;

public class Course {

    private String name;
    private Integer maxCapacity;
    private List<Student>students;

    public Course(String name, Integer maxCapacity, List<Student> students) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.students = students;
    }

    public void addStudent(Student s){
        if(s==null){
            return;
        }
        students.add(s);
    }

    public Double getGeneralAverage(){
        return students.stream()
        .flatMap(s -> s.getGrades().stream()) //Aplanar las dos listas 
        .mapToDouble(Double::doubleValue)
        .average()
        .orElse(0.0);
    }

    public List<Student>getApproveds(){
        return students.stream()
        .filter(s -> s.gradesAverage() >= 3.0)
        .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + ", maxCapacity=" + maxCapacity + ", students=" + students + "]";
    }

    

    

    
}
