package device;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Device device1 = new Device("ABC",31.1f, "33399");
        Device device2 = new Device("ABC",31.1f, "33399");
        Monitor monitor = new Monitor();
        Monitor monitor1 = new Monitor(1280,1024);
        Monitor monitor2 = new Monitor(1280,1024);
        // без перевизначення toString(), hashCode() та equals()
        System.out.println(device1.toString());
        System.out.println(device2);            // toString() можна не писати, все одно повертає getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(monitor1.toString());
        System.out.println(monitor2);
        System.out.println("device hashCode = " + device.hashCode());
        System.out.println("monitor hashCode = " + monitor.hashCode());
        System.out.println("device.equals(monitor) = " + device.equals(monitor));
        System.out.println("device1 hashCode = " + device1.hashCode());
        System.out.println("device2 hashCode = " + device2.hashCode());
        System.out.println("monitor1 hashCode = " + monitor1.hashCode());
        System.out.println("monitor2 hashCode = " + monitor2.hashCode());
        System.out.println("device1.equals(device2) = " + device1.equals(device2));
        System.out.println("monitor1.equals(monitor2) = " + monitor1.equals(monitor2));

    }
}
