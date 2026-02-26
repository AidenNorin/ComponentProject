/**
 * Triangle Proof of concept for component project.
 *
 * @author Aiden Norin
 */
public class TriangleProofOfConcept {

    /**
     * constant to suppress magic number waring that drives me crazy.
     */
    private final int three = 3;

    /**
     * holds the locations of the vertices of the triangle in {@code this}.
     *
     * vertex 1 = vertices[0 through (dimensions/3)-1]
     *
     * vertex 2 = vertices[(dimensions/3) through (2 * dimensions/3)-1]
     *
     * vertex 3 = vertices[(2 * dimensions/3) through (dimensions)-1]
     */
    private double[] vertices;

    /**
     * The dimensions of triangle in {@code this}.
     */
    private int dimensions;

    /**
     * The number of vertices in the triangle in {@code this}.
     */
    private int numVertices;

    /**
     * Creates a new representation of {@code TriangleProofOfConcept}.
     *
     * @param dimensions
     *            The number of dimensions the triangle will have.
     */
    public void createNewRep(int dimensions) {
        this.vertices = new double[this.three * dimensions];
        for (int i = 0; i < this.vertices.length; i++) {
            this.vertices[i] = 0.0;
        }
        this.dimensions = dimensions;
    }

    /**
     * Constructor for {@code TriangleProofOfConcept}.
     *
     * @param dimensions
     *            The number of dimensions the triangle will have.
     */
    public TriangleProofOfConcept(int dimensions) {
        this.createNewRep(dimensions);
    }

    // Kernel Methods

    /**
     * adds a vertice to {@code vertices}.
     *
     * @param coordinates
     *            coordinates of vertice to be added to {@code vertices}
     */
    public void addVertice(double[] coordinates) {
        assert this.dimensions != coordinates.length
                / this.three : "Violation of: dimensions of coordinates,"
                        + "and this.dimensions are equal";
        assert this.numVertices < this.three : "Violation of: triangle has"
                + "less than 3 vertices";

        this.numVertices++;

        boolean vertIsEmpty = true;
        for (int i = 0; i < this.vertices.length; i += this.dimensions) {
            for (int j = i; j < i + this.dimensions; j++) {
                if (vertIsEmpty && this.vertices[j] != 0.0) {
                    vertIsEmpty = false;
                }
                if (!vertIsEmpty) {
                    this.vertices[j] = coordinates[j - this.dimensions];
                }
            }
        }
    }

    /**
     * Removes a vertice from {@code vertices}.
     *
     * @return The removed vertice from {@code vertices}
     */
    public double[] removeAnyVertice() {
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
     * The main method.
     *
     * @param args
     *            unused
     */
    public static void main(String[] args) {

        System.out.println("Hello World!");

    }

}
