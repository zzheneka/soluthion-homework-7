package Mediator_Pattern;

import java.util.LinkedList;
import java.util.Queue;

public class ControlTower implements TowerMediator {
    private final Queue<Aircraft> landingQueue = new LinkedList<>();

    @Override
    public void broadcast(String message, Aircraft sender) {
        System.out.println("[Broadcast from " + sender + "]: " + message);
    }

    @Override
    public boolean requestRunway(Aircraft aircraft) {
        if (landingQueue.isEmpty()) {
            System.out.println(aircraft + " cleared to land immediately.");
            return true;
        } else {
            landingQueue.add(aircraft);
            System.out.println(aircraft + " added to landing queue. Position: " + landingQueue.size());
            return false;
        }
    }


}
