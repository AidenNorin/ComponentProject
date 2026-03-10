/**
 * Triangles (woah).
 */
public interface Triangle extends TriangleKernel {

    /**
     * Finds and returns the area of the triangle in {@code this}. Curretly only
     * proved to work for matricies and triangles in 2 dimensions.
     *
     * @return The area of the triangle in {@code this}
     */
    double area();

    /**
     * Determines if the triangle described by {@code this} is an acute triangle.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @return {@code true} if {@code this} is an acute triangle, and false
     *         otherwise.
     */
    boolean isAcute();

    /**
     * Determines if the triangle described by {@code this} is an obtuse triangle.
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
     * Determines if the triangle described by {@code this} is an equilateral triangle.
     *
     * @requires No two {@code vertice} in {@code this} should share the same
     *           coordinates.
     *
     * @return {@code true} if {@code this} is an equilateral triangle, and false
     *         otherwise.
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

}
