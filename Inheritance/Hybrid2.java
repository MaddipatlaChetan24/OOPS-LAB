interface Device {
    void displayDeviceInfo();
}

interface Smartphone extends Device {
    double calculateBatteryConsumption();
}

interface Tablet extends Device {
    double calculateStorageUsage();
}

class DeviceImpl implements Device {
    String brand;
    String model;

    public DeviceImpl(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

  
    public void displayDeviceInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class SmartphoneImpl extends DeviceImpl implements Smartphone {
    double batteryCapacity;  
    double batteryConsumptionPerHour; 

    public SmartphoneImpl(String brand, String model, double batteryCapacity, double batteryConsumptionPerHour) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
        this.batteryConsumptionPerHour = batteryConsumptionPerHour;
    }


    public double calculateBatteryConsumption() {
        return batteryConsumptionPerHour; 

   
    public void displayDeviceInfo() {
        super.displayDeviceInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh, Battery Consumption per Hour: " + batteryConsumptionPerHour + " mAh");
    }
}

class TabletImpl extends DeviceImpl implements Tablet {
    double storageCapacity; 
    double usedStorage;    

    public TabletImpl(String brand, String model, double storageCapacity, double usedStorage) {
        super(brand, model);
        this.storageCapacity = storageCapacity;
        this.usedStorage = usedStorage;
    }

  
    public double calculateStorageUsage() {
        return (usedStorage / storageCapacity) * 100;
    }

   
    public void displayDeviceInfo() {
        super.displayDeviceInfo();
        System.out.println("Storage Capacity: " + storageCapacity + " GB, Used Storage: " + usedStorage + " GB");
    }
}

class SmartTabletImpl extends SmartphoneImpl implements Tablet {
    double storageCapacity;
    double usedStorage;

    public SmartTabletImpl(String brand, String model, double batteryCapacity, double batteryConsumptionPerHour, double storageCapacity, double usedStorage) {
        super(brand, model, batteryCapacity, batteryConsumptionPerHour);
        this.storageCapacity = storageCapacity;
        this.usedStorage = usedStorage;
    }

    public double calculateStorageUsage() {
        return (usedStorage / storageCapacity) * 100; 
    }


    public void displayDeviceInfo() {
        super.displayDeviceInfo();
        System.out.println("Storage Capacity: " + storageCapacity + " GB, Used Storage: " + usedStorage + " GB");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartTabletImpl smartTablet = new SmartTabletImpl("Samsung", "Galaxy Tab", 8000, 500, 128, 40);
        smartTablet.displayDeviceInfo();
        System.out.println("Battery Consumption per Hour: " + smartTablet.calculateBatteryConsumption() + " mAh");
        System.out.println("Storage Usage: " + smartTablet.calculateStorageUsage() + "%");
    }
}
