package ru.tusur.gpo.data;

import javax.persistence.Embeddable;
import java.util.Date;

/**
 * Created by maxim on 07.05.17.
 */
@Embeddable
public class StandingID {
    protected Employee employee;
    protected String typeOfWorkActivity;
    protected String placeOfWork;
    protected Date startDateOfService;

    public StandingID()  {}

    public StandingID (Employee employee, String typeOfWorkActivity, String placeOfWork, Date startDateOfService)   {
        this.employee = employee;
        this.typeOfWorkActivity = typeOfWorkActivity;
        this.placeOfWork = placeOfWork;
        this.startDateOfService = startDateOfService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StandingID that = (StandingID) o;

        if (!employee.equals(that.employee)) return false;
        if (!typeOfWorkActivity.equals(that.typeOfWorkActivity)) return false;
        if (!placeOfWork.equals(that.placeOfWork)) return false;
        return startDateOfService.equals(that.startDateOfService);
    }

    @Override
    public int hashCode() {
        int result = employee.hashCode();
        result = 31 * result + typeOfWorkActivity.hashCode();
        result = 31 * result + placeOfWork.hashCode();
        result = 31 * result + startDateOfService.hashCode();
        return result;
    }
}
