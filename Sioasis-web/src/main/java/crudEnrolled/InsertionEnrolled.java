package crudEnrolled;

import com.sioasis.controllerEnrolled.CreateSessionEnrolled;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class InsertionEnrolled {

    @EJB
    private CreateSessionEnrolled CSE;
    private String name;
    private String lastName;
    private String address;
    private String homePhone;
    private String movilPhone;
    private String sizeHeight;
    private String school;
    private String grade;
    private String tipeOwnHome; //Arriendo, Propia, en Pago
    private String tipeHome;    //Casa, Apartamento, Casalote, Inquilinato, Invacion,     
    private String guardianName;
    private String relationGuardian; //Relationship to Enrollee: Mother, father..other..    
    private String jobGuardian;
    private String movilPhoneGuardian;
    private String wichEPS;
    private Date birthDay;
    private Long docIDGuardian;
    private Long docID;
    private boolean displaced;
    private boolean sisben;
    private boolean EPS;
    private boolean study;
    private boolean newOrOld;
    private char sex;
    private int weight;
    private int height;
    private int age;
    private int numPersonLive;
    private int numChild17;
    private Date yearForm;

    public String createEnrolledMethod() throws Exception {
        String flag = "enrolledAdmin";
        System.out.println("entro al managedBean de enrolled");
        try {
            getCSE().newEnrolled(getName(), getLastName(), getAddress(), getHomePhone(), getMovilPhone(), getWeight(), getHeight(), getSizeHeight(), getSchool(), getGrade(), getTipeOwnHome(), getTipeHome(),
                    getWichEPS(), getBirthDay(), getDocID(), isDisplaced(), isSisben(), isEPS(), isStudy(), isNewOrOld(), getSex(), getAge(), getNumPersonLive(), getNumChild17(), getYearForm());
        } catch (Exception ex) {
            flag = "error";
        }
        return flag;
    }

    public InsertionEnrolled() {
    }

    /**
     * @return the yearForm
     */
    public Date getYearForm() {
        return yearForm;
    }

    /**
     * @param yearForm the yearForm to set
     */
    public void setYearForm(Date yearForm) {
        this.yearForm = yearForm;
    }

    /**
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return the newOrOld
     */
    public boolean isNewOrOld() {
        return newOrOld;
    }

    /**
     * @param newOrOld the newOrOld to set
     */
    public void setNewOrOld(boolean newOrOld) {
        this.newOrOld = newOrOld;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the birthDay
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the movilPhone
     */
    public String getMovilPhone() {
        return movilPhone;
    }

    /**
     * @param movilPhone the movilPhone to set
     */
    public void setMovilPhone(String movilPhone) {
        this.movilPhone = movilPhone;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the sizeHeight
     */
    public String getSizeHeight() {
        return sizeHeight;
    }

    /**
     * @param sizeHeight the sizeHeight to set
     */
    public void setSizeHeight(String sizeHeight) {
        this.sizeHeight = sizeHeight;
    }

    /**
     * @return the numPersonLive
     */
    public int getNumPersonLive() {
        return numPersonLive;
    }

    /**
     * @param numPersonLive the numPersonLive to set
     */
    public void setNumPersonLive(int numPersonLive) {
        this.numPersonLive = numPersonLive;
    }

    /**
     * @return the displaced
     */
    public boolean isDisplaced() {
        return displaced;
    }

    /**
     * @param displaced the displaced to set
     */
    public void setDisplaced(boolean displaced) {
        this.displaced = displaced;
    }

    /**
     * @return the sisben
     */
    public boolean isSisben() {
        return sisben;
    }

    /**
     * @param sisben the sisben to set
     */
    public void setSisben(boolean sisben) {
        this.sisben = sisben;
    }

    /**
     * @return the EPS
     */
    public boolean isEPS() {
        return EPS;
    }

    /**
     * @param EPS the EPS to set
     */
    public void setEPS(boolean EPS) {
        this.EPS = EPS;
    }

    /**
     * @return the wichEPS
     */
    public String getWichEPS() {
        return wichEPS;
    }

    /**
     * @param wichEPS the wichEPS to set
     */
    public void setWichEPS(String wichEPS) {
        this.wichEPS = wichEPS;
    }

    /**
     * @return the study
     */
    public boolean isStudy() {
        return study;
    }

    /**
     * @param study the study to set
     */
    public void setStudy(boolean study) {
        this.study = study;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the tipeOwnHome
     */
    public String getTipeOwnHome() {
        return tipeOwnHome;
    }

    /**
     * @param tipeOwnHome the tipeOwnHome to set
     */
    public void setTipeOwnHome(String tipeOwnHome) {
        this.tipeOwnHome = tipeOwnHome;
    }

    /**
     * @return the tipeHome
     */
    public String getTipeHome() {
        return tipeHome;
    }

    /**
     * @param tipeHome the tipeHome to set
     */
    public void setTipeHome(String tipeHome) {
        this.tipeHome = tipeHome;
    }

    /**
     * @return the guardian
     */
    public String getGuardianName() {
        return guardianName;
    }

    /**
     * @param guardian the guardian to set
     */
    public void setGuardianName(String guardian) {
        this.guardianName = guardian;
    }

    /**
     * @return the numChild17
     */
    public int getNumChild17() {
        return numChild17;
    }

    /**
     * @param numChild17 the numChild17 to set
     */
    public void setNumChild17(int numChild17) {
        this.numChild17 = numChild17;
    }

    /**
     * @return the docID
     */
    public Long getDocID() {
        return docID;
    }

    /**
     * @param docID the docID to set
     */
    public void setDocID(Long docID) {
        this.docID = docID;
    }

    public String getRelationGuardian() {
        return relationGuardian;
    }

    public void setRelationGuardian(String relationGuardian) {
        this.relationGuardian = relationGuardian;
    }

    public String getJobGuardian() {
        return jobGuardian;
    }

    public void setJobGuardian(String jobGuardian) {
        this.jobGuardian = jobGuardian;
    }

    public String getMovilPhoneGuardian() {
        return movilPhoneGuardian;
    }

    public void setMovilPhoneGuardian(String movilPhoneGuardian) {
        this.movilPhoneGuardian = movilPhoneGuardian;
    }

    public Long getDocIDGuardian() {
        return docIDGuardian;
    }

    public void setDocIDGuardian(Long docIDGuardian) {
        this.docIDGuardian = docIDGuardian;
    }

    /**
     * @return the CSE
     */
    public CreateSessionEnrolled getCSE() {
        return CSE;
    }

    /**
     * @param CSE the CSE to set
     */
    public void setCSE(CreateSessionEnrolled CSE) {
        this.CSE = CSE;
    }
}
