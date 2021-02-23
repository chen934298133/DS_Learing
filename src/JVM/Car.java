package JVM;

public class Car {
    private String name;
    private int length;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", height=" + height +
                '}';
    }

    public Car() {
    }

    public Car(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }
}
