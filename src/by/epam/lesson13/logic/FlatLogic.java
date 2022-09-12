package by.epam.lesson13.logic;

import by.epam.lesson13.bean.Flat;
import by.epam.lesson13.bean.RealEstateBase;

import java.util.ArrayList;
import java.util.List;

public class FlatLogic {

    public List<Flat> byRooms (RealEstateBase realEstateBase, int room) {
        List<Flat> flatsByRooms = new ArrayList<Flat>();
        List<Flat> flats = realEstateBase.getRealEstateBase();

        for (int i = 0; i < flats.size(); i++) {
            if (flats.get(i).getNumberOfRooms() == room) {
                flatsByRooms.add(flats.get(i));
            }
        }
        return flatsByRooms;
    }


    public List<Flat> byRoomsAndFloor (RealEstateBase realEstateBase, int room, int floorMin, int floorMax) {
        List<Flat> flatsByRoomsAndFloor = new ArrayList<Flat>();
        List<Flat> flats = realEstateBase.getRealEstateBase();
        for (int i = 0; i < flats.size(); i++) {
            if (flats.get(i).getNumberOfRooms() == room) {
                if (flats.get(i).getFloor() > floorMin
                   && flats.get(i).getFloor() < floorMax) {
                    flatsByRoomsAndFloor.add(flats.get(i));
                }
            }
        }
        return flatsByRoomsAndFloor;
    }


    public List<Flat> bySquare (RealEstateBase realEstateBase, int square) {
        List<Flat> bySquare = new ArrayList<Flat>();
        List<Flat> flats = realEstateBase.getRealEstateBase();
        for (int i = 0; i < flats.size(); i++) {
            if (flats.get(i).getSquare() > square) {
                bySquare.add(flats.get(i));
            }
        }
        return bySquare;
    }
}
