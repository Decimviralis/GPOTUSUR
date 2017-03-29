package hello;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by maxim on 29.03.17.
 */
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="employee_id", nullable = false)
    private Employee employee;
    private String educationType;
    private String Education;
    private String institutionName;
    private String institutionAddress;
    private Date instituteFinishYear;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionAddress() {
        return institutionAddress;
    }

    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
    }

    public Date getInstituteFinishYear() {
        return instituteFinishYear;
    }

    public void setInstituteFinishYear(Date instituteFinishYear) {
        this.instituteFinishYear = instituteFinishYear;
    }
}
