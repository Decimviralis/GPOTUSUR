package ru.tusur.gpo.data;

import javax.persistence.*;
/**
 * Created by maxim on 29.03.17.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int personnelNumber;
    private long innNumber;
    private String snilsNumber;
    private char sex;
    private String computerSkills;
    private String driveDocs;
    private String previousConviction;
    private String societyStatus;
    private String maritalStatus;
    private String personalEmail;
    private String personalPhoneNumber;
    private String corporateEmail;
    private String corporatePhoneNumber;

    public Employee() {
    }

    public Employee(int personnelNumber, long innNumber, String snilsNumber, char sex, String computerSkills, String driveDocs, String previousConviction, String societyStatus, String maritalStatus, String personalEmail, String personalPhoneNumber, String corporateEmail, String corporatePhoneNumber) {
        this.personnelNumber = personnelNumber;
        this.innNumber = innNumber;
        this.snilsNumber = snilsNumber;
        this.sex = sex;
        this.computerSkills = computerSkills;
        this.driveDocs = driveDocs;
        this.previousConviction = previousConviction;
        this.societyStatus = societyStatus;
        this.maritalStatus = maritalStatus;
        this.personalEmail = personalEmail;
        this.personalPhoneNumber = personalPhoneNumber;
        this.corporateEmail = corporateEmail;
        this.corporatePhoneNumber = corporatePhoneNumber;
    }

    public long getId()    {
        return id;
    }
    public void setId() {
        this.id = id;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public long getInnNumber() {
        return innNumber;
    }

    public void setInnNumber(long innNumber) {
        this.innNumber = innNumber;
    }

    public String getSnilsNumber() {
        return snilsNumber;
    }

    public void setSnilsNumber(String snilsNumber) {
        this.snilsNumber = snilsNumber;
    }

    public String getComputerSkills() {
        return computerSkills;
    }

    public void setComputerSkills(String computerSkills) {
        this.computerSkills = computerSkills;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getDriveDocs() {
        return driveDocs;
    }

    public void setDriveDocs(String driveDocs) {
        this.driveDocs = driveDocs;
    }

    public String getPreviousConviction() {
        return previousConviction;
    }

    public void setPreviousConviction(String previousConviction) {
        this.previousConviction = previousConviction;
    }

    public String getSocietyStatus() {
        return societyStatus;
    }

    public void setSocietyStatus(String societyStatus) {
        this.societyStatus = societyStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }

    public void setPersonalPhoneNumber(String personalPhoneNumber) {
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public String getCorporateEmail() {
        return corporateEmail;
    }

    public void setCorporateEmail(String corporateEmail) {
        this.corporateEmail = corporateEmail;
    }

    public String getCorporatePhoneNumber() {
        return corporatePhoneNumber;
    }

    public void setCorporatePhoneNumber(String corporatePhoneNumber) {
        this.corporatePhoneNumber = corporatePhoneNumber;
    }
}
