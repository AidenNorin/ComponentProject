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
     * Test for for angleDegrees().
     */
    @Test
    public final void angleDegreesTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleDegrees(1, 2);

        assertEquals(30.0, theta, 0.00001);
    }

    /**
     * Test for for angleDegrees().
     */
    @Test
    public final void angleDegreesTest2() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleDegrees(2, 1);

        assertEquals(30.0, theta, 0.00001);
    }

    /**
     * Test for for angleDegrees().
     */
    @Test
    public final void angleDegreesTest3() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleDegrees(1, 3);

        assertEquals(60.0, theta, 0.00001);
    }

    /**
     * Test for for angleDegrees().
     */
    @Test
    public final void angleDegreesTest4() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleDegrees(3, 1);

        assertEquals(60.0, theta, 0.00001);
    }

    /**
     * Test for for angleDegrees().
     */
    @Test
    public final void angleDegreesTest5() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleDegrees(2, 3);

        assertEquals(90.0, theta, 0.00001);
    }

    /**
     * Test for for angleDegrees().
     */
    @Test
    public final void angleDegreesTest6() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleDegrees(3, 2);

        assertEquals(90.0, theta, 0.00001);
    }

    /**
     * Test for for angleRadians().
     */
    @Test
    public final void angleRadiansTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleRadians(1, 2);

        assertEquals(Math.PI / 6.0, theta, 0.00001);
    }

    /**
     * Test for for angleRadians().
     */
    @Test
    public final void angleRadiansTest2() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleRadians(2, 1);

        assertEquals(Math.PI / 6.0, theta, 0.00001);
    }

    /**
     * Test for for angleRadians().
     */
    @Test
    public final void angleRadiansTest3() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleRadians(1, 3);

        assertEquals(Math.PI / 3.0, theta, 0.00001);
    }

    /**
     * Test for for angleRadians().
     */
    @Test
    public final void angleRadiansTest4() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleRadians(3, 1);

        assertEquals(Math.PI / 3.0, theta, 0.00001);
    }

    /**
     * Test for for angleRadians().
     */
    @Test
    public final void angleRadiansTest5() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleRadians(2, 3);

        assertEquals(Math.PI / 2.0, theta, 0.00001);
    }

    /**
     * Test for for angleRadians().
     */
    @Test
    public final void angleRadiansTest6() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        double theta = t.angleRadians(3, 2);

        assertEquals(Math.PI / 2.0, theta, 0.00001);
    }

    /**
     * Test for for isAcute().
     */
    @Test
    public final void isAcuteTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 50.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isAcute();

        assertEquals(true, a);
    }

    /**
     * Test for for isAcute().
     */
    @Test
    public final void isAcuteTest2() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 1.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isAcute();

        assertEquals(false, a);
    }

    /**
     * Test for for isAcute().
     */
    @Test
    public final void isAcuteTest3() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isAcute();

        assertEquals(false, a);
    }

    /**
     * Test for for isAcute().
     */
    @Test
    public final void isAcuteTest4() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 2.0, 0.0 };
        double[] d3 = { 1.0, Math.sqrt(3) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isAcute();

        assertEquals(true, a);
    }

    /**
     * Test for for isObtuse().
     */
    @Test
    public final void isObtuseTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 50.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isObtuse();

        assertEquals(false, a);
    }

    /**
     * Test for for isObtuse().
     */
    @Test
    public final void isObtuseTest2() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 1.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isObtuse();

        assertEquals(true, a);
    }

    /**
     * Test for for isObtuse().
     */
    @Test
    public final void isObtuseTest3() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isObtuse();

        assertEquals(false, a);
    }

    /**
     * Test for for isObtuse().
     */
    @Test
    public final void isObtuseTest4() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 2.0, 0.0 };
        double[] d3 = { 1.0, Math.sqrt(3) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isObtuse();

        assertEquals(false, a);
    }

    /**
     * Test for for isRight().
     */
    @Test
    public final void isRightTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 50.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isRight();

        assertEquals(false, a);
    }

    /**
     * Test for for isRight().
     */
    @Test
    public final void isRightTest2() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 1.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isRight();

        assertEquals(false, a);
    }

    /**
     * Test for for isRight().
     */
    @Test
    public final void isRightTest3() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isRight();

        assertEquals(true, a);
    }

    /**
     * Test for for isRight().
     */
    @Test
    public final void isRightTest4() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 2.0, 0.0 };
        double[] d3 = { 1.0, Math.sqrt(3) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isRight();

        assertEquals(false, a);
    }

    /**
     * Test for for isEquilateral().
     */
    @Test
    public final void isEquilateralTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 50.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isEquilateral();

        assertEquals(false, a);
    }

    /**
     * Test for for isEquilateral().
     */
    @Test
    public final void isEquilateralTest2() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 1.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isEquilateral();

        assertEquals(false, a);
    }

    /**
     * Test for for isEquilateral().
     */
    @Test
    public final void isEquilateralTest3() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isEquilateral();

        assertEquals(false, a);
    }

    /**
     * Test for for isEquilateral().
     */
    @Test
    public final void isEquilateralTest4() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 2.0, 0.0 };
        double[] d3 = { 1.0, Math.sqrt(3) };

        Triangle t = this.constructorTest(d1, d2, d3);

        boolean a = t.isEquilateral();

        assertEquals(true, a);
    }

    /**
     * Test for for triangleType().
     */
    @Test
    public final void triangleTypeTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 50.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        String str = t.triangleType();

        assertEquals("acute", str);
    }

    /**
     * Test for for triangleType().
     */
    @Test
    public final void triangleTypeTest2() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 10.0, 0.0 };
        double[] d3 = { 5.0, 1.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        String str = t.triangleType();

        assertEquals("obtuse", str);
    }

    /**
     * Test for for triangleType().
     */
    @Test
    public final void triangleTypeTest3() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 1.0, 0.0 };
        double[] d3 = { 0.0, Math.sqrt(3.0) };

        Triangle t = this.constructorTest(d1, d2, d3);

        String str = t.triangleType();

        assertEquals("right", str);
    }

    /**
     * Test for for triangleType().
     */
    @Test
    public final void triangleTypeTest4() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 2.0, 0.0 };
        double[] d3 = { 1.0, Math.sqrt(3) };

        Triangle t = this.constructorTest(d1, d2, d3);

        String str = t.triangleType();

        assertEquals("equilateral", str);
    }

    /**
     * Test for for area().
     */
    @Test
    public final void areaTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 0.0, 4.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.area();

        assertEquals(8.0, a, 0.00000001);
    }

    /**
     * Test for for area().
     */
    @Test
    public final void areaTest2() {
        double[] d1 = { 1.0, 2.0 };
        double[] d2 = { 5.0, 1.0 };
        double[] d3 = { 3.0, 6.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.area();

        assertEquals(9.0, a, 0.00000001);
    }

    /**
     * Test for for area().
     */
    @Test
    public final void areaTest3() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, -3.0 };
        double[] d3 = { -1.0, 2.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.area();

        assertEquals(9.0, a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest1() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, 1.0 };
        double[] d3 = { 4.0, -3.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(1, 2);

        assertEquals(5.0, a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest2() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, 1.0 };
        double[] d3 = { 4.0, -3.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(2, 1);

        assertEquals(5.0, a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest3() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, 1.0 };
        double[] d3 = { 4.0, -3.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(1, 3);

        assertEquals(Math.sqrt(50), a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest4() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, 1.0 };
        double[] d3 = { 4.0, -3.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(3, 1);

        assertEquals(Math.sqrt(50), a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest5() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, 1.0 };
        double[] d3 = { 4.0, -3.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(2, 3);

        assertEquals(5.0, a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest6() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, 1.0 };
        double[] d3 = { 4.0, -3.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(3, 2);

        assertEquals(5.0, a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest7() {
        double[] d1 = { -3.0, -2.0, 8.0 };
        double[] d2 = { 1.0, 1.0, 8.0 };
        double[] d3 = { 4.0, -3.0, 8.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(3, 2);

        assertEquals(5.0, a, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void edgeLengthTest8() {
        double[] d1 = { -3.0, -2.0, 8.0, -12.0 };
        double[] d2 = { 1.0, 1.0, 8.0, -12.0 };
        double[] d3 = { 4.0, -3.0, 8.0, -12.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double a = t.edgeLength(3, 2);

        assertEquals(5.0, a, 0.00000001);
    }

    /**
     * Test for for perimeter().
     */
    @Test
    public final void perimeterTest1() {
        double[] d1 = { 0.0, 0.0 };
        double[] d2 = { 4.0, 0.0 };
        double[] d3 = { 0.0, 4.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double p = t.perimeter();

        assertEquals(8.0 + (4 * Math.sqrt(2)), p, 0.00000001);
    }

    /**
     * Test for for perimeter().
     */
    @Test
    public final void perimeterTest2() {
        double[] d1 = { -3.0, -2.0 };
        double[] d2 = { 1.0, 1.0 };
        double[] d3 = { 4.0, -3.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double p = t.perimeter();

        assertEquals(10.0 + Math.sqrt(50), p, 0.00000001);
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void twoDimensionRepresentationTest1() {
        double[] d1 = { -3.0, -2.0, 8.0, -12.0 };
        double[] d2 = { 1.0, 1.0, 8.0, -12.0 };
        double[] d3 = { 4.0, -3.0, 8.0, -12.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double[] a = t.twoDimensionRepresentation();
        double[] rep = { 0.0, 0.0, 5.0, 0.0, 5.0, 5.0 };

        for (int i = 0; i < a.length; i++) {
            assertEquals(rep[i], a[i], 0.00000001);
        }
    }

    /**
     * Test for for edgeLength().
     */
    @Test
    public final void twoDimensionRepresentationTest2() {
        double[] d1 = { -3.0, -2.0, 42.0, -12.0 };
        double[] d2 = { 1.0, 1.0, 8.0, -2.0 };
        double[] d3 = { 4.0, -3.0, -4.0, 2.0 };

        Triangle t = this.constructorTest(d1, d2, d3);

        double[] a = t.twoDimensionRepresentation();
        double[] rep = { 0.0, 0.0, Math.sqrt(1281), 0.0, 48.30815247583388,
                5.321879778009392 };

        for (int i = 0; i < a.length; i++) {
            assertEquals(rep[i], a[i], 0.00000001);
        }
    }

}
