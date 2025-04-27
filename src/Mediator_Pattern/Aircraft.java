package Mediator_Pattern;

public abstract class Aircraft {
    protected final String id;

    public Aircraft(String id) {
        this.id = id;
    }

    public void send(String message, TowerMediator mediator) {
        mediator.broadcast(message, this);
    }

    public abstract void receive(String message);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
