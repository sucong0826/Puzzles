package puzzle_practice.choose;

import java.util.Arrays;

/**
 * 检测一个点是否在一个三角形内;
 * 我认为在三角形内的一个点，到三个顶点的距离一定小于最大边。
 * <p>
 * Created by SuCong on 2015/09/21.
 */

public class PointInTriangle {
    private final int[] pointO = {0, 0};
    private int[] pointX;
    private int[] pointY;
    private int[] pointZ;

    private double lengthX;
    private double lengthY;
    private double lengthZ;

    public PointInTriangle(int[] pointX, int[] pointY, int[] pointZ) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
    }

    /**
     * Can these X and Y build a triangle;
     *
     * @return if true can build, false cannot;
     */
    private boolean isXYBuildTriangle() {
        if (pointX == null || pointY == null)
            throw new IllegalArgumentException();

        double xLength = Math.pow(pointX[0] * pointX[0] + pointX[1] * pointX[1], 0.5);
        double yLength = Math.pow(pointY[0] * pointY[0] + pointY[1] * pointY[1], 0.5);
        double zLength = Math.pow((pointX[0] - pointY[0]) * (pointX[0] - pointY[0]) +
                ((pointX[1] - pointY[1]) * (pointX[1] - pointY[1])), 0.5);

        if (xLength + yLength > zLength
                || xLength + zLength > yLength
                || yLength + zLength > xLength) {
            this.lengthX = xLength;
            this.lengthY = yLength;
            this.lengthZ = zLength;
            return true;
        } else
            return false;
    }

    /**
     * Judge is input point in triangle;
     *
     * @param point input point
     * @return is this point in triangle
     */
    public boolean isPointInTriangle(int[] point) {
        if (isXYBuildTriangle()) {
            double p2X = Math.pow((point[0] - pointX[0]) * (point[0] - pointX[0]) +
                    ((point[1] - pointX[1]) * (point[1] - pointX[1])), 0.5);
            double p2Y = Math.pow((point[0] - pointY[0]) * (point[0] - pointY[0]) +
                    ((point[1] - pointY[1]) * (point[1] - pointY[1])), 0.5);
            double p2Z = Math.pow((point[0] - pointZ[0]) * (point[0] - pointZ[0]) +
                    ((point[1] - pointZ[1]) * (point[1] - pointZ[1])), 0.5);

            double maxLength = findBiggest(new double[]{this.lengthX, this.lengthY, this.lengthZ});
            if (p2X < maxLength && p2Y < maxLength && p2Z < maxLength)
                return true;
            else
                return false;
        } else
            return false;
    }

    private double findBiggest(double[] target) {
        Arrays.sort(target);
        return target[target.length - 1];
    }
}
