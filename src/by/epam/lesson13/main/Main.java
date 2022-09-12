package by.epam.lesson13.main;

import by.epam.lesson13.bean.Flat;
import by.epam.lesson13.bean.RealEstateBase;
import by.epam.lesson13.logic.FlatLogic;
import by.epam.lesson13.view.RealEstateBaseOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlatLogic flatLogic = new FlatLogic();
        RealEstateBaseOutput realEstateBaseOutput = new RealEstateBaseOutput();

        List<Flat> flats = new ArrayList<Flat>();
        RealEstateBase realEstateBase = new RealEstateBase(flats);

        Flat flat1 = new Flat(52, 48, 5, 1,  "Nemanskaya",
                "monolithic", 55);
        Flat flat2 = new Flat(1, 55, 2, 2, "yubileinaya",
                "panel", 50);
        Flat flat3 = new Flat(2, 75, 4, 1, "gromyko",
                "brik", 60);
        Flat flat4 = new Flat(45, 80, 6, 4, "ratomskaya",
                "brik", 60);
        Flat flat5 = new Flat(116, 76, 16, 4, "ratomskaya",
                "brik", 60);
        Flat flat6 = new Flat(66, 70, 8, 2,  "Nemanskaya",
                "monolithic", 55);
        Flat flat7= new Flat(67, 48, 8, 1,  "Nemanskaya",
                "monolithic", 55);
        flats.add(flat1);
        flats.add(flat2);
        flats.add(flat3);
        flats.add(flat4);
        flats.add(flat5);
        flats.add(flat6);
        flats.add(flat7);

        System.out.println("        ===== A list of apartments FOR SALE =====");
        realEstateBaseOutput.printAsTable("for sale", realEstateBase.getRealEstateBase());

        System.out.println("        ===== A list of apartments with a given number of rooms =====");
        List<Flat> flatByRoom = flatLogic.byRooms(realEstateBase, 4);
        realEstateBaseOutput.printAsTable("for sale", flatByRoom);

        System.out.println("        ===== A list of apartments that have a given number of rooms ===== \n" +
                            "       ===== and are located on a floor that is in a given interval =====");
        List<Flat> flatByRoomAndFloor = flatLogic.byRoomsAndFloor(realEstateBase, 2, 1, 10);
        realEstateBaseOutput.printAsTable("for sale", flatByRoomAndFloor);

        System.out.println("        ===== A list of apartments with an area exceeding the specified one =====");
        List<Flat> flatBySquare = flatLogic.bySquare(realEstateBase, 60);
        realEstateBaseOutput.printAsTable("for sale", flatBySquare);



    }
}
