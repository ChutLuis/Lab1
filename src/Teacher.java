public class Teacher extends Person{
    int numCourses=0;
    String[] Courses={};
    int aux=0;
    public Teacher(String name, String address){
        super(name,address);
        this.name= name;
        this.address= address;
    }
    public boolean addCourse(String course){
        if(course!=Courses[aux]){return false;}
        Courses[aux]= course;
        aux++;
        return true;       
        
    }
    public boolean removeCourse(String course){
        for (int i = 0; i < Courses.length; i++) {
            if(Courses[i]==course){return true;}
        }
        return false;
    }
    public String toString(){
        return "Teacher: "+name+"("+address+")";
    }
}
