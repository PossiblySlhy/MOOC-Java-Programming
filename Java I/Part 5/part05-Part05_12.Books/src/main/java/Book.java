
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the object into a Person object
        Book comparedBook = (Book) compared;

        // if the values of the object variables are equal, the objects are equal
        // <----- NOTE: use var.equals when comparing 2 objects (e.g. String,
        // SimpleDate) ----->
        if (this.name.equals(comparedBook.name) &&
                (this.publicationYear == comparedBook.publicationYear)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
}
