public class Bog {
    private Status status;
    private boolean reserveret;

    public Bog() {
        status = Status.LEDIG;
    }
    public void laan() {
        status = Status.UDLÅNT;
        reserveret = false;
    }

    public void reserver() {
        reserveret = true;
    }

    public void aflever() {
        if (!reserveret) {
            status = Status.LEDIG;
        } else {
            status = Status.RESERVERET;
        }
    }

    public Status getStatus() {
        return status;
    }
}
