class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int row = 0, column = 0, direction = 0, count = 1;
        while (count <= rows * columns) {
            matrix[row][column] = count;
            count++;
            switch (direction) {
                case 0:
                    if (column + 1 < columns && matrix[row][column + 1] == 0) column++;
                    else {
                        direction = 1;
                        row++;
                    }
                    break;
                case 1:
                    if (row + 1 < rows && matrix[row + 1][column] == 0) row++;
                    else {
                        direction = 2;
                        column--;
                    }
                    break;
                case 2:
                    if (column - 1 >= 0 && matrix[row][column - 1] == 0) column--;
                    else {
                        direction = 3;
                        row--;
                    }
                    break;
                case 3:
                    if (row - 1 >= 0 && matrix[row - 1][column] == 0) row--;
                    else {
                        direction = 0;
                        column++;
                    }
                    break;
            }
        }
        return matrix;
    }
}
