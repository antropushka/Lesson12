package by.epam.lesson13.view;

import by.epam.lesson13.bean.Flat;
import by.epam.lesson13.bean.RealEstateBase;

import java.util.List;

public class RealEstateBaseOutput {

    public void printAsTable(String title, RealEstateBase realEstateBase) {
        List<Flat> flats = realEstateBase.getRealEstateBase();
        System.out.println("------------------------------------------------------------------------------------------\n"
                + "| flatNumber | square | floor | numberOfRooms |     street    |  buildingType | lifespan | \n"
                + "------------------------------------------------------------------------------------------");
        for (int i = 0; i < flats.size(); i++) {
            System.out.printf("|%-12d|%-8d|%-7d|%-15d|%-15s|%-15s|%-10d|\n",
                    flats.get(i).getFlatNumber(),
                    flats.get(i).getSquare(),
                    flats.get(i).getFloor(),
                    flats.get(i).getNumberOfRooms(),
                    flats.get(i).getStreet(),
                    flats.get(i).getBuildingType(),
                    flats.get(i).getLifespan());
        }
        System.out.println("------------------------------------------------------------------------------------------"
                + "\n");

    }

    public void printAsTable(String title, List<Flat> flats) {
        System.out.println("------------------------------------------------------------------------------------------\n"
                + "| flatNumber | square | floor | numberOfRooms |     street    |  buildingType | lifespan | \n"
                + "------------------------------------------------------------------------------------------");
        for (int i = 0; i < flats.size(); i++) {
            System.out.printf("|%-12d|%-8d|%-7d|%-15d|%-15s|%-15s|%-10d|\n",
                    flats.get(i).getFlatNumber(),
                    flats.get(i).getSquare(),
                    flats.get(i).getFloor(),
                    flats.get(i).getNumberOfRooms(),
                    flats.get(i).getStreet(),
                    flats.get(i).getBuildingType(),
                    flats.get(i).getLifespan());
        }
        System.out.println("------------------------------------------------------------------------------------------"
                            + "\n");
    }
}
