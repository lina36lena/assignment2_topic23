public class Artist extends CulturalObject {

    private int age;
    private boolean famous;

    public Artist(String name, int age, boolean famous) {
        super(name);
        this.age = age;
        this.famous = famous;
    }

    public int getAge() {
        return age;
    }

    public boolean isFamous() {
        return famous;
    }

    @Override
    public double getScore() {
        return famous ? age * 2 : age;
    }

    @Override
    public String toString() {
        return "Artist → Name: " + name + ", Age: " + age + ", Famous: " + famous;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Artist)) return false;
        Artist other = (Artist) obj;
        return age == other.age && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
