package module4.core.one;

abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();
}

class RegularPassenger extends Passenger{

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int getTicketPrice() {
        return 0;
    }
}

class VIPPassenger extends Passenger{

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int getTicketPrice() {
        return 0;
    }
}
