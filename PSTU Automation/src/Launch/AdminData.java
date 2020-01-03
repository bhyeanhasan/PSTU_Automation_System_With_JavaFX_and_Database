
package Launch;

/*
    Md Babul Hasan (Noyen)
    Patuakhali Science and Technology University
    Faculty of Computer Science and Engineering
    16 th Batch (PSTU-CSE-2019)
    bhyean@gmail.com // B H Yean Hasan
*/

public class AdminData {
    private String id;
    private String Reg;
    private String Name;
    private String Faculty;
    private String Session;
    private String enrolment;
    private String hall;
    private String trxid;

    public AdminData(String id, String Reg, String Name, String Faculty, String Session, String enrolment, String hall, String trxid) {
        this.id = id;
        this.Reg = Reg;
        this.Name = Name;
        this.Faculty = Faculty;
        this.Session = Session;
        this.enrolment = enrolment;
        this.hall = hall;
        this.trxid = trxid;
    }
//for hall
    public AdminData(String id, String Reg, String Name, String hall) {
        this.id = id;
        this.Reg = Reg;
        this.Name = Name;
        this.hall = hall;
    }
//for admin
    public AdminData(String id, String Reg, String Name, String Faculty, String Session) {
        this.id = id;
        this.Reg = Reg;
        this.Name = Name;
        this.Faculty = Faculty;
        this.Session = Session;
    }
    
    
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getReg() {
        return Reg;
    }


    public void setReg(String Reg) {
        this.Reg = Reg;
    }


    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public String getFaculty() {
        return Faculty;
    }


    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }


    public String getSession() {
        return Session;
    }


    public void setSession(String Session) {
        this.Session = Session;
    }


    public String getEnrolment() {
        return enrolment;
    }


    public void setEnrolment(String enrolment) {
        this.enrolment = enrolment;
    }


    public String getHall() {
        return hall;
    }


    public void setHall(String hall) {
        this.hall = hall;
    }


    public String getTrxid() {
        return trxid;
    }


    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    
    
}
