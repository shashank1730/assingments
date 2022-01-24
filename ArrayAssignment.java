
public class ArrayAssignment {

	public static void main(String[] args) {
		int[] pixel1 = {255, 0, 0}; // red :)
		int[] pixel2 = {123, 76, 44};
		int[] pixel3 = {32, 120, 0};
		int[] pixel4 = {123, 12, 120};
		int[] pixel5 = {189, 18, 0};
		int[] pixel6 = {187, 56, 130};
		int[] pixel7 = {140, 76, 120};
		int[] pixel8 = {90, 123, 90};
		int[] pixel9 = {200, 145, 105};
		int[][][] arr = {{pixel1,pixel2,pixel3},
						{pixel4,pixel5,pixel6},
						{pixel7,pixel8,pixel9}};
		
		
      /*	
		for(int k=0;k<3;k++) {
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
					System.out.print(arr[k][i][j]);
					System.out.print(",");
			}
			System.out.print("   ");
		}
		System.out.println();
	}
	
	
	
	
		System.out.println();
		System.out.println();
		*/
		for(int i=0;i<3;i++) {
			for(int j=2;j>=0;j--) {
				for(int k =0;k<3;k++) {
					 System.out.print(arr[j][i][k]); 
					 System.out.print(",");	 
				}
				System.out.print("   ");
			}
			System.out.println();
		}	
		
		System.out.println("\nGRAY SCALING===================");
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=2;j>=0;j--) {
				for(int k =0;k<3;k++) {
					 //System.out.print(arr[j][i][k]); 
					 //System.out.print(",");
					sum=sum+arr[j][i][k];
					
				}
				//System.out.println(sum);
				
				
				for(int l=0;l<3;l++)
				{
					System.out.print(arr[j][i][l]=sum/3);
					System.out.print(",");	
				}
				sum=0;
				//
				System.out.print("   ");
			}
			System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
