package Week2.Box;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 120);
        Fighter alex = new Fighter("Alex", 10, 95, 100,50);
        Match match = new Match(marc, alex, 90, 100);
        match.run();
    }
}
