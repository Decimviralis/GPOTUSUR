package ru.tusur.gpo.data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Created by maxim on 07.05.17.
 */
@Embeddable
public class PassportDataID {
    protected long passportSeries;
    protected long passportNumber;

    public PassportDataID () {}

    public PassportDataID (long passportSeries, long passportNumber)    {
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassportDataID that = (PassportDataID) o;

        if (passportSeries != that.passportSeries) return false;
        return passportNumber == that.passportNumber;
    }

    @Override
    public int hashCode() {
        int result = (int) (passportSeries ^ (passportSeries >>> 32));
        result = 31 * result + (int) (passportNumber ^ (passportNumber >>> 32));
        return result;
    }
}
