/**
 * Customized JUnit test fixture for {@code TriangleTest}.
 */
public final class Triangle1Test extends TriangleTest {

    @Override
    protected Triangle1 constructorTest() {
        return new Triangle1();
    }

    @Override
    protected Triangle1 constructorTest(int dim) {
        return new Triangle1(dim);
    }

    @Override
    protected Triangle1 constructorTest(double[] v1, double[] v2, double[] v3) {
        return new Triangle1(v1, v2, v3);
    }

    @Override
    protected Triangle1 constructorTest(double[] v1, double[] v2) {
        return new Triangle1(v1, v2);
    }

    @Override
    protected Triangle1 constructorTest(double[] v1) {
        return new Triangle1(v1);
    }
}
