package ru.tusur.gpo.data;

import javax.persistence.*;


/**
 * Created by maxim on 31.03.17.
 */
@Entity
public class ActualAddressOfResidence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn (name = "Employee_id", nullable = false)
    private Employee employee;

    private String addressStatus;
    private String region;
    private String locality;
    private String area;
    private String street;
    private String home;

    public ActualAddressOfResidence() {

    }

    public ActualAddressOfResidence(Employee employee,String addressStatus, String region, String locality, String area, String street, String home)  {
        this.employee = employee;
        this.addressStatus = addressStatus;
        this.region = region;
        this.locality = locality;
        this.area = area;
        this.street = street;
        this.home = home;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
