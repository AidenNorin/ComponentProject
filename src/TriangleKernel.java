import components.standard.Standard;

/**
 * Interface for TriangleKernel.
 *
 * @author Aiden Norin
 */
public interface TriangleKernel extends Standard<Triangle> {

    /**
     * Constant to equal to 3, as the number three is incredibly useful when
     * working with triangles.
     */
    int THREE = 3;

    /**
     * Constant reused in many equations for triangles due to the area of a
     * parallelogram divided by 2 results in the area of the resulting triangle.
     */
    double HALF = 0.5;

    /**
     * Adds a vertice to {@code vertices} in {@code this}.
     *
     * @param coordinates
     *            coordinates of vertice to be added to {@code vertices} in
     *            {@code this}.
     * @requires numVertices <= 3.
     */
    void addVertice(double[] coordinates);

    /**
     * Removes an arbitrary vertice from {@code vertices} in {@code this}.
     *
     * @return The removed vertice from {@code vertices} in {@code this}.
     * @requires numVertices > 0.
     */
    double[] removeAnyVertice();

    /**
     * Removes a specific vertice from {@code vertices} in {@code this}
     * cooresponding to the index given from {@code vertice}.
     *
     * @param vertice
     *            {@code int} corresponding to the vertice to be removed.
     *
     * @return the coordinates of the removed {@code vertice} in {@code this}.
     * @requires numVertices > 0
     */
    double[] removeVertice(int vertice);

    /**
     * The number of vertices defined in the {@code this}.
     *
     * @ensures 0 <= numVertices <= 3.
     *
     * @return number of vertices in {@code this}.
     */
    int numVertices();

    /**
     * Returns the coordinates of the vertice corresponding to the given index.
     *
     * index = 0, corresponds to the first defined vertice.
     *
     * index = 1, corresponds to the second defined vertice.
     *
     * index = 2, corresponds to the third defined vertice.
     *
     * @param index
     *            {@code} corresponding to the specific vertice.
     *
     * @return The corresponding vertice to the {@code index}.
     */
    double[] getVertice(int index);

    /**
     * Gives the number of dimensions that {@code this} is represented in.
     *
     * @return The number of dimensions of the triangle represented by
     *         {@code this}.
     */
    int dimensions();
}
