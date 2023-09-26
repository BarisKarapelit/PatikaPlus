package Week1.FlightTicketPriceCalculation;

public class FlightTicketPriceCalculation {
    private static Integer km;
    private static Integer age;
    private static Integer type;

    public static void SetKm(Integer km) {
        FlightTicketPriceCalculation.km = km;
    }
    public static void SetAge(Integer age) {
        FlightTicketPriceCalculation.age = age;
    }
    public static void SetType(Integer type) {
        FlightTicketPriceCalculation.type = type;
    }
    public static Integer GetKm() {
        return km;
    }
    public static Integer GetAge() {
        return age;
    }
    public static Integer GetType() {
        return type;
    }
    public static Double Calculate() {
        Double price = 0.10 * km;
        if (type == 1) {
            price = price * 0.90;
        } else if (type == 2) {
            price = price * 1.50;
        }
        if (age < 12) {
            price = price * 0.50;
        } else if (age > 65) {
            price = price * 0.70;
        }
        return price;
    }
}
