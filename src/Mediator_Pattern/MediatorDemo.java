package Mediator_Pattern;

public class MediatorDemo {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        PassengerPlane passenger1 = new PassengerPlane("P-001");
        CargoPlane cargo1 = new CargoPlane("C-001");
        Helicopter heli1 = new Helicopter("H-001");
        EmergencyAircraft emergency1 = new EmergencyAircraft("E-001");

        System.out.println("\n--- Planes requesting landing ---");
        passenger1.send("Requesting landing.", tower);
        tower.requestRunway(passenger1);

        cargo1.send("Requesting landing.", tower);
        tower.requestRunway(cargo1);

        heli1.send("Requesting landing.", tower);
        tower.requestRunway(heli1);

        System.out.println("\n--- Emergency situation ---");
        emergency1.send("EMERGENCY! Immediate landing required!", tower);
        tower.requestRunway(emergency1);
    }
}
