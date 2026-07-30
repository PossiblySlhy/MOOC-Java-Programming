public class Archive {
    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // convert the object into a Person object
        Archive comparedArchive = (Archive) compared;

        // if the values of the object variables are equal, the objects are equal
        // In this case, the name is allowed to be different, so we only compare id to
        // id
        if (this.id.equals(comparedArchive.id)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
}
