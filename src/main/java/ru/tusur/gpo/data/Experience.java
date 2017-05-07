package ru.tusur.gpo.data;

import com.fasterxml.jackson.annotation.JacksonInject;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by maxim on 07.05.17.
 */

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employeeId", nullable = false)
    private Employee employee;

    private String fieldOfActivity;
    private double qualitativeIndex;
    private String achievmentsInOffice;
    private long numberOfConfirmingDocument;
    private Blob copyOfConfirmingDocument;

    public Experience ()  {

    }

    public Experience (Employee employee,String fieldOfActivity, double qualitativeIndex, String achievmentsInOffice, long numberOfConfirmingDocument, Blob copyOfConfirmingDocument) {
        this.employee = employee;
        this.fieldOfActivity = fieldOfActivity;
        this.qualitativeIndex = qualitativeIndex;
        this.achievmentsInOffice = achievmentsInOffice;
        this.numberOfConfirmingDocument = numberOfConfirmingDocument;
        this.copyOfConfirmingDocument = copyOfConfirmingDocument;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    public double getQualitativeIndex() {
        return qualitativeIndex;
    }

    public void setQualitativeIndex(double qualitativeIndex) {
        this.qualitativeIndex = qualitativeIndex;
    }

    public String getAchievmentsInOffice() {
        return achievmentsInOffice;
    }

    public void setAchievmentsInOffice(String achievmentsInOffice) {
        this.achievmentsInOffice = achievmentsInOffice;
    }

    public long getNumberOfConfirmingDocument() {
        return numberOfConfirmingDocument;
    }

    public void setNumberOfConfirmingDocument(long numberOfConfirmingDocument) {
        this.numberOfConfirmingDocument = numberOfConfirmingDocument;
    }

    public Blob getCopyOfConfirmingDocument() {
        return copyOfConfirmingDocument;
    }

    public void setCopyOfConfirmingDocument(Blob copyOfConfirmingDocument) {
        this.copyOfConfirmingDocument = copyOfConfirmingDocument;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
