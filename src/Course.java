
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D31C9FC0-2287-3485-549C-72F6E0BB3A33]
// </editor-fold> 
public class Course {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B4D1850D-577E-0507-ADB4-DF16D4F972C3]
    // </editor-fold> 
    private String cId;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.856221B4-61CD-DA4E-9010-5E5DCB3F9D04]
    // </editor-fold> 
    private String cName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.016F6DF0-CAD2-EB2E-CE57-345FAAE5B47A]
    // </editor-fold> 
    public Course () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.41F811F0-BFBE-3D69-D0B8-1E8C0B424CCB]
    // </editor-fold> 
    public String getCId () {
        return cId;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0EE5CFDC-BBAC-58AF-0D06-D1CA13E4D2CB]
    // </editor-fold> 
    public void setCId (String val) {
        this.cId = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F647D327-8C6A-9996-9EBD-AD7CB84EE575]
    // </editor-fold> 
    public String getCName () {
        return cName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.86102782-4C6A-4DA9-E4F7-52C211ADB803]
    // </editor-fold> 
    public void setCName (String val) {
        this.cName = val;
    }
    public String toString(Course c){
    return c.getCId()+ " " + c.getCName();
    }
}

