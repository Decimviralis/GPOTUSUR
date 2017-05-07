package ru.tusur.gpo.data;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by maxim on 07.05.17.
 */
@Embeddable
public class PassportDataID implements Serializable {
    protected String series;
    protected String number;

    public PassportDataID () {}

    public PassportDataID (String series, String number)    {
        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassportDataID that = (PassportDataID) o;

        if (series != null ? !series.equals(that.series) : that.series != null) return false;
        return number != null ? number.equals(that.number) : that.number == null;

    }

    @Override
    public int hashCode() {
        int result = series != null ? series.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
