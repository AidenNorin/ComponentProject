
/**
 * Implementation of secondary methods for {@code Triangle}.
 */
public abstract class TriangleSecondary implements Triangle {

    /**
     * Gives the angle between two vertices in the triangle described by
     * {@code this} (with respect to the third vertice) in degrees.
     *
     * @param vertice1
     *            {@code int} cooresponding to a {@code vertice} in
     *            {@code this}.
     *
     * @param vertice2
     *            {@code int} cooresponding to a {@code vertice} in
     *            {@code this}.
     *
     * @return the angle between {@code vertice1}, and {@code vertice2} in
     *         degrees.
     */
    @Override
    public double angleDegrees(int vertice1, int vertice2) {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        int vertice3 = 6 - (vertice1 + vertice2);

        double a = twoDimRep.edgeLength(vertice1, vertice2);
        double b = twoDimRep.edgeLength(vertice1, vertice3);
        double c = twoDimRep.edgeLength(vertice2, vertice3);

        double angle = Math.atan(((b * b) + (c * c) - (a * a)) / (2 * b * c));

        angle = angle * (180 / Math.PI);

        return angle;
    }

    /**
     * Gives the angle between two vertices in the triangle described by
     * {@code this} (with respect to the third vertice) in radians.
     *
     * @param vertice1
     *            {@code int} cooresponding to a {@code vertice} in
     *            {@code this}.
     *
     * @param vertice2
     *            {@code int} cooresponding to a {@code vertice} in
     *            {@code this}.
     *
     * @return the angle between {@code vertice1}, and {@code vertice2} in
     *         radians.
     */
    @Override
    public double angleRadians(int vertice1, int vertice2) {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        int vertice3 = 6 - (vertice1 + vertice2);

        double a = twoDimRep.edgeLength(vertice1, vertice2);
        double b = twoDimRep.edgeLength(vertice1, vertice3);
        double c = twoDimRep.edgeLength(vertice2, vertice3);

        double angle = Math.atan(((b * b) + (c * c) - (a * a)) / (2 * b * c));

        return angle;
    }

    /**
     * Determines if the triangle described by {@code this} is an acute
     * triangle.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @return {@code true} if {@code this} is an acute triangle, and false
     *         otherwise.
     */
    @Override
    public boolean isAcute() {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        double a = twoDimRep.angleDegrees(1, 2);
        double b = twoDimRep.angleDegrees(2, 3);
        double c = twoDimRep.angleDegrees(1, 3);

        boolean acute = true;

        if (a >= (Math.PI / 2.0) || a >= -(Math.PI / 2.0)) {
            acute = false;
        }
        if (b >= (Math.PI / 2.0) || b >= -(Math.PI / 2.0)) {
            acute = false;
        }
        if (c >= (Math.PI / 2.0) || c >= -(Math.PI / 2.0)) {
            acute = false;
        }
        return acute;
    }

    /**
     * Determines if the triangle described by {@code this} is an obtuse
     * triangle.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @return {@code true} if {@code this} is an obtuse triangle, and false
     *         otherwise.
     */
    @Override
    public boolean isObtuse() {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        double a = twoDimRep.angleDegrees(1, 2);
        double b = twoDimRep.angleDegrees(2, 3);
        double c = twoDimRep.angleDegrees(1, 3);

        boolean obtuse = true;

        if (a <= (Math.PI / 2.0) || a <= -(Math.PI / 2.0)) {
            obtuse = false;
        }
        if (b <= (Math.PI / 2.0) || b <= -(Math.PI / 2.0)) {
            obtuse = false;
        }
        if (c <= (Math.PI / 2.0) || c <= -(Math.PI / 2.0)) {
            obtuse = false;
        }
        return obtuse;
    }

    /**
     * Determines if the triangle described by {@code this} is a right triangle.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @return {@code true} if {@code this} is a right triangle, and false
     *         otherwise.
     */
    @Override
    public boolean isRight() {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        double a = twoDimRep.angleDegrees(1, 2);
        double b = twoDimRep.angleDegrees(2, 3);
        double c = twoDimRep.angleDegrees(1, 3);

        boolean right = true;

        if (a == (Math.PI / 2.0) || a == -(Math.PI / 2.0)) {
            right = false;
        }
        if (b == (Math.PI / 2.0) || b == -(Math.PI / 2.0)) {
            right = false;
        }
        if (c == (Math.PI / 2.0) || c == -(Math.PI / 2.0)) {
            right = false;
        }
        return right;
    }

