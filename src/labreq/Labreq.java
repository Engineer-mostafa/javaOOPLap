package labreq;

public class Labreq {

	public static void main(String[] args) {
		
		
		
/*   ---------------------------------------- unit test of matrix SetNumber & Transpose -------------------------------------- */
		Matrix obj1 = new Matrix(2,3);
		Matrix obj2 = new Matrix(2,3);

		int []arr1 = {1,2,3,4,5,6,7};
		int []arr2 = {1,2,3,4,5};
		int []arr3 = {1,2,3,4,5,6};
		int []arr4 = {1,2,3,4,5,6};

		System.out.println("if we have array of length < 2*3 || length > 2*3 then the function SetNumber Should return false "
				+ " true other wise");
		System.out.println("-----------------------------------------------------------------------------------------------------------------\n");

		if(obj1.SetNumbers(arr1)) {
			
			obj1.Print();
		}
		else
		{
			System.out.println("row * column = 6\narr = {1,2,3,4,5,6,7}\nlength = 7\nlength > row * column\nfalse");
			System.out.println("###################################\n");

		}
		if(obj1.SetNumbers(arr2)) {
			
			obj1.Print();
		}
		else
		{
			System.out.println("row * column = 6\narr = {1,2,3,4,5}\nlength = 5\nlength < row * column\nfalse");
			System.out.println("###################################\n");

		}
		if(obj1.SetNumbers(arr3)) {
			System.out.println("row * column = 6\narr = {1,2,3,4,5,6}\nlength = 6\nlength = row * column\ntrue\nOriginal Matrix:");
			obj1.Print();
			obj2.SetNumbers(arr4);
			System.out.println("Now i make new arr same as our original array and i will add them");
			if(obj1.Add(obj2) != null) {
				System.out.println("Matrix1 + Matrix2:");
				obj1.Print();
			}else {
				System.out.println("Sorry but this not allowed because the dimentions are different");

			}
			
			
			System.out.println("Let me Transpose The result\nTransposed Matrix:");
			obj1.Transpose();
			obj1.Print();
			System.out.println("Let's try to add them again after transposing");
			if(obj1.Add(obj2) != null) {
				System.out.println("Matrix1 + Matrix2:");
				
				obj1.Print();
			}else {
				System.out.println("-> Sorry but this not allowed because the dimentions are different");

			}
			System.out.println("###################################\n");

		}
		else
		{
			System.out.println("row * column = 6\narr = {1,2,3,4,5,6,7}\nlength = 7\nlength > row * column\nfalse");
			System.out.println("###################################\n");

		}
		
/*--------------------------------------------------------------------------------------------------------------------------*/
		
/*   ---------------------------------------- unit test of Identity matrix  ----------------------------------------------- */
		
		System.out.println("When we check the IdentityMatrix in SetNumber we Have same conditions in normal one in addition to unity");

		int []arr5 = {1,0,0,0,1,0,0,0,1};
		int []arr6 = {1,0,0,0,1,0,1,0,1};
		IdentityMatrix obj3 = new IdentityMatrix(3);
		IdentityMatrix obj4 = new IdentityMatrix(3);

		if(obj3.SetNumbers(arr5)) {
			System.out.println("this is 3*3 matrix with arr {1,0,0,0,1,0,0,0,1}");
			obj3.Print();
			obj3.Transpose();
			obj3.Print();
		}
		if(obj4.SetNumbers(arr6)) {
			System.out.println("this is 3*3 matrix with arr {1,0,0,0,1,0,1,0,1}");
			obj4.Print();
			obj4.Transpose();
			obj4.Print();
		}
		else {
			System.out.println("this is 3*3 matrix with arr {1,0,0,0,1,0,1,0,1} so this isn't identity");
			System.out.println("->Sorry but this matrix ins't identity check it again");

		}
		


		
	}

}
