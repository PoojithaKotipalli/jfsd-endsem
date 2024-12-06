package section_15.exam;



import javax.persistence.Entity;

@Entity
public class Smartphone extends Device {
    private String operatingSystem;
    private int cameraResolution;

    // Constructors, getters, and setters
    public Smartphone() {}

    public Smartphone(String brand, String model, double price, String operatingSystem, int cameraResolution) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSystem() { return operatingSystem; }
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    public int getCameraResolution() { return cameraResolution; }
    public void setCameraResolution(int cameraResolution) { this.cameraResolution = cameraResolution; }
}
