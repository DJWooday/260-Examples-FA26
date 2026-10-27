public class Person {
    private String name;
    private String ULID;

    Person(String name, String ULID) {
        SetName(name);
        SetULID(ULID);
    }
    Person() {
        this("John", "C00000000");
    }
    public void SetName(String n) {
        name = n;
    }
    public String getName() {return name;}
    public void SetULID(String u) {
        ULID = u;
    }
    public String getULID() {return ULID;}
    public String toString() {
        return name + " (" + ULID + ")";
    }
    public boolean equals(Object obj) {
        if (obj instanceof Person)
            return this.name == ((Person)obj).name;
        else return false;
    }
}
