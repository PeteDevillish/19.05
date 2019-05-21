package pl.sdacademy.classes.date;

//8. Stwórz klasę reprezentującą datę (pola dzień, miesiąc, rok). Klasa oferuje metodę: print, która wyświetli datę w postaci dd.mm.rrrr
//Do tego oferuje metodę isLeapYear, która zwróci informację o tym, czy rok jest przestępny. Ponadto oferuje metodę getCurrentMonthDayCount, która zwróci liczbę dni w aktualnym miesiącu.
//9. Dodaj do klasy z poprzedniego zadania metodę addDays, która doda do daty liczbę dni, przekazaną jako argument.
public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            return true;
        } else return false;
    }

    public void print() {
        System.out.println(day + "." +
                month + "." + year);
    }

    public int getCurrentMonthDayCount() {
        return getMonthDayCount(month);
    }

    public int getMonthDayCount(int month) {
        if (month == 2) {
            if (isLeapYear()) return 29;
            else return 28;
        } else if (isMonthWith30days(month)) {
            return 30;
        } else {
            return 31;
        }
    }

    private boolean isMonthWith30days(int month) {
        int[] monthWith30Days = {4, 6, 9, 11};
        for (int mW30 : monthWith30Days) {
            if (month == mW30) return true;
        }
        return false;
    }

    public void addDays(int daysToAdd) {
        int daysInMonth = getCurrentMonthDayCount();
        if (day + daysToAdd <= daysInMonth) {
            day += daysToAdd;
            return;
        } else {
            int daysTillTheEndOTheMonth = daysInMonth - day;
            day = 1;
            month++;
            daysToAdd -= daysTillTheEndOTheMonth + 1;
            if (month == 12) {
                month = 1;
                year++;
            }
            addDays(daysToAdd);
        }
    }

    //
    public int whichDayInYear() {
        int result = 0;
        for (int i = 1; i < month; i++) {
            result += getMonthDayCount(i);
        }
        result += day;
        return result;
    }
    public int howManyDaysToNextYear (){
        if (isLeapYear()) return 366 - whichDayInYear();
        else return 365 - whichDayInYear();
    }
}
