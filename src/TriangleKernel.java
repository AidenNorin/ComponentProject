import components.standard.Standard;

/**
 * TriangleKernel implementation.
 *
 * @author Aiden Norin
 */
public interface TriangleKernel extends Standard<Triangle> {

    /**
     * constant to suppress magic number waring that drives me crazy.
     */
    int THREE = 3;

    /**
     * constant reused in many equations for triangles due to the area of a
     * parallelogram divided by 2 results in the area of the resulting triangle.
     */
    double HALF = 0.5;

    /**
     * adds a vertice to {@code vertices}.
     *
     * @param coordinates
     *            coordinates of vertice to be added to {@code vertices}
     */
    void addVertice(double[] coordinates);

    /**
     * Removes an arbitrary vertice from {@code vertices}.
     *
     * @return The removed vertice from {@code vertices}
     */
    double[] removeAnyVertice();

    /**
     * removes a specific vertice from {@code vertices}.
     *
     * @param vertice
     *            integer corresponding to the vertice to be removed.
     * @return the coordinates of the removed {@code vertice}
     *
     */
    double[] removeVertice(int vertice);

    /**
     * The number of vertices defined in the {@code this}.
     *
     * @return number of vertices in {@code this}
     */
    int numVertices();

    /**
     * Returns the coordinates of the vertice corresponding to the given
     * index.
     * index = 0, corresponds to vertice 1.
     *
     * index = 1, corresponds to vertice 2.
     *
     * index = 2, corresponds to vertice 3.
     *
     * @param index
     *            The number corresponding to the specific vertice.
     *
     * @return The corresponding vertice to the {@code index}
     */
    double[] getVertice(int index);
}
