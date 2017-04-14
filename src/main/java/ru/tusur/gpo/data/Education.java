package ru.tusur.gpo.data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by maxim on 29.03.17.
 */
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="employee_id", nullable = false)
    private Employee employee;

    private String educationType;
    private String education;
    private String institutionName;
    private String institutionAddress;
    private Date instituteFinishYear;

    public Education() {
    }

    public Education(Employee employee, String educationType, String education, String institutionName, String institutionAddress, Date instituteFinishYear) {
        this.employee = employee;
        this.educationType = educationType;
        this.education = education;
        this.institutionName = institutionName;
        this.institutionAddress = institutionAddress;
        this.instituteFinishYear = instituteFinishYear;
    }

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
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
