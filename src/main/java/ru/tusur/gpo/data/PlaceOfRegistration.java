package ru.tusur.gpo.data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by maxim on 31.03.17.
 */
@Entity
public class PlaceOfRegistration {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @ManyToOne
        @JoinColumns({
                @JoinColumn(name = "series"),
                @JoinColumn(name = "number")
        })
        private PassportData passportDataID;

        private String registrationStatus;
        private String region;
        private String locality;
        private String area;
        private String street;
        private String home;
        private Date registrationDate;
        private Date deRegistrationDate;

        public PlaceOfRegistration()    {

        }
        public PlaceOfRegistration (PassportData passportDataID, String registrationStatus, String region, String locality, String area, String street, String home, Date registrationDate, Date deRegistrationDate)  {
            this.passportDataID = passportDataID;
            this.registrationStatus = registrationStatus;
            this.region = region;
            this.locality = locality;
            this.area = area;
            this.street = street;
            this.home = home;
            this.registrationDate = registrationDate;
            this.deRegistrationDate = deRegistrationDate;
        }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
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

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getDeRegistrationDate() {
        return deRegistrationDate;
    }

    public void setDeRegistrationDate(Date deRegistrationDate) {
        this.deRegistrationDate = deRegistrationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PassportData getPassportDataID() {
        return passportDataID;
    }

    public void setPassportDataID(PassportData passportDataID) {
        this.passportDataID = passportDataID;
    }
}
