package geekorama;

// Java program to rotate a matrix by 90 degrees
class RotateMatrix {
    static void rotateMatrix(int N, int mat[][]) {
        for (int x = 0; x < N / 2; x++)  {
            for (int y = x; y < N-x-1; y++) {
                // store current cell in temp variable
                int temp = mat[x][y];
                // move values from right to top
                mat[x][y] = mat[y][N-1-x];
                // move values from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];
                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];
                // assign temp to left
                mat[N-1-y][x] = temp;
            }
        }
    }

    static void displayMatrix(int N, int mat[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);
                System.out.print("\n");
            }
        System.out.print("\n");
    }

    /* Driver program to test above functions */
    public static void main (String[] args) {
        int N = 4;
        int mat[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };


        // Tese Case 2
		/* int mat[][] = {
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						};
		*/

        // Tese Case 3
		/*int mat[][] = {
						{1, 2},
						{4, 5}
					};*/

        // displayMatrix(mat);

        rotateMatrix(N,mat);

        // Print rotated matrix
        displayMatrix(N,mat);
    }
}

// This code is contributed by Prakriti Gupta
