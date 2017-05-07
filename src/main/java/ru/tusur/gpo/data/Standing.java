package ru.tusur.gpo.data;

import javax.persistence.*;
import java.security.interfaces.ECKey;
import java.util.Date;

/**
 * Created by maxim on 07.05.17.
 */
@Entity
public class Standing {

    @EmbeddedId
    private StandingID standingID;

    private Date finishDateOfService;
    private String typeOfAquiredService;
    private String amountOfTimeSpecialityWork;
    private String professionalGrowth;

    public Standing () {}

    public Standing (Date finishDateOfService, String typeOfAquiredService, String amountOfTimeSpecialityWork, String professionalGrowth)   {
        this.finishDateOfService = finishDateOfService;
        this.typeOfAquiredService = typeOfAquiredService;
        this.amountOfTimeSpecialityWork = amountOfTimeSpecialityWork;
        this.professionalGrowth = professionalGrowth;
    }


    public StandingID getStandingID() {
        return standingID;
    }

    public void setStandingID(StandingID standingID) {
        this.standingID = standingID;
    }

    public Date getFinishDateOfService() {
        return finishDateOfService;
    }

    public void setFinishDateOfService(Date finishDateOfService) {
        this.finishDateOfService = finishDateOfService;
    }

    public String getTypeOfAquiredService() {
        return typeOfAquiredService;
    }

    public void setTypeOfAquiredService(String typeOfAquiredService) {
        this.typeOfAquiredService = typeOfAquiredService;
    }

    public String getAmountOfTimeSpecialityWork() {
        return amountOfTimeSpecialityWork;
    }

    public void setAmountOfTimeSpecialityWork(String amountOfTimeSpecialityWork) {
        this.amountOfTimeSpecialityWork = amountOfTimeSpecialityWork;
    }

    public String getProfessionalGrowth() {
        return professionalGrowth;
    }

    public void setProfessionalGrowth(String professionalGrowth) {
        this.professionalGrowth = professionalGrowth;
    }
}
