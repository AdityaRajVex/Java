package H.Customer_Info;

public class Date {
    //attributes
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) { // constructors
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setter /Getters
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
