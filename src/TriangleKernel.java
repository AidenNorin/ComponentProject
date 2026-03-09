import components.standard.Standard;

/**
 * TriangleKernel implementation.
 *
 * @author Aiden Norin
 */
public interface TriangleKernel extends Standard<Triangle> {

    /**
     * constant to equal to 3, as the number three is incredibly useful when
     * working with triangles.
     */
    int THREE = 3;

    /**
     * constant reused in many equations for triangles due to the area of a
     * parallelogram divided by 2 results in the area of the resulting triangle.
     */
    double HALF = 0.5;

    /**
     * adds a vertice to {@code vertices} in {@code this}.
     *
     * @param coordinates
     *            coordinates of vertice to be added to {@code vertices} in
     *            {@code this}.
     */
    void addVertice(double[] coordinates);

    /**
     * Removes an arbitrary vertice from {@code vertices} in {@code this}.
     *
     * @return The removed vertice from {@code vertices} in {@code this}
     */
    double[] removeAnyVertice();

    /**
     * removes a specific vertice from {@code vertices} in {@code this}.
     *
     * @param vertice
     *            integer corresponding to the vertice to be removed.
     * @return the coordinates of the removed {@code vertice} in {@code this}
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
     * Returns the coordinates of the vertice corresponding to the given index.
     *
     * index = 0, corresponds to the first defined vertice.
     *
     * index = 1, corresponds to the second defined vertice.
     *
     * index = 2, corresponds to the third defined vertice.
     *
     * @param index
     *            The number corresponding to the specific vertice.
     *
     * @return The corresponding vertice to the {@code index}
     */
    double[] getVertice(int index);
}
