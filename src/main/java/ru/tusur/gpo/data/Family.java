package ru.tusur.gpo.data;

import ru.tusur.gpo.data.enums.RelationDegree;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by maxim on 07.05.17.
 */
@Entity
public class Family {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int familyId;

    @ManyToOne
    @JoinColumn (name = "employee_id", nullable = false)
    private Employee employee;

    @Enumerated(EnumType.STRING)
    private RelationDegree relationDegree;

    private String relativeSurname;
    private String relativeName;
    private String relativePatronymic;
    private Date relativeDateOfBirth;
    private String relativePlaceOfBirth;

    public Family() {}

    public Family (Employee employee, RelationDegree relationDegree, String relativeName, String relativeSurname, String relativePatronymic, Date relativeDateOfBirth, String relativePlaceOfBirth) {
        this.employee = employee;
        this.relationDegree = relationDegree;
        this.relativeName = relativeName;
        this.relativeSurname = relativeSurname;
        this.relativePatronymic = relativePatronymic;
        this.relativeDateOfBirth = relativeDateOfBirth;
        this.relativePlaceOfBirth = relativePlaceOfBirth;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public RelationDegree getRelationDegree() {
        return relationDegree;
    }

    public void setRelationDegree(RelationDegree relationDegree) {
        this.relationDegree = relationDegree;
    }

    public String getRelativeSurname() {
        return relativeSurname;
    }

    public void setRelativeSurname(String relativeSurname) {
        this.relativeSurname = relativeSurname;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    public String getRelativePatronymic() {
        return relativePatronymic;
    }

    public void setRelativePatronymic(String relativePatronymic) {
        this.relativePatronymic = relativePatronymic;
    }

    public Date getRelativeDateOfBirth() {
        return relativeDateOfBirth;
    }

    public void setRelativeDateOfBirth(Date relativeDateOfBirth) {
        this.relativeDateOfBirth = relativeDateOfBirth;
    }

    public String getRelativePlaceOfBirth() {
        return relativePlaceOfBirth;
    }

    public void setRelativePlaceOfBirth(String relativePlaceOfBirth) {
        this.relativePlaceOfBirth = relativePlaceOfBirth;
    }
}