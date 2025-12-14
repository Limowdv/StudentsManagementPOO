import java.util.List;
import java.util.stream.Collectors;

public class School {

    private String name;
    private List<Course> courses;

    public School(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public void addCourse(Course c){
        if(c==null){
            return;
        }
        courses.add(c);
    }

    public Course findCourseByName(String name){
        return courses.stream()
        .filter(c -> c.getName().equalsIgnoreCase(name) || c.getName().toUpperCase().contains(name.toUpperCase()))
        .findFirst()
        .orElse(null);
    }

    public List<Student> getAllTheStudents(){
        return courses.stream()
        .flatMap(c -> c.getStudents().stream())
        .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "School name=" + name + ", courses=" + courses + "";
    }

    

    

    
    
}
