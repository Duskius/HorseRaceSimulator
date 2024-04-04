public class Main {
    //TESTING
    public static void main(String[] args) {
        //testHorseClass();
        testRaceClass();
        //System.out.println("♘, ♞, ❌");
    }

    public static void testHorseClass(){
        // Create a horse
        Horse horse = new Horse('♘', "PIPPI LONGSTOCKING", 0.8);

        // Accessor methods
        System.out.println("Name: " + horse.getName());
        System.out.println("Symbol: " + horse.getSymbol());
        System.out.println("Confidence: " + horse.getConfidence());
        System.out.println("Distance Travelled: " + horse.getDistanceTravelled());
        System.out.println("Has Fallen: " + horse.hasFallen());

        // Mutator methods
        horse.moveForward();
        System.out.println("Distance after moving forward: " + horse.getDistanceTravelled());

        horse.fall();
        System.out.println("Has Fallen: " + horse.hasFallen());

        horse.goBackToStart();
        System.out.println("Distance after going back to start: " + horse.getDistanceTravelled());
        System.out.println("Has Fallen after going back to start: " + horse.hasFallen());

        horse.setConfidence(0.9);
        System.out.println("New confidence: " + horse.getConfidence());

        horse.setSymbol('H');
        System.out.println("New symbol: " + horse.getSymbol());

        //System.out.println(horse.validateConfidence(0.5));
        //System.out.println(horse.validateConfidence(0));
        //System.out.println(horse.validateConfidence(1.5));
    }

    public static void testRaceClass(){
        // Test Case 1: Basic Race
        testBasicRace();

        // Test Case 2: Long Race
        //testLongRace();

        // Test Case 3: Short Race
        //testShortRace();

        // Test Case 4: No Horses Added
        //testNoHorsesAdded();

        // Test Case 5: Invalid Lane Number
        //testInvalidLaneNumber();

        // Test Case 6: Horse Falls
        //testHorseFalls();

        // Test Case 7: Race Tie
        //testRaceTie();

        // Test Case 8: Negative Race Length
        //testNegativeRaceLength();

        // Test Case 9: Zero Confidence
        //testZeroConfidence();

        // Test Case 10: Maximum Confidence
        //testMaximumConfidence();
    }

    // Test Case 1: Basic Race
    public static void testBasicRace() {
        Race race = new Race(10); // Race length = 100 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0.8);
        Horse horse2 = new Horse('K', "KOKOMO", 0.6);
        Horse horse3 = new Horse('E', "EL JEFE", 1.0);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }

    // Test Case 2: Long Race
    public static void testLongRace() {
        Race race = new Race(50); // Race length = 500 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0.8);
        Horse horse2 = new Horse('K', "KOKOMO", 0.6);
        Horse horse3 = new Horse('E', "EL JEFE", 0.4);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }

    // Test Case 3: Short Race
    public static void testShortRace() {
        Race race = new Race(1); // Race length = 50 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0.8);
        Horse horse2 = new Horse('K', "KOKOMO", 0.6);
        Horse horse3 = new Horse('E', "EL JEFE", 0.4);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }

    // Test Case 4: No Horses Added
    public static void testNoHorsesAdded() {
        Race race = new Race(10); // Race length = 100 meters
        race.startRace();
    }

    // Test Case 5: Invalid Lane Number
    public static void testInvalidLaneNumber() {
        Race race = new Race(10); // Race length = 100 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0.8);
        Horse horse2 = new Horse('K', "KOKOMO", 0.6);
        Horse horse3 = new Horse('E', "EL JEFE", 0.4);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 4);
        race.startRace();
    }

    // Test Case 6: Horse Falls
    public static void testHorseFalls() {
        Race race = new Race(10); // Race length = 100 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0.8);
        Horse horse2 = new Horse('K', "KOKOMO", 0.6);
        Horse horse3 = new Horse('E', "EL JEFE", 0.4);
        horse1.setConfidence(1.0); // Ensure horse always moves forward
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }

    // Test Case 7: Race Tie
    public static void testRaceTie() {
        Race race = new Race(1); // Race length = 100 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0.8);
        Horse horse2 = new Horse('K', "KOKOMO", 0.8); // Same confidence as horse1
        Horse horse3 = new Horse('E', "EL JEFE", 0.8);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }

    // Test Case 8: Negative Race Length
    public static void testNegativeRaceLength() {
        Race race = new Race(-5); // Negative race length
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0.8);
        Horse horse2 = new Horse('K', "KOKOMO", 0.6);
        Horse horse3 = new Horse('E', "EL JEFE", 0.4);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }

    // Test Case 9: Zero Confidence
    public static void testZeroConfidence() {
        Race race = new Race(10); // Race length = 100 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 0);
        Horse horse2 = new Horse('K', "KOKOMO", 0);
        Horse horse3 = new Horse('E', "EL JEFE", 0);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }

    // Test Case 10: Maximum Confidence
    public static void testMaximumConfidence() {
        Race race = new Race(10); // Race length = 100 meters
        Horse horse1 = new Horse('H', "PIPPI LONGSTOCKING", 1);
        Horse horse2 = new Horse('K', "KOKOMO", 1);
        Horse horse3 = new Horse('E', "EL JEFE", 1);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }
}
