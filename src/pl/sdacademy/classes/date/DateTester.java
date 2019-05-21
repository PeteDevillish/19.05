package pl.sdacademy.classes.date;

public class DateTester {
    public static void main(String[] args) {
        Date testee = new Date(23, 2, 1995);
        System.out.println(testee.isLeapYear());
        testee.print();
        System.out.println(testee.getCurrentMonthDayCount());
        //adding without changing month
        testee.addDays(5);
        System.out.println("Should be 28.2.1995");
        testee.print();
        System.out.println(testee.whichDayInYear());
        //adding in february with changing month without leap year
        testee.addDays(7);
        System.out.println("Should be 7.3.1995");
        testee.print();
        //adding with changing month in month with 31 days
        testee.addDays(30);
        System.out.println("Should be 6.4.1995");
        testee.print();
        //adding with changing month in month with 30 days
        testee.addDays(29);
        System.out.println("Should be 5.5.1995");
        testee.print();
        System.out.println(testee.whichDayInYear());
        System.out.println(testee.howManyDaysToNextYear());
        //adding with changing month and year
        testee.addDays(250);
        testee.print();
        //adding with changing month in month with 30 days
        testee.addDays(29);
        testee.print();

    }
}
