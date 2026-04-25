import java.util.Scanner;

/**
 * Describes a Tetrahedron and gives it's surface area.
 *
 * @author Aiden Norin
 */
public final class Tetrahedron {

    /**
     * No argument constructor to prevent instantiation.
     */
    private Tetrahedron() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double[][] point = new double[4][3];
        System.out.println(""
                + "Please enter all points in the form `x.xx y.yy z.zz` DO NOT ADD EXTRA DIGITS!");

        System.out.print(
                "Please enter the first point of the tetrahedron in three dimensions: ");
        String strFace1 = reader.nextLine();
        System.out.print("Second point: ");
        String strFace2 = reader.nextLine();
        System.out.print("Third point: ");
        String strFace3 = reader.nextLine();
        System.out.print("Fourth point: ");
        String strFace4 = reader.nextLine();

        for (int i = 0; i < 3; i++) {
            point[0][i] = Double
                    .parseDouble(strFace1.substring(5 * i, (5 * (i + 1)) - 1));
            point[1][i] = Double
                    .parseDouble(strFace2.substring(5 * i, (5 * (i + 1)) - 1));
            point[2][i] = Double
                    .parseDouble(strFace3.substring(5 * i, (5 * (i + 1)) - 1));
            point[3][i] = Double
                    .parseDouble(strFace4.substring(5 * i, (5 * (i + 1)) - 1));
            System.out.println(strFace4.substring(5 * i, (5 * (i + 1)) - 1));
            System.out.println(point[3][i]);
        }

        Triangle face1 = new Triangle1(point[0], point[1], point[2]);
        Triangle face2 = new Triangle1(point[0], point[1], point[3]);
        Triangle face3 = new Triangle1(point[0], point[2], point[3]);
        Triangle face4 = new Triangle1(point[1], point[2], point[3]);

        double surfaceArea = face1.area() + face2.area() + face3.area()
                + face4.area();
        System.out.println(surfaceArea);

        reader.close();
    }
}
