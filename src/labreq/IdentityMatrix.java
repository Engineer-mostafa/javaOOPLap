package labreq;

public class IdentityMatrix extends Matrix {

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
		/*r will proceed with matrix row till the end of the column*/
		/*c will be the matrix column*/
		else
		{
			/*check the identity*/
			for(int i=0;i<arr.length;i+=m + 1) {
				if(arr[i] != 1) {
					return false;
				}
				else {
					for(int j=i+1;j<i+m+1 && j < arr.length;j++) {
						if(arr[j] != 0 ) return false;
					}
				}
			
			}
			int r = 0;
			/*fill the matrix till the end of column then increase rows and reset the column*/
			for(int i=0;i<arr.length;i++) {
					for(int column = 0; column < m ; column++) {
						matx[r][column] = arr[i];
						i++;
					}
					i--;
					r++;
			}
			return true;
			
		}
	}
	
	
	/*the transpose of
the identity matrix is the original matrix itself*/
	void Transpose()
	{
		super.matrix = super.matrix;
	}
}
