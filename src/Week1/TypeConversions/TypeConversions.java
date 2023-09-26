package Week1.TypeConversions;

public class TypeConversions {
    public static void main(String[] args) {
        int i = 100;
        long l = i; // implicit type conversion
        float f = l; // implicit type conversion
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);

        double d = 100.04;
        long l2 = (long) d; // explicit type conversion
        int i2 = (int) l2; // explicit type conversion
        System.out.println("Double value "+d);
        System.out.println("Long value "+l2);
        System.out.println("Int value "+i2);

        int i3 = 100;
        byte b = (byte) i3; // explicit type conversion
        System.out.println("Int value "+i3);
        System.out.println("Byte value "+b);

        double d2 = 100.04;
        int i4 = (int) d2; // explicit type conversion
        byte b2 = (byte) i4; // explicit type conversion
        System.out.println("Double value "+d2);
        System.out.println("Int value "+i4);
        System.out.println("Byte value "+b2);

    }
}
