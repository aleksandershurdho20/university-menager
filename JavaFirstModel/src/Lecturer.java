
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.BA35D66F-1EAC-C1B1-74C7-4A4AB1505B11]
// </editor-fold> 
public class Lecturer {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2781F8CD-CE09-714A-635F-289DD4E6B3A1]
    // </editor-fold> 
    private String Id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F11F0870-A463-7EBF-12E7-957A9610E694]
    // </editor-fold> 
    private String fName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.50C304EF-C1AF-9FED-DB28-91E07BCCBD11]
    // </editor-fold> 
    private String lName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.92267B3D-9150-D9FB-7601-3EC16985EE01]
    // </editor-fold> 
    private String gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.07A5D4BD-DCD2-2FD5-2106-D6BAA0ADBF48]
    // </editor-fold> 
    public Lecturer () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5497A24D-C242-A4EF-9F4D-584F992A055C]
    // </editor-fold> 
    public String getId () {
        return Id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.498CA4C0-3157-44FA-F9A9-D1ED50ED4EE9]
    // </editor-fold> 
    public void setId (String val) {
        this.Id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6E4A0480-898E-88B8-0A7B-170C5DC2C63D]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.95EC4044-55BD-3810-8804-CFFEE09701B6]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3FE27B5E-54FF-B9B6-E874-2E56ECBD14FD]
    // </editor-fold> 
    public String getGender () {
        return gender;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.08D42DA0-BB13-12FA-476B-5D666EB36FCF]
    // </editor-fold> 
    public void setGender (String val) {
        this.gender = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4432761B-57CC-2909-5A6C-13D3C6665840]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4CB8F12D-F68F-F3E8-3288-5262FD6CF335]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }

    public String toString(Lecturer lec){
    return lec.getFName()+ " " + lec.getLName();
    }
}

