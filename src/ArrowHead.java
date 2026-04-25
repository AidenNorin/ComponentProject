import java.util.Scanner;

/**
 * Rates an arrowhead described to it as good or bad based on how pointy it is.
 *
 * @author Aiden Norin
 */
public final class ArrowHead {

    /**
     * No argument constructor to prevent instantiation.
     */
    private ArrowHead() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Triangle arrowHead = new Triangle1();

        System.out.println(
                "Measure your arrowhead and translate it's dimensions");
        System.out.println(
                "into a triangular shape described by it's three vertices.");
        System.out.println(
                "Please enter each coordinate of each corner seperately.");

        System.out.print("First corner (x): ");
        double point11 = reader.nextDouble();
        System.out.print("First corner (y): ");
        double point12 = reader.nextDouble();
        System.out.print("Second corner (x): ");
        double point21 = reader.nextDouble();
        System.out.print("Second corner (y): ");
        double point22 = reader.nextDouble();
        System.out.print("Third corner (x): ");
        double point31 = reader.nextDouble();
        System.out.print("Third corner (y): ");
        double point32 = reader.nextDouble();

        double[] point1 = { point11, point12 };
        double[] point2 = { point21, point22 };
        double[] point3 = { point31, point32 };

        arrowHead.addVertice(point1);
        arrowHead.addVertice(point2);
        arrowHead.addVertice(point3);

        if (arrowHead.isAcute()) {
            System.out.println("That's a really good arrowhead!");
        } else {
            System.out.println("That arrowhead could be better.");
        }

        reader.close();
    }
}
