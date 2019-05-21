package pl.sdacademy.classes.party;
// 7. Stwórz klasę Party, która będzie miała pola: host (gospodarz), attendees (uczestnicy). Do klasy dodaj metodę getAverageAge, która zwróci średni wiek uczestników.
public class Party {
    private Person host;
    private Person[] attendees;

    public Party(Person host, Person[] attendees) {
        this.host = host;
        this.attendees = attendees;
    }

    public double getAverageAge(){
        double sum = 0;
        for (Person attendee : attendees){
            sum += attendee.getAge();
        }
        return sum /= attendees.length;

    }
}
