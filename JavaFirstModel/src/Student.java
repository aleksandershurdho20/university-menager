
import java.util.Date;
import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A1B3636D-1405-D856-2F48-75D335BE4654]
// </editor-fold> 
public class Student {

      private ArrayList<Course> courses = new ArrayList();


    private String StId;
     
    private String fName;
    
    private String dob;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9F1979E-1DBB-0C97-F14F-CEAAF115A207]
    // </editor-fold> 
    public Student () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.567D0018-9F01-FD3B-C045-D14444F67A15]
    // </editor-fold> 
    public String getStId () {
        return StId;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CAEFD948-FAEF-47ED-7560-28633B44121B]
    // </editor-fold> 
    public void setStId (String val) {
        this.StId = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB26E127-6980-5B72-99C0-2D205C50ACA7]
    // </editor-fold> 
    public String getDob () {
        return dob;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EA0FD2EA-D485-3AA1-ABCF-1C5DCEC16611]
    // </editor-fold> 
    public void setDob (String val) {
        this.dob = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3FD80270-004F-DDD6-85CC-0AB633389C12]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C891C300-EBCE-4556-D956-F5D9360FE2BD]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.979F7A54-89F0-CF6D-9D4E-00B9C5C3B382]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A456A013-A3C5-68B2-3743-C1C703128653]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    public String toString(Student st){
    return st.getFName();
    }
}

