public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        // Check if incrementing day would tick over to another month
        // If it does, reset day
        if ((this.day + 1) > 30) {
            this.day = 1;
            // Check if incrementing month would tick over to another year
            // If it does, increment year only and reset day and month
            if ((this.month + 1) > 12) {
                this.day = 1;
                this.month = 1;
                this.year++;
                // If a new year does not start, increment month only and reset day
            } else {
                this.day = 1;
                this.month++;
            }
            // If a new month does not start, increment day
        } else {
            this.day++;
        }
    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);

        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

}
