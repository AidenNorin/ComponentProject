
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

        return 0.0;
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

        return 0.0;
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

        return true;
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

        return true;
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

        return true;
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

        return true;
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

        return null;
    }

    /**
     * Gives the area of the triangle described by {@code this}.
     *
     * @return The area of the triangle described by {@code this}.
     */
    @Override
    public double area() {

        return 0.0;
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

        return 0.0;
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

        return 0.0;
    }
}
