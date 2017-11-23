
public class Student extends Person {
    int numCourses=0;
    String[] courses={};
    int[] grades = {};
    int aux=0;
    public Student(String name, String address) {
        super(name, address);
        this.name= name;
        this.address= address;
    }    
    public void addCourseGrade(String course, int grade){
        grades[aux] = grade;
        courses[aux] = course;
        aux++;
    }
    public void printGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
    public double getAverageGrade(){
        int n1=0;
        for (int i = 0; i < grades.length; i++) {
            n1+=grades[i];
        }
        return n1/grades.length;
    }
    public String toString(){
        return "Student: "+name+"("+address+")";
    }
    
    
    
        
}
