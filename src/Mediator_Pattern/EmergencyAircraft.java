package Mediator_Pattern;

public class EmergencyAircraft extends Aircraft {
    public EmergencyAircraft(String id) {
        super(id);
    }

    @Override
    public void receive(String message) {
        System.out.println("[EmergencyAircraft " + id + "] received: " + message);
    }
}
