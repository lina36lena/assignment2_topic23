public abstract class CulturalObject {

    protected String name;

    public CulturalObject(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract double getScore();
    @Override
    public String toString() {
        return "Cultural Object: " + name;
    }
}
