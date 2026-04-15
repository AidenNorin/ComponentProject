/**
 * Kernel implementation for {@code Triangle}.
 *
 * @author Aiden Norin
 */
public class Triangle1 {

    /**
     * Constant to equal to 3, as the number three is incredibly useful when
     * working with triangles.
     */
    private static final int THREE = 3;

    /**
     * The number of dimensions that the triangle described by {@code this} is
     * being described in.
     */
    private int dimensions;

    /**
     * Holds the coordinates of all vertices in {@code this}.
     */
    private double[] coordinates;

    /**
     * Holds the number of vertices that are in {@code this}.
     */
    private int numVertices;

    /**
     * Creates a new representation of {@code Triangle} in n dimensions.
     *
     * @param dim
     *            The number of dimensions that {@code Triangle} is in.
     */
    private void createNewRep(int dim) {
        this.dimensions = dim;
        this.coordinates = new double[this.dimensions * THREE];
    }

    /**
     * No argument Constructor for {@code Triangle}. Creates a 2d
     * {@code Triangle} in 2 dimensions.
     */
    public Triangle1() {
        this.createNewRep(2);
    }

    /**
     * No argument Constructor for {@code Triangle}. Creates a 2d
     * {@code Triangle} in 2 dimensions.
     *
     * @param dim
     *            The number of dimensions {@code this} is represented in.
     *
     * @requires {@code dim} >= 2.
     */
    public Triangle1(int dim) {
        assert dim >= 2 : "Violation of: dimension >= 2";
        this.createNewRep(dim);
    }

    /**
     * Adds a vertice to {@code vertices} in {@code this}.
     *
     * @param coords
     *            coordinates of vertice to be added to {@code vertices} in
     *            {@code this}.
     *
     * @requires numVertices <= 3.
     */
    public void addVertice(double[] coords) {
        assert coords.length != this.dimensions : ""
                + "Violation of: coordinates.length != this.dimensions";
        assert this.numVertices <= THREE : ""
                + "Violation of: this.numVertices <= 3";

        for (int i = 0; i < this.dimensions; i++) {
            this.coordinates[i * this.numVertices] = coords[i];
        }

        this.numVertices++;
    }

    /**
     * Removes an arbitrary vertice from {@code vertices} in {@code this}.
     *
     * @requires numVertices > 0.
     *
     * @return The removed vertice from {@code vertices} in {@code this}.
     */
    public double[] removeAnyVertice() {
        double[] vertex = new double[this.dimensions];

        for (int i = 0; i < this.dimensions; i++) {
            vertex[i] = this.coordinates[i * this.numVertices];
            this.coordinates[i * this.numVertices] = 0.0;
        }

        this.numVertices--;

        return vertex;
    }

    /**
     * Removes a specific vertice from {@code vertices} in {@code this}
     * cooresponding to the index given from {@code vertice}.
     *
     * @param vertice
     *            {@code int} corresponding to the vertice to be removed.
     *
     * @return the coordinates of the removed {@code vertice} in {@code this}.
     * @requires numVertices > 0
     * @requires vertice <= numVertices
     * @requires 1 <= vertice <= 3
     *
     */
    public double[] removeVertice(int vertice) {
        assert this.numVertices > 0 : "Violation of: numVertices > 0";
        assert vertice <= this.numVertices : "Violation of: vertice <= numVertices";
        assert 1 <= vertice
                && vertice <= THREE : "Violation of: 1 <= vertice <= 3";

        double[] vertex = new double[this.dimensions];

        for (int i = 0; i < this.dimensions; i++) {
            vertex[i] = this.coordinates[i * this.numVertices];
            this.coordinates[i * vertice] = 0.0;

            if (vertice < this.numVertices) {
                this.coordinates[i * vertice] = this.coordinates[i
                        * this.numVertices];
            }

        }

        this.numVertices--;

        return vertex;
    }

    /**
     * The number of vertices defined in the {@code this}.
     *
     * @ensures 0 <= numVertices <= 3.
     *
     * @return number of vertices in {@code this}.
     */
    public int numVertices() {
        return this.numVertices;
    }

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
    public double[] getVertice(int index) {
        double[] vertex = new double[this.dimensions];

        for (int i = 0; i < this.dimensions; i++) {
            vertex[i] = this.coordinates[i * index];
        }

        return vertex;
    }

}
