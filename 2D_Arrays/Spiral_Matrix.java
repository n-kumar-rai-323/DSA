public class Spiral_Matrix {
    public static void printSprital(int matrix[][]){
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endcol) {
            //top
            for(int j=startCol; j<=endcol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endcol]+ " ");
            }
            //bottom
            for(int j =endcol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endcol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");

            }

            startCol++;
            startRow++;
            endcol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int  matrix [][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        printSprital(matrix);
    }
}
