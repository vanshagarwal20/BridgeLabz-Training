package method;

public class MatrixOperations {

	public static int[][] generateMatrix(int r, int c){
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){            	
                mat[i][j] = (int)(Math.random() * 10);                
            }
        }
        return mat;
    }

    public static int[][] add(int[][] a, int[][] b){
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++){         	
        	for (int j = 0; j < a[0].length; j++){        
                r[i][j] = a[i][j] + b[i][j];
        	}
        }
        return r;
    }

    public static void main(String[] args){
        int[][] A = generateMatrix(3,3);
        int[][] B = generateMatrix(3,3);
        int[][] C = add(A,B);
        System.out.println("Addition Result:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

}
