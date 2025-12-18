public class Artworks extends CulturalObject {

    private int year;
    private double price;

    public Artworks(String title, int year, double price) {
        super(title);
        this.year = year;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getScore() {
        return (2025 - year) + (price / 100000);
    }

    @Override
    public String toString() {
        return "Artwork → Title: " + name + ", Year: " + year + ", Price: $" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Artworks)) return false;
        Artworks other = (Artworks) obj;
        return year == other.year && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + year;
    }
}
