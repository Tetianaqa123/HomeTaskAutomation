 /* public class Vector {
    private int x, y, z;
    public Vector(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double length() {
        return Math.sqrt(sum);
    }
}

 class Vector {
    private static double vector(int x, int y, int z) {
        int sum = x * x + y * y + z * z;
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        System.out.print(vector(x, y, z));
    }

    public class Main {
        public static double AngleBetweenVectors(double x1, double y1, double z1, double x2, double y2, double z2) {
            // dot product calculation
            double dotproduct = vectorDotProduct(x1, y1, z1, x2, y2, z2);
            // absolute values of vectors
            double absoluteFirst = vectorAbsoluteValue(x1, y1, z1);
            double absoluteSecond = vectorAbsoluteValue(x2, y2, z2);
            double angleResult = Math.acos(dotproduct / (absoluteFirst * absoluteSecond));
            return angleResult;
        }

        public static double vectorDotProduct(double x1, double y1, double z1, double x2, double y2, double z2) {
            double dorProduct = x1 * x2 + y1 * y2 + z1 * z2;

            return dorProduct;
        }

        public static double vectorAbsoluteValue(double x, double y, double z) {
            double absoluteValue = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

            return absoluteValue;
        }
    }
}
*/
