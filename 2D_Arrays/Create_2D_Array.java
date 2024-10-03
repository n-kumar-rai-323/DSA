import java.util.*;
public class Create_2D_Array{
    public static void main(String[] args) {
        int matrix [][]= new int [2][3];
        int row = matrix.length, col = matrix[0].length;
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<row; i++){
            for(int j=0;j<col;j++ ){
                matrix[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i=0;i<row;i++){
            for(int j=0;j<col; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}