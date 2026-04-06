
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

        double angle = this.angleRadians(vertice1, vertice2) * (180 / Math.PI);

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

        int vertice3 = 6 - (vertice1 + vertice2);

        double a = this.edgeLength(vertice1, vertice2);
        double b = this.edgeLength(vertice1, vertice3);
        double c = this.edgeLength(vertice2, vertice3);

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

        double a = this.angleDegrees(1, 2);
        double b = this.angleDegrees(2, 3);
        double c = this.angleDegrees(1, 3);

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

        double a = this.angleDegrees(1, 2);
        double b = this.angleDegrees(2, 3);
        double c = this.angleDegrees(1, 3);

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

        double a = this.angleDegrees(1, 2);
        double b = this.angleDegrees(2, 3);
        double c = this.angleDegrees(1, 3);

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

        double a = this.angleDegrees(1, 2);
        double b = this.angleDegrees(2, 3);
        double c = this.angleDegrees(1, 3);

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

        double[] twoDimRep = this.twoDimensionRepresentation();

        double[] a = { twoDimRep[0], twoDimRep[1] };
        double[] b = { twoDimRep[2], twoDimRep[3] };
        double[] c = { twoDimRep[4], twoDimRep[5] };

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
        double edgeLen = 0.0;

        double[] v1 = this.getVertice(vertice1);
        double[] v2 = this.getVertice(vertice2);

        int dimensions = v1.length;

        double[] edgeVec = new double[dimensions];

        for (int i = 0; i < dimensions; i++) {
            edgeVec[i] = Math.abs(v2[i] - v1[i]);
        }

        for (int i = 0; i < dimensions; i++) {
            edgeLen += Math.pow(edgeVec[i], 2);
        }
        edgeLen = Math.sqrt(edgeLen);

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

        double len = this.edgeLength(1, 2) + this.edgeLength(1, 3)
                + this.edgeLength(2, 3);

        return len;
    }

    /**
     * Creates a new {@code double[]} to represent the vertices of {@code this}
     * while keeping the same scale.
     *
     * @return new {@code double[]} to represent the vertices of {@code this} in
     *         2 dimensions.
     */
    @Override
    public double[] twoDimensionRepresentation() {

        /**
         * Creating this method is by far the hardest problem. Solution will
         * most likely require me to apply Linear Algebra concepts I haven't
         * learned yet.
         */

        double[] v1 = this.getVertice(1);
        double[] v2 = this.getVertice(2);
        double[] v3 = this.getVertice(3);

        int dimensions = v1.length;

        /**
         * Step 1: translate triangle to have a vertice on the origin (Make
         * vertice 1 the origin).
         */

        double[] v2Centered = new double[dimensions];
        double[] v3Centered = new double[dimensions];

        for (int i = 0; i < dimensions; i++) {
            v2Centered[i] = v2[i] - v1[i];
            v3Centered[i] = v3[i] - v1[i];
        }

        /**
         * Step 2: find the lengths of 2 sides of the triangle.
         */

        double a = this.edgeLength(1, 2);
        double b = this.edgeLength(1, 3);

        /**
         * Step 2: find angle Theta between these two sides.
         */

        double dotProduct = 0.0; // The dot product between the two sides of the triangle

        for (int i = 0; i < dimensions; i++) {
            dotProduct += v2Centered[i] * v3Centered[i];
        }

        double theta = Math.acos(dotProduct / (a * b));

        /**
         * Step 3: Enter new points into the triangle.
         *
         * point 1 = (0, 0)
         *
         * point 2 = (a, 0)
         *
         * point 3 = (b*cos(Theta), b*sin(Theta))
         */

        double[] twoD = { 0.0, 0.0, a, 0.0, b * Math.cos(theta),
                b * Math.sin(theta) };

        return twoD;
    }

    /**
     * Converts {@code this} to a readable {@code String}.
     *
     * @return {@code String} representation of {@code this}.
     */
    @Override
    public String toString() {

        String str = "";

        int dimensions = this.getVertice(1).length;
        double[] v1 = this.getVertice(1);
        double[] v2 = this.getVertice(2);
        double[] v3 = this.getVertice(THREE);

        for (int i = 1; i <= THREE; i++) {
            str += "Vertice " + i + ": (";
            for (int j = 0; j < dimensions; j++) {
                str += "" + v1[j] + ", ";
                str += ")\n" + v2[j] + ", ";
                str += ")\n" + v3[j] + ", ";
            }
        }
        str += ")";

        return str;
    }
}
