/**
 * Kernel implementation for {@code Triangle}.
 *
 * @author Aiden Norin
 */
public class Triangle1 extends TriangleSecondary {

    /**
     * Private Members ------------------------------------------------
     */

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
        this.numVertices = 0;
    }

    /**
     * Constructors ----------------------------------------------------
     */

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
     * @requires {@code dim} >= 2
     */
    public Triangle1(int dim) {
        assert dim >= 2 : "Violation of: dimension >= 2";
        this.createNewRep(dim);
    }

    /*
     * Standard methods -------------------------------------------------------
     */

    @Override
    public final Triangle newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep(this.dimensions);
    }

    @Override
    public final void transferFrom(Triangle source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof Triangle1 : ""
                + "Violation of: source is of dynamic type NaturalNumberExample";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case.
         */
        Triangle1 localSource = (Triangle1) source;
        this.dimensions = localSource.dimensions;
        this.coordinates = localSource.coordinates;
        this.numVertices = localSource.numVertices;
        localSource.createNewRep(localSource.dimensions);
    }

    /**
     * Constructor for {@code Triangle}. Creates a Triangle with inputs for the
     * coordinates of the {@code Triangle} in 2 dimensions.
     *
     * @param v1
     *            Array holding the coordinates of the first vertex in
     *            {@code this}.
     * @param v2
     *            Array holding the coordinates of the second vertex in
     *            {@code this}.
     * @param v3
     *            Array holding the coordinates of the third vertex in
     *            {@code this}.
     *
     * @requires |v1| == |v2| == |v3|
     * @requires |v1| >= 2
     */
    public Triangle1(double[] v1, double[] v2, double[] v3) {
        assert v1.length == v2.length && v1.length == v3.length : ""
                + "Violation of: |v1| == |v2| == |v3|";
        assert v1.length >= 2 : "Violation of: |v1| >= 2";
        this.createNewRep(v1.length);

        for (int i = 0; i < this.dimensions; i++) {
            this.coordinates[i] = v1[i];
            this.coordinates[i + this.dimensions] = v2[i];
            this.coordinates[i + (2 * this.dimensions)] = v3[i];
        }
        this.numVertices = THREE;
    }

    /**
     * Constructor for {@code Triangle}. Creates a Triangle with inputs for the
     * coordinates of the {@code Triangle} in 2 dimensions.
     *
     * @param v1
     *            Array holding the coordinates of the first vertex in
     *            {@code this}.
     * @param v2
     *            Array holding the coordinates of the second vertex in
     *            {@code this}.
     * @requires |v1| == |v2|
     * @requires |v1| >= 2
     */
    public Triangle1(double[] v1, double[] v2) {
        assert v1.length == v2.length : "" + "Violation of: |v1| == |v2|";
        assert v1.length >= 2 : "Violation of: |v1| >= 2";
        this.createNewRep(v1.length);

        for (int i = 0; i < this.dimensions; i++) {
            this.coordinates[i] = v1[i];
            this.coordinates[i + this.dimensions] = v2[i];
        }
        this.numVertices = 2;
    }

    /**
     * Constructor for {@code Triangle}. Creates a Triangle with inputs for the
     * coordinates of the {@code Triangle} in 2 dimensions.
     *
     * @param v1
     *            Array holding the coordinates of the first vertex in
     *            {@code this}.
     * @requires |v1| >= 2
     */
    public Triangle1(double[] v1) {
        assert v1.length >= 2 : "Violation of: |v1| >= 2";
        this.createNewRep(v1.length);

        for (int i = 0; i < this.dimensions; i++) {
            this.coordinates[i] = v1[i];
        }
        this.numVertices = 1;
    }

    /**
     * Kernel methods ---------------------------------------------------
     */

    /**
     * Adds a vertice to {@code vertices} in {@code this}.
     *
     * @param coords
     *            coordinates of vertice to be added to {@code vertices} in
     *            {@code this}.
     *
     * @requires numVertices <= 3.
     */
    @Override
    public void addVertice(double[] coords) {
        assert coords.length == this.dimensions : ""
                + "Violation of: coords.length == this.dimensions";
        assert this.numVertices <= THREE : ""
                + "Violation of: this.numVertices <= 3";

        for (int i = 0; i < this.dimensions; i++) {
            this.coordinates[i
                    + (this.dimensions * this.numVertices)] = coords[i];
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
    @Override
    public double[] removeAnyVertice() {
        double[] vertex = new double[this.dimensions];

        for (int i = 0; i < this.dimensions; i++) {
            vertex[i] = this.coordinates[i
                    + (this.dimensions * (this.numVertices - 1))];
            this.coordinates[i
                    + (this.dimensions * (this.numVertices - 1))] = 0.0;
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
    @Override
    public double[] removeVertice(int vertice) {
        assert this.numVertices > 0 : "Violation of: numVertices > 0";
        assert vertice <= this.numVertices : "Violation of: vertice <= numVertices";
        assert 1 <= vertice
                && vertice <= THREE : "Violation of: 1 <= vertice <= 3";

        double[] vertex = new double[this.dimensions];

        for (int i = 0; i < this.dimensions; i++) {
            vertex[i] = this.coordinates[i + (this.dimensions * (vertice - 1))];
            this.coordinates[i + (this.dimensions * (vertice - 1))] = 0.0;

            if (vertice < this.numVertices) {
                this.coordinates[i + (this.dimensions
                        * (vertice - 1))] = this.coordinates[i
                                + (this.dimensions * (this.numVertices - 1))];
                this.coordinates[i
                        + (this.dimensions * (this.numVertices - 1))] = 0.0;
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
    @Override
    public int numVertices() {
        return this.numVertices;
    }

    /**
     * Returns the coordinates of the vertice corresponding to the given index.
     *
     * index = 1, corresponds to the first vertex.
     *
     * index = 2, corresponds to the second vertex.
     *
     * index = 3, corresponds to the third vertex.
     *
     * @param index
     *            {@code} corresponding to the specific vertice.
     *
     * @return The corresponding vertice to the {@code index}.
     */
    @Override
    public double[] getVertice(int index) {
        double[] vertex = new double[this.dimensions];

        for (int i = 0; i < this.dimensions; i++) {
            vertex[i] = this.coordinates[i + (this.dimensions * (index - 1))];
        }

        return vertex;
    }

    /**
     * Gives the number of dimensions that {@code this} is represented in.
     *
     * @return The number of dimensions of the triangle represented by
     *         {@code this}.
     */
    @Override
    public int dimensions() {
        return this.dimensions;
    }

}
