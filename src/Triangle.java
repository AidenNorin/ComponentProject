/**
 * Enhanced interface for the {@code Triangle} component.
 */
public interface Triangle extends TriangleKernel {

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
    double angleDegrees(int vertice1, int vertice2);

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
    double angleRadians(int vertice1, int vertice2);

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
    boolean isAcute();

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
    boolean isObtuse();

    /**
     * Determines if the triangle described by {@code this} is a right triangle.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @return {@code true} if {@code this} is a right triangle, and false
     *         otherwise.
     */
    boolean isRight();

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
    boolean isEquilateral();

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
    String triangleType();

    /**
     * Gives the area of the triangle described by {@code this}.
     *
     * @return The area of the triangle described by {@code this}.
     */
    double area();

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
    double edgeLength(int vertice1, int vertice2);

    /**
     * Gives the perimeter of the triangle described by {@code this}.
     *
     * @ensures perimeter = edgeLength(0, 1) + edgeLength(1, 2) + edgeLength(2,
     *          0).
     *
     * @return perimeter of the triangle described by {@code this}.
     */
    double perimeter();

    /**
     * Creates a new {@code Triangle} in the same scale as {@code this} but
     * rotated to fit 2 dimensions.
     *
     * @return new {@code Triangle} to represent {@code this} in 2 dimensions.
     */
    Triangle twoDimensionRepresentation();

}
