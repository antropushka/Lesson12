package by.epam.lesson13.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RealEstateBase implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Flat> flats = new ArrayList<Flat>();

    public RealEstateBase(List<Flat> flats) {
        this.flats = flats;
    }

    public RealEstateBase() {
        flats = new ArrayList<Flat>();
    }

    public List<Flat> getRealEstateBase() {
        return flats;
    }

    public void setRealEstateBase(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealEstateBase)) return false;
        RealEstateBase that = (RealEstateBase) o;
        return Objects.equals(flats, that.flats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flats);
    }

    @Override
    public String toString() {
        return "RealEstateBase{" +
                "flats=" + flats +
                '}';
    }
}
