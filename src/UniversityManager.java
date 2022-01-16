
import java.util.Iterator;

public class UniversityManager {
    public static void main(String[] args) {
       University univ = new University();
       univ.setName("UET");
        
    // create instances of class Lecturer
    Lecturer lc1 = new Lecturer();
    lc1.setFName("Petraq");
    lc1.setGender("Male");
    lc1.setLName("Papajorgji");
    lc1.setId("I3452045D");
    univ.getLecturers().add(lc1);
    
    Lecturer lc2 = new Lecturer();
    lc2.setFName("Sokol");
    lc2.setGender("Male");
    lc2.setLName("Noka");
    lc2.setId("S3452045D");
    univ.getLecturers().add(lc2);
    
    // create instances of clas Student
        Student st1 = new Student();
        st1.setStId("Id1234567");
        st1.setFName("Griselda");
        st1.setDob("12 Dhjetor 2000");
        univ.getStudents().add(st1);
        
        Student st2 = new Student();
        st2.setStId("AS54321");
        st2.setFName("Roland");
        st2.setDob("October 13 1999");
        univ.getStudents().add(st2);
        
        //create instances of class Course
        Course c1 = new Course();
        c1.setCId("SE101");
        c1.setCName("Software Engineering");
        
        Course c2 = new Course();
        c2.setCId("DB102");
        c2.setCName("Database");
        //add courses to university collection
        univ.getCourses().add(c1);
        univ.getCourses().add(c2);
        
       //linking student to courses
       st1.getCourses().add(c1);
       st2.getCourses().add(c1);
       
       st1.getCourses().add(c2);
       
       //create reports
       
       //list of students
        System.out.println("----------Lista e Studenteve te Universitetit----");
        Iterator students = univ.getStudents().iterator();
        while (students.hasNext()){
        Student st = (Student)students.next();
        System.out.println("Emri i Studentit: "+st.getFName()+
                    " "+ st.getStId()+ " "+ st.getDob());
        
        Iterator courses = st.getCourses().iterator();
        while (courses.hasNext()){
            Course c =(Course)courses.next();
            System.out.println("Emri i Kursit: " + c.getCName()+ " "+c.getCId());
        }
              
        
        }
        
        //check if Rudes is part of the list
        Iterator sts = univ.getStudents().iterator();
        boolean heIs = false;
        while (sts.hasNext()){
        Student stu = (Student)sts.next();
        if (stu.getFName().equals("Rudens")){
            
           heIs = true;
        }
        }
            System.out.println("Rudens is part of the team is "+heIs);
    //list of lecturers of the university
        System.out.println("List of Lectures");
        for (int i = 0; i< univ.getLecturers().size(); ++i ){
        Lecturer lc = univ.getLecturers().get(i);
            System.out.println("Emri i Lecturer "+ lc.getFName()+ " "+lc.getLName());
        }
        
        System.out.println("List of Lecturers secod method");
//}
        for (Lecturer lecturer: univ.getLecturers())
        {
            System.out.println("Emri i Lecturer: " +
                     lecturer.getFName()+ ""+ lecturer.getLName());
        }
    }
    
}
