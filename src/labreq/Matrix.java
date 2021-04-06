/**
 * 
 */
package labreq;

/**
 * @author user
 *
 */
public class Matrix implements Addable {
	/*attributes*/
	int [][] matrix;	/* A 2D array that carries the numbers of the*/
	int M;				/*  number of rows of the matrix*/
	int N;				/*number of columns of the matrix*/
	
	/*constructor of Matrix*/
	Matrix (int m, int n) {
		
		/*initialization*/
		this.M = m;
		this.N = n;
		matrix = new int[m][n];

	}
	
	/*fill the matrix*/
	boolean SetNumbers(int[] arr) {
		
		/*storage*/
		int[][] matx = this.matrix;
		int n =  this.N;
		int m = this.M;
		
		
		/*if the length is small than n*m so we can't fill all matrix*/
		if(arr.length < m * n || arr.length > m * n)  {
			return false;
		}
		/*r will proceed with matrix row till the end of the column*/
		/*c will be the matrix column*/
		else
		{
			int r = 0;
			/*fill the matrix till the end of column then increase rows and reset the column*/
			for(int i=0;i<arr.length;i++) {
					for(int column = 0; column < n ; column++) {
						matx[r][column] = arr[i];
						i++;
					}
					i--;
					r++;
			}
			return true;
			
		}
		
	}
	
	/*print rows line by line separated by space*/
	void Print() {
		/*storage*/
		int[][] matx = this.matrix;
		int n =  this.N;
		int m = this.M;
		
		/*print the matrix*/
		for(int i =0; i < m; ++i) {
			for(int j =0; j < n; ++j) {
				System.out.print(matx[i][j] + " "); 
			}
			System.out.print("\n");
		}
		System.out.print("\n");

	}

	/*just replace column by rows or vice versa*/
	void Transpose(){
		
		/*storage*/
		int[][] matx = this.matrix;
		int n =  this.N;
		int m = this.M;
		int[][] newMatx = new int[n][m];
		/*transpose the array*/
		 for(int i =0; i < m; ++i) {
				for(int j =0; j < n; ++j) {
					newMatx[j][i] = matx[i][j];
				}
				
			}
		 
		 /*convert all things from row*column to column*row*/
		 this.matrix = newMatx;
		 this.M = n;
		 this.N = m;
	}
	
	
	
	/*Override Method*/
	@Override
	public Object Add(Object x) {
		
		/*storage*/
		Matrix obj = (Matrix)x;
		if(this.M == obj.M && this.N == obj.N) {
			int[][] matx = this.matrix;
			int n =  this.N;
			int m = this.M;
			
			/*add the elements*/
			for(int i =0; i < m; ++i) {
				for(int j =0; j <n; ++j) {
					matx[i][j] += obj.matrix[i][j]; 
				}
			}
			return this;
		}
		else return null;

		
	}

}
