package module4.core.one;

class LaunchCalculator {
    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
    }

    public int calculateTotalPrice(Spaceport spaceport, int passengerCount) {
        return spaceport.calculateTotalPrice(passengerCount);
    }
}

abstract class Spaceport {
    public abstract int calculateTotalPrice(int passengerCount);
}

class JupiterStar extends Spaceport {
    int fixedPrice = 500;
    int priceForOnePassenger = 2;

    @Override
    public int calculateTotalPrice(int passengerCount) {
        return fixedPrice += passengerCount * priceForOnePassenger;
    }
}

class MercuryBeat extends Spaceport {
    int priceForOnePassenger = 15;

    @Override
    public int calculateTotalPrice(int passengerCount) {
        return priceForOnePassenger *= passengerCount;
    }
}

class SunHeaven extends Spaceport {
    int fixedPrice = 2000;

    @Override
    public int calculateTotalPrice(int passengerCount) {
        return fixedPrice;
    }
}


