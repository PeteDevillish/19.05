package pl.sdacademy.classes.house;

//5. Stwórz klasę House, która będzie miała pola: address (String), kitchen, bathroom oraz tablicę pokojów (rooms). W przypadku pól oznaczających pomieszczenia skorzystajmy z klasy Room.
//6. Do klasy House dodaj metodę getArea, która zwróci pole powierzchni domu.
public class House {
    private String address;
    private Room kitchen, bathroom;
    private Room[] rooms;

    public House(String address, Room kitchen, Room bathroom, Room[] rooms) {
        this.address = address;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.rooms = new Room[rooms.length + 2];
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i] = rooms[i];
        }
        this.rooms[rooms.length] = kitchen;
        this.rooms[rooms.length + 1] = bathroom;
    }

    public int getArea() {
        int area = 0;
        for (Room room : rooms) {
            area += room.getArea();
        }
        return area;
    }

}
