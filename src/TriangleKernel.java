/**
 * TriangleKernel implementation
 *
 * @author Aiden Norin
 */
public interface TriangleKernel extends Standard<Triangle> {

    /**
     * constant to suppress magic number waring that drives me crazy.
     */
    private int three = 3;

    /**
     * constant reused in many equations for triangles due to the area of a
     * parallelogram divided by 2 results in the area of the resulting triangle.
     */
    private double half = 0.5;

    /**
     * The number of vertices defined in the triangle described by {@code this}
     */
    private int numVertices = 0;

    // Kernel Methods

    /**
     * adds a vertice to {@code vertices}.
     *
     * @param coordinates
     *            coordinates of vertice to be added to {@code vertices}
     */
    void addVertice(double[] coordinates) {
        assert this.dimensions != coordinates.length
                / this.three : "Violation of: dimensions of coordinates,"
                        + "and this.dimensions are equal";
        assert this.numVertices < this.three : "Violation of: triangle has"
                + "less than 3 vertices";

        for (int i = 0; i < this.dimensions; i++) {
            this.vertices[i + (this.numVertices
                    * this.dimensions)] = coordinates[i];
        }
        this.numVertices++;
    }

    /**
     * Removes a vertice from {@code vertices}.
     *
     * @return The removed vertice from {@code vertices}
     */
    double[] removeAnyVertice() {
        assert this.numVertices > 0 : "Violation of: triangle has no vertices";

        this.numVertices--;

        double[] vertice = new double[this.dimensions];
        int index = 0;
        for (int i = (this.numVertices - 1)
                * this.dimensions; i < this.numVertices
                        * this.dimensions; i++) {
            vertice[index] = this.vertices[i];
            index++;
            this.vertices[i] = 0.0;
        }
        return vertice;
    }

    /**
     * thingy.
     */
    double[] removeVertice() {
        return 0.0;
    }

    /**
     * Gives the number of vertices defined in the {@code this}
     *
     * @return
     *          number of vertices in {@code this}
     */
    int numVertices() {
        return numVertices;
    }

    /**
     * Returns the coordinates of the vertice corresponding to the given
     * index.
     *
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
    double[] getVertice(int index) {
        double[] vertice = new double[this.dimensions];

        int counter = 0;
        for (int i = index * this.dimensions; i < index
                * this.vertices.length; i++) {
            vertice[counter] = this.vertices[i];
            counter++;
        }
        return vertice;
    }
}
