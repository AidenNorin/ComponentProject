/**
 * JUnit test fixture for {@code Triangle1}'s constructor and kernel methods.
 *
 * @author Aiden Norin
 *
 */
public abstract class TriangleTest {

    /**
     * Creates a new {@code Triangle} with no points in 2 dimensions.
     *
     * @return A new {@code Triangle} with no points in 2 dimensions.
     */
    protected abstract Triangle1 constructorTest();

    /**
     * Creates a new {@code Triangle} with no points in a set number of
     * dimensions.
     *
     * @param dim
     *            The number of dimensions to the {@code Triangle} was put in
     *
     * @return A new {@code Triangle} with no points in {@code dim} dimensions.
     */
    protected abstract Triangle1 constructorTest(int dim);

    /**
     * Creates a new {@code Triangle} With 3 points in the given dimensions.
     *
     * @param v1
     *            The first point
     *
     * @param v2
     *            The second point
     *
     * @param v3
     *            The third point
     *
     * @return A new {@code Triangle} with points {@code v1}, {@code v2}, and
     *         {@code v3}.
     */
    protected abstract Triangle1 constructorTest(double[] v1, double[] v2,
            double[] v3);

    /**
     * Creates a new {@code Triangle} With 2 points in the given dimensions.
     *
     * @param v1
     *            The first point
     *
     * @param v2
     *            The second point
     *
     * @return A new {@code Triangle} with points {@code v1}, and {@code v2}.
     */
    protected abstract Triangle1 constructorTest(double[] v1, double[] v2);

    /**
     * Creates a new {@code Triangle} With 1 point in the given dimensions.
     *
     * @param v1
     *            The first point
     *
     * @return A new {@code Triangle} with point {@code v1}.
     */
    protected abstract Triangle1 constructorTest(double[] v1);

    /**
     *
     * Creates and returns a {@code Triangle} of the implementation under test
     * type with the given entries and mode.
     *
     * @param args
     *            the entries for the {@code Triangle}
     * @return the constructed {@code Triangle}
     *
     */
    private Triangle createFromArgsTest(double[]... args) {

        Triangle t = (Triangle) this.constructorTest(args[0].length);
        for (int i = 0; i < args.length; i++) {
            t.addVertice(args[i]);
        }

        return t;
    }

}