    /**
     * Determines if the triangle described by {@code this} is an equilaterl
     * triangle.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @return {@code true} if {@code this} is an equilateral triangle, and
     *         false otherwise.
     */
    @Override
    public boolean isEquilateral() {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        double a = twoDimRep.angleDegrees(1, 2);
        double b = twoDimRep.angleDegrees(2, 3);
        double c = twoDimRep.angleDegrees(1, 3);

        boolean equilateral = true;

        if (a == (Math.PI / 3.0) || a == -(Math.PI / 3.0)) {
            equilateral = false;
        }
        if (b == (Math.PI / 3.0) || b == -(Math.PI / 3.0)) {
            equilateral = false;
        }
        if (c == (Math.PI / 3.0) || c == -(Math.PI / 3.0)) {
            equilateral = false;
        }
        return equilateral;
    }

    /**
     * Returns whether `this` is acute, obtuse, right, or equilateral in the
     * form of a {@code String}.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @ensure triangleType = "acute" if {@code this} is an acute triangle.
     *         triangleType = "obtuse" if {@code this} an obtuse triangle.
     *         triangleType = "right" if {@code this} is a right triangle.
     *         triangleType = "equilateral" if {@code this} is an equilateral
     *         triangle.
     *
     * @return {@code String} corresponding to the type of triangle that
     *         {@code this} is.
     */
    @Override
    public String triangleType() {

        String type = "";

        if (this.isAcute()) {
            type = "acute";
        } else if (this.isObtuse()) {
            type = "obtuse";
        } else if (this.isRight()) {
            type = "right";
        } else if (this.isEquilateral()) {
            type = "equilateral";
        }

        return null;
    }

    /**
     * Gives the area of the triangle described by {@code this}.
     *
     * @return The area of the triangle described by {@code this}.
     */
    @Override
    public double area() {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        double[] a = twoDimRep.getVertice(1);
        double[] b = twoDimRep.getVertice(2);
        double[] c = twoDimRep.getVertice(3);

        double totalArea = 0.5 * ((a[1] * (b[2] - c[2]))
                + (b[1] * (c[2] - a[2])) + (c[1] * (a[2] - b[2])));

        return totalArea;
    }

    /**
     * Gives the length of the edge of the triangle described by {@code this}
     * between {@code vertice1} and {@code vertice2}.
     *
     * @param vertice1
     *            {@code int} cooresponding to a {@code vertice} in
     *            {@code this}.
     *
     * @param vertice2
     *            {@code int} cooresponding to a {@code vertice} in
     *            {@code this}.
     *
     * @return the length of the edge between {@code vertice1} and
     *         {@code vertice2}.
     */
    @Override
    public double edgeLength(int vertice1, int vertice2) {
        Triangle twoDimRep = this.twoDimensionRepresentation();

        double[] v1 = twoDimRep.getVertice(vertice1);
        double[] v2 = twoDimRep.getVertice(vertice2);

        double edgeLen = Math.sqrt((v1[0] + v2[0]) * (v1[0] + v2[0])
                + (v1[1] + v2[1]) * (v1[1] + v2[1]));

        return edgeLen;
    }

    /**
     * Gives the perimeter of the triangle described by {@code this}.
     *
     * @ensures perimeter = edgeLength(0, 1) + edgeLength(1, 2) + edgeLength(2,
     *          0).
     *
     * @return perimeter of the triangle described by {@code this}.
     */
    @Override
    public double perimeter() {

        Triangle twoDimRep = this.twoDimensionRepresentation();

        double len = twoDimRep.edgeLength(1, 2) + twoDimRep.edgeLength(1, 3)
                + twoDimRep.edgeLength(2, 3);

        return len;
    }

    /**
     * Creates a new {@code Triangle} in the same scale as {@code this} but
     * rotated to fit 2 dimensions.
     *
     * @return new {@code Triangle} to represent {@code this} in 2 dimensions.
     */
    @Override
    public Triangle twoDimensionRepresentation() {

        /**
         * Creating this method is by far the hardest problem. Solution will
         * most likely require me to apply Linear Algebra concepts I haven't
         * learned yet.
         */

        return null;
    }
}
