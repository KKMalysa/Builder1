import House.House;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("wall1", "floor1", "room1", "window1","door1","garage");
//        House house2 = new House();  // - założenie: mam dużo konstruktorów i nie jestem pewny co do kolejności pól
//                                                     i troche zaczynam się w tym gubić


        House house3 = new House.HouseBuilder()
                .buildDoors("jakieś drzwi")
                .buildGarage("garaż")
                .buildWalls("sciany jako trzecie")
                .buildFloors("floors")
                .build(); // <-- ta metoda kończy budowanie i zwraca obiekt.


        System.out.println(house3);
    }


}
