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
     * constant reused in many equations for triangles due to the area of a
     * parallelogram divided by 2 results in the area of the resulting triangle.
     */
    private final double half = 0.5;

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

        for (int i = 0; i < this.dimensions; i++) {
            this.vertices[i
                    + (this.numVertices * this.dimensions)] = coordinates[i];
        }
        this.numVertices++;
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
     * Returns the coordinates of the vertice corresponding to the given index.
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
    public double[] getVertice(int index) {
        double[] vertice = new double[this.dimensions];

        int counter = 0;

        for (int i = index * this.dimensions; i < index
                * this.vertices.length; i++) {
            vertice[counter] = this.vertices[i];
            counter++;
        }

        return vertice;
    }

    // Secondary methods

    /**
     * Finds and returns the area of the triangle in {@code this}. Curretly only
     * proved to work for matricies and triangles in 2 dimensions.
     *
     * @return The area of the triangle in {@code this}
     */
    public double area() {

        double triangleArea = 0.0;

        double determinant = 0.0;

        for (int i = 0; i < this.three; i++) {
            determinant += (this.vertices[i]
                    * this.vertices[i + this.dimensions + 1])
                    - this.vertices[Math.floorMod(this.three - (i * 2),
                            this.vertices.length)]
                            * this.vertices[Math.floorMod(
                                    this.three - (i * 2) + 1,
                                    this.vertices.length)];
        }

        triangleArea = this.half * determinant;
        return triangleArea;
    }

    /**
     * constant for 7.
     */
    private final double seven = 7.0;

    /**
     * The main method.
     *
     * @param args
     *            unused
     */
    public static void main(String[] args) {

        TriangleProofOfConcept tri = new TriangleProofOfConcept(2);

        double[] vertice1 = { tri.seven, 1.0 };
        double[] vertice2 = { 1.0, tri.seven };
        double[] vertice3 = { 1.0, 1.0 };

        tri.addVertice(vertice1);
        tri.addVertice(vertice2);
        tri.addVertice(vertice3);

        System.out.print("[");
        for (int i = 0; i < tri.vertices.length; i++) {
            if (i != tri.vertices.length - 1) {
                System.out.print(tri.vertices[i] + ", ");
            } else {
                System.out.println(tri.vertices[i] + "]");
            }
        }

        double area = tri.area();

        System.out.println(area);

    }

}
