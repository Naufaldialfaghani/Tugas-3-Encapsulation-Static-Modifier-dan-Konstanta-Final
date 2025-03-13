package praktic.geometry.shapes;

public class Circle {
    private int id;
    private double radius;
    private static final int PEMBILANG = 22;
    private static final int PENYEBUT = 7;

    // Konstruktor tanpa parameter
    public Circle() {
        this.id = 0;
        this.radius = 0.0;
    }

    // Setter ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter Radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter ID
    public int getId() {
        return id;
    }

    // Getter Radius
    public double getRadius() {
        return radius;
    }

    // Getter Keliling
    public double getKeliling() {
        return 2 * (double) PEMBILANG / PENYEBUT * radius;
    }

    // Getter Luas
    public double getLuas() {
        return (double) PEMBILANG / PENYEBUT * radius * radius;
    }

    // Print Deskripsi
    public void printDeskripsi() {
        System.out.println("ID      : " + id);
        System.out.println("Radius  : " + radius);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas    : " + getLuas());
    }
}
