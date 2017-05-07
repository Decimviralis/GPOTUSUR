package ru.tusur.gpo.data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by maxim on 30.03.17.
 */
@Entity
public class PassportData {

    @EmbeddedId
    private PassportDataID passportDataID;

    @ManyToOne
    @JoinColumn(name="employeeId", nullable = false)
    private Employee employee;

    private String passportStatus;
    private String name;
    private String surname;
    private String patronymic;
    private Date dateOfBirth;
    private String placeOfBirth;
    private Date passportDateOfIssue;
    private String passportIssuedBy;
    private String passportChangeReason;
    private String confirmationDocument;
    private String copyOfConfirmationDocument;

    public PassportData() {

    }

    public PassportData (Employee employee, String passportStatus, String name, String surname, String patronymic, Date dateOfBirth, String placeOfBirth, Date passportDateOfIssue, String passportIssuedBy, String passportChangeReason, String confirmationDocument, String copyOfConfirmationDocument) {
        this.employee = employee;
        this.passportStatus = passportStatus;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.passportDateOfIssue = passportDateOfIssue;
        this.passportIssuedBy = passportIssuedBy;
        this.passportChangeReason = passportChangeReason;
        this.confirmationDocument = confirmationDocument;
        this.copyOfConfirmationDocument = copyOfConfirmationDocument;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPassportStatus() {
        return passportStatus;
    }

    public void setPassportStatus(String passportStatus) {
        this.passportStatus = passportStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Date getPassportDateOfIssue() {
        return passportDateOfIssue;
    }

    public void setPassportDateOfIssue(Date passportDateOfIssue) {
        this.passportDateOfIssue = passportDateOfIssue;
    }

    public String getPassportIssuedBy() {
        return passportIssuedBy;
    }

    public void setPassportIssuedBy(String passportIssuedBy) {
        this.passportIssuedBy = passportIssuedBy;
    }

    public String getPassportChangeReason() {
        return passportChangeReason;
    }

    public void setPassportChangeReason(String passportChangeReason) {
        this.passportChangeReason = passportChangeReason;
    }

    public String getConfirmationDocument() {
        return confirmationDocument;
    }

    public void setConfirmationDocument(String confirmationDocument) {
        this.confirmationDocument = confirmationDocument;
    }

    public String getCopyOfConfirmationDocument() {
        return copyOfConfirmationDocument;
    }

    public void setCopyOfConfirmationDocument(String copyOfConfirmationDocument) {
        this.copyOfConfirmationDocument = copyOfConfirmationDocument;
    }

    public PassportDataID getPassportDataID() {
        return passportDataID;
    }

    public void setPassportDataID(PassportDataID passportDataID) {
        this.passportDataID = passportDataID;
    }
}
