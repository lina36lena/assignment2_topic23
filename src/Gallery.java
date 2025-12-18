public class Gallery extends CulturalObject {

    private int visitors;
    private String style;

    public Gallery(String name, int visitors, String style) {
        super(name);
        this.visitors = visitors;
        this.style = style;
    }

    public int getVisitors() {return visitors;
    }

    public String getStyle() {return style;
    }

    @Override
    public double getScore() {
        return visitors / 100.0;
    }

    @Override
    public String toString() {
        return "Gallery → Name: " + name + ", Visitors: " + visitors + ", Style: " + style;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Gallery)) return false;
        Gallery other = (Gallery) obj;
        return name.equals(other.name) && style.equalsIgnoreCase(other.style);
    }

    @Override
    public int hashCode() {return name.hashCode() + style.hashCode();
    }
}
