package labreq;

public class IdentityMatrix extends Matrix {

	
	
	/*constructor that call super -> parent to set n , m  */
	IdentityMatrix(int m) {
		super(m, m);
		// TODO Auto-generated constructor stub
	}
	
	/*set identity but with extra checks*/
	boolean SetNumbers(int [] arr) {
		/*storage*/
		int[][] matx = this.matrix;
		int m = this.M;
		
		
		/*if the length is small than n*m so we can't fill all matrix*/
		if(arr.length < m * m || arr.length > m * m)  {
			return false;
		}
		
		else
		{
			/*check the identity*/
			for(int i=0;i<arr.length;i+=m + 1) {
				if(arr[i] != 1) {
					return false;
				}
					
				else 
				{
					for(int j=i+1;j<i+m+1 && j < arr.length;j++) {
						if(arr[j] != 0 ) return false;
					}
				}
			
			}
		

			int k = 0;
			/*fill the matrix till the end of column then increase rows and reset the column*/
			for(int i=0;i<m;i++) {
					for(int column = 0; column < m ; column++) {
						matx[i][column] = arr[k];
						k++;
					}
			}
			return true;
			
		}
	}
	
	
	/*the transpose of the identity matrix is the original matrix itself*/
	void Transpose()
	{
		super.matrix = super.matrix;
	}


	/*add identity matrix only*/
	@Override
	public Object Add(Object x) {
		
		/*storage*/
		int[][] matx = this.matrix;
		int n =  this.N;
		int m = this.M;
		Matrix obj2 = (Matrix)x; 
		
		/*if it ins't matrix or the dimensions aren't equal*/
		if(obj2.M != obj2.N && m != obj2.M)  {
			return null;
		}
		else
		{
			/*check the identity*/
			for(int i=0;i<m;i+= 1) {
					for(int j=0;j<m;j++) {
						if(i == j ) {
							if(obj2.matrix[i][j] == 1) continue;
							else return null;
						}
						else if(obj2.matrix[i][j] != 0) return null;
					}
				}
			
			/*add the elements*/
			for(int i =0; i < m; ++i) {
				for(int j =0; j <n; ++j) {
					matx[i][j] += obj2.matrix[i][j]; 
				}
			}
			return this;
		}
			
	}
			

	
}


