// Superclass
class HillStations {
    public void location() {
        System.out.println("Generic Hill Station location.");
    }

    public void famousFor() {
        System.out.println("Generic Hill Station is famous for its beauty.");
    }
}

// Subclass 1
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for snow and adventure sports.");
    }
}

// Subclass 2
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for scenic beauty.");
    }
}

// Subclass 3
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing.");
    }
}

// Main Class
public class HillStationn {
    public static void main(String[] args) {
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}
