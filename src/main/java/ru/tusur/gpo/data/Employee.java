package ru.tusur.gpo.data;

import javax.persistence.*;
/**
 * Created by maxim on 29.03.17.
 */
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

    public Employee(int personnelNumber) {
        this.personnelNumber = personnelNumber;
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
}
