import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
    protected abstract Triangle constructorTest();

    /**
     * Creates a new {@code Triangle} with no points in a set number of
     * dimensions.
     *
     * @param dim
     *            The number of dimensions to the {@code Triangle} was put in
     *
     * @return A new {@code Triangle} with no points in {@code dim} dimensions.
     */
    protected abstract Triangle constructorTest(int dim);

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
    protected abstract Triangle constructorTest(double[] v1, double[] v2,
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
    protected abstract Triangle constructorTest(double[] v1, double[] v2);

    /**
     * Creates a new {@code Triangle} With 1 point in the given dimensions.
     *
     * @param v1
     *            The first point
     *
     * @return A new {@code Triangle} with point {@code v1}.
     */
    protected abstract Triangle constructorTest(double[] v1);

    /**
     * Simultaneus testing for constructor, addVertice(), and getVertice().
     */
    @Test
    public final void addVerticeTest() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };

        Triangle t1 = this.constructorTest(d1);
        Triangle t2 = this.constructorTest(d1, d2);

        t1.addVertice(d2);

        assertEquals(t2, t1);
    }

    /**
     * Test for for removeAny().
     */
    @Test
    public final void removeAnyTest1() {
        double[] d1 = { 0.0, 3.0 };

        Triangle t1 = this.constructorTest(d1);
        Triangle t2 = this.constructorTest();

        t1.removeAnyVertice();

        assertEquals(t2, t1);
    }

    /**
     * Test for for removeAny().
     */
    @Test
    public final void removeAnyTest2() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };

        Triangle t1 = this.constructorTest(d1, d2);
        Triangle t2 = this.constructorTest(d1);

        t1.removeAnyVertice();

        assertEquals(t2, t1);
    }

    /**
     * Test for for removeAny().
     */
    @Test
    public final void removeAnyTest3() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t1 = this.constructorTest(d1, d2, d3);
        Triangle t2 = this.constructorTest(d1, d2);

        t1.removeAnyVertice();

        assertEquals(t2, t1);
    }

    /**
     * Test for for remove().
     */
    @Test
    public final void removeTest1() {
        double[] d1 = { 0.0, 3.0 };

        Triangle t1 = this.constructorTest(d1);
        Triangle t2 = this.constructorTest();

        t1.removeVertice(1);

        assertEquals(t2, t1);
    }

    /**
     * Test for for remove().
     */
    @Test
    public final void removeTest2() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };

        Triangle t1 = this.constructorTest(d1, d2);
        Triangle t2 = this.constructorTest(d1);

        t1.removeVertice(2);

        assertEquals(t2, t1);
    }

    /**
     * Test for for remove().
     */
    @Test
    public final void removeTest3() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };

        Triangle t1 = this.constructorTest(d1, d2);
        Triangle t2 = this.constructorTest(d2);

        t1.removeVertice(1);

        assertEquals(t2, t1);
    }

    /**
     * Test for for remove().
     */
    @Test
    public final void removeTest4() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t1 = this.constructorTest(d1, d2, d3);
        Triangle t2 = this.constructorTest(d1, d2);

        t1.removeVertice(3);

        assertEquals(t2, t1);
    }

    /**
     * Test for for remove().
     */
    @Test
    public final void removeTest5() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t1 = this.constructorTest(d1, d2, d3);
        Triangle t2 = this.constructorTest(d1, d3);

        t1.removeVertice(2);

        assertEquals(t2, t1);
    }

    /**
     * Test for for remove().
     */
    @Test
    public final void removeTest7() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t1 = this.constructorTest(d1, d2, d3);
        Triangle t2 = this.constructorTest(d3, d2);

        t1.removeVertice(1);

        assertEquals(t2, t1);
    }

    /**
     * Test for for numVertices().
     */
    @Test
    public final void numVerticesTest1() {
        Triangle t = this.constructorTest();

        int i = t.numVertices();

        assertEquals(0, i);
    }

    /**
     * Test for for numVertices().
     */
    @Test
    public final void numVerticesTest2() {
        double[] d1 = { 0.0, 3.0 };

        Triangle t = this.constructorTest(d1);

        int i = t.numVertices();

        assertEquals(1, i);
    }

    /**
     * Test for for numVertices().
     */
    @Test
    public final void numVerticesTest3() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };

        Triangle t = this.constructorTest(d1, d2);

        int i = t.numVertices();

        assertEquals(2, i);
    }

    /**
     * Test for for numVertices().
     */
    @Test
    public final void numVerticesTest4() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        int i = t.numVertices();

        assertEquals(3, i);
    }

    /**
     * Test for for getVertice().
     */
    @Test
    public final void getVerticeTest1() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double[] v = t.getVertice(1);

        for (int i = 0; i < d1.length; i++) {
            assertEquals(d1[i], v[i], 0.00001);
        }

    }

    /**
     * Test for for getVertice().
     */
    @Test
    public final void getVerticeTest2() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double[] v = t.getVertice(2);

        for (int i = 0; i < d2.length; i++) {
            assertEquals(d2[i], v[i], 0.00001);
        }

    }

    /**
     * Test for for getVertice().
     */
    @Test
    public final void getVerticeTest3() {
        double[] d1 = { 0.0, 3.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 5.0, 6.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double[] v = t.getVertice(3);

        for (int i = 0; i < d3.length; i++) {
            assertEquals(d3[i], v[i], 0.00001);
        }

    }

    /**
     * KERNEL:
     *
     * addVertice DONE
     *
     * removeAny DONE
     *
     * remove DONE
     *
     * numVertices DONE
     *
     * getVertice
     *
     *
     *
     * ENHANCED:
     *
     * angleDegrees
     *
     * angleRadians
     *
     * isAcute
     *
     * isObtuse
     *
     * isRight
     *
     * isEquilateral
     *
     * triangleType
     *
     * area
     *
     * edgeLength
     *
     * perimeter
     *
     * twoDimensionalRepresentation
     */

}
