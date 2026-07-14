/**
 * Customized JUnit test fixture for {@code TriangleTest}.
 */
public final class Triangle1Test extends TriangleTest {

    @Override
    protected Triangle constructorTest() {
        return new Triangle1();
    }

    @Override
    protected Triangle constructorTest(int dim) {
        return new Triangle1(dim);
    }

    @Override
    protected Triangle constructorTest(double[] v1, double[] v2, double[] v3) {
        return new Triangle1(v1, v2, v3);
    }

    @Override
    protected Triangle constructorTest(double[] v1, double[] v2) {
        return new Triangle1(v1, v2);
    }

    @Override
    protected Triangle constructorTest(double[] v1) {
        return new Triangle1(v1);
    }
}
