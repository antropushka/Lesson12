package by.epam.lesson13.bean;

import java.io.Serializable;
import java.util.Objects;

public class Flat implements Serializable {

    private static final long serialVersionUID = 1L;

    private int flatNumber;
    private int square;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private int lifespan;

    public Flat() {
    }

    public Flat(int flatNumber,
                int square,
                int floor,
                int numberOfRooms,
                String street,
                String buildingType,
                int lifespan) {
        this.flatNumber = flatNumber;
        this.square = square;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.lifespan = lifespan;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat)) return false;
        Flat flat = (Flat) o;
        return getFlatNumber() == flat.getFlatNumber()
                && getSquare() == flat.getSquare()
                && getFloor() == flat.getFloor()
                && getNumberOfRooms() == flat.getNumberOfRooms()
                && getLifespan() == flat.getLifespan()
                && Objects.equals(getStreet(), flat.getStreet())
                && Objects.equals(getBuildingType(), flat.getBuildingType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlatNumber(), getSquare(), getFloor(), getNumberOfRooms(), getStreet(), getBuildingType(),
                getLifespan());
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatNumber=" + flatNumber +
                ", square=" + square +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", lifespan=" + lifespan +
                '}';
    }
}
