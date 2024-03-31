package turing.JavaSE.Day22;

public class TimeZoneDemo {
    public static void main(String[] args) {
        for (String i : java.time.ZoneId.getAvailableZoneIds()) {
            System.out.println("Zones = " + i);
        }
        System.out.println("Current TimeZone = " + java.time.ZoneId.systemDefault());
    }
}
