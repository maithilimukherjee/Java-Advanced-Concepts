/*
 * Concept: Java does not allow multiple inheritance of classes.
 * This problem is solved by the concept of interfaces.
 * If two interfaces provide the same method, then the implementing class must explicitly override it, leaving no ambiguity.
 */

interface FourWheelers {
    void type();
    void brand();
    void colour();
}

interface TwoWheelers {
    void type();
    void brand();
    void colour();
}

interface MultiWheelers {
    void type();
    void brand();
    void colour();
}

// Bus implements MultiWheelers
class Bus implements MultiWheelers {
    @Override
    public void type() {
        System.out.println("Bus is a multiwheeler vehicle.");
    }

    @Override
    public void brand() {
        System.out.println("Manufactured by Bharat Vahan.");
    }

    @Override
    public void colour() {
        System.out.println("Blue in colour.");
    }
}

// Car implements FourWheelers
class Car implements FourWheelers {
    @Override
    public void type() {
        System.out.println("Car is a four-wheeler vehicle.");
    }

    @Override
    public void brand() {
        System.out.println("Manufactured by Tata Motors.");
    }

    @Override
    public void colour() {
        System.out.println("Red in colour.");
    }
}

// Bike implements TwoWheelers
class Bike implements TwoWheelers {
    @Override
    public void type() {
        System.out.println("Bike is a two-wheeler vehicle.");
    }

    @Override
    public void brand() {
        System.out.println("Manufactured by Royal Enfield.");
    }

    @Override
    public void colour() {
        System.out.println("Black in colour.");
    }
}

// AutoRickshaw implements TWO interfaces
class AutoRickshaw implements TwoWheelers, MultiWheelers {
    @Override
    public void type() {
        System.out.println("AutoRickshaw can be seen as both a two-wheeler and a multi-wheeler.");
    }

    @Override
    public void brand() {
        System.out.println("Manufactured by Bajaj Auto.");
    }

    @Override
    public void colour() {
        System.out.println("Yellow and green in colour.");
    }
}

// Update Vehicles driver class
class Vehicles {
    public static void main(String[] args) {
        MultiWheelers bus = new Bus();
        bus.type();
        bus.brand();
        bus.colour();

        System.out.println();

        FourWheelers car = new Car();
        car.type();
        car.brand();
        car.colour();

        System.out.println();

        TwoWheelers bike = new Bike();
        bike.type();
        bike.brand();
        bike.colour();

        System.out.println();

        // Demonstrating multiple inheritance
        AutoRickshaw auto = new AutoRickshaw();
        auto.type();
        auto.brand();
        auto.colour();
    }
}
/*
 * Bus is a multiwheeler vehicle.
Manufactured by Bharat Vahan.
Blue in colour.

Car is a four-wheeler vehicle.
Manufactured by Tata Motors.
Red in colour.

Bike is a two-wheeler vehicle.
Manufactured by Royal Enfield.
Black in colour.

AutoRickshaw can be seen as both a two-wheeler and a multi-wheeler.
Manufactured by Bajaj Auto.
Yellow and green in colour.
 */