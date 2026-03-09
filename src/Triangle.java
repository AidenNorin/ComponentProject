/**
 * Triangles (woah).
 */
public interface Triangle extends TriangleKernel {

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

}
