import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4AF8941B-9478-12A5-006D-A4D6FC249DE9]
// </editor-fold> 
public class University {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A0E8C455-9F8A-3C59-CB45-B3D664C86C50]
    // </editor-fold> 
    private ArrayList<Lecturer> lecturers = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1E6DAE78-7B55-BD04-40E2-48769CD1156B]
    // </editor-fold> 
    private ArrayList<Course> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AFDC831B-BC9F-80F1-3A9E-9B05538D3BA9]
    // </editor-fold> 
    private String Name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E2906EDB-3AC9-2ECB-004A-690CAC06F9AC]
    // </editor-fold> 
    private ArrayList<Student> students = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.89C231FD-1207-FBF4-F1F5-AA09ABCA6C6F]
    // </editor-fold> 
    public University () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B8170D6-209F-2757-6747-96462786DCE3]
    // </editor-fold> 
    public String getName () {
        return Name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8F00F872-EB67-5E6D-3CD7-3735DDB6BCF1]
    // </editor-fold> 
    public void setName (String val) {
        this.Name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.90F3F971-A4AA-9823-9668-186CCD42CA51]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4DD6DFD4-1B45-6939-7BDC-6C5C9E569ABA]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C46DBC93-8A6C-1147-C8C5-84F66F3C3068]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.33F49D7E-9465-91B5-A157-BF0B1860129C]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8D7A91A0-6EB9-3E7B-3B07-342359805925]
    // </editor-fold> 
    public ArrayList<Lecturer> getLecturers () {
        return lecturers;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BAE80BF0-39CD-C4FC-3D17-D0996E01A3A8]
    // </editor-fold> 
    public void setLecturers (ArrayList<Lecturer> val) {
        this.lecturers = val;
    }

}

