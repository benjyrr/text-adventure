 public class TestMultiDimensionalArray{
 	
 	//main method, start of program
 	public static void main(String[] args){

 		//variables for random numbers
 		int rand = (int)(Math.random() * 100);
 		int rand2 = (int)(Math.random() * 100);
 		int rand3 = (int)(Math.random() * 100);
 		int rand4 = (int)(Math.random() * 100);
 		int rand5 = (int)(Math.random() * 100);
 		int rand6 = (int)(Math.random() * 100);
 		int rand7 = (int)(Math.random() * 100);
 		int rand8 = (int)(Math.random() * 100);
 		int rand9 = (int)(Math.random() * 100);
 		int rand10 = (int)(Math.random() * 100);
 		int rand11 = (int)(Math.random() * 100);
 		int rand12 = (int)(Math.random() * 100);
 		int rand13 = (int)(Math.random() * 100);
 		int rand14 = (int)(Math.random() * 100);
 		int rand15 = (int)(Math.random() * 100);
 		int rand16 = (int)(Math.random() * 100);
 		int rand17 = (int)(Math.random() * 100);
 		int rand18 = (int)(Math.random() * 100);
		int rand19 = (int)(Math.random() * 100);
		int rand20 = (int)(Math.random() * 100);
		int rand21 = (int)(Math.random() * 100);
		int rand22 = (int)(Math.random() * 100);
		int rand23 = (int)(Math.random() * 100);
		int rand24 = (int)(Math.random() * 100);
 		int rand25 = (int)(Math.random() * 100);

		//instantiating array
 		int[][] arr = new int[5][5];

 		//assigning random values
 		arr[0][0] = rand;
 		arr[1][1] = rand2;
 		arr[2][2] = rand3;
 		arr[3][3] = rand4;
 		arr[4][4] = rand5;
 		arr[0][1] = rand6;
 		arr[0][2] = rand7;
 		arr[0][3] = rand8;
 		arr[0][4] = rand9;
 		arr[1][0] = rand10;
 		arr[1][2] = rand11;
 		arr[1][3] = rand12;
 		arr[1][4] = rand13;
 		arr[2][0] = rand14;
 		arr[2][1] = rand15;
 		arr[2][3] = rand16;
 		arr[2][4] = rand17;
 		arr[3][0] = rand18;
 		arr[3][1] = rand19;
 		arr[3][2] = rand20;
 		arr[3][4] = rand21;
 		arr[4][0] = rand22;
 		arr[4][1] = rand23;
 		arr[4][2] = rand24;
 		arr[4][3] = rand25;

 		//prints array
 		System.out.print(arr[0][0] + ", ");
 		System.out.print(arr[0][1] + ", ");
 		System.out.print(arr[0][2] + ", ");
 		System.out.print(arr[0][3] + ", ");
 		System.out.println(arr[0][4] + ", ");
 		System.out.print(arr[1][0] + ", ");
 		System.out.print(arr[1][1] + ", ");
 		System.out.print(arr[1][2] + ", ");
 		System.out.print(arr[1][3] + ", ");
 		System.out.println(arr[1][4] + ", ");
 		System.out.print(arr[2][0] + ", ");
 		System.out.print(arr[2][1] + ", ");
 		System.out.print(arr[2][2] + ", ");
 		System.out.print(arr[2][3] + ", ");
 		System.out.println(arr[2][4] + ", ");
 		System.out.print(arr[3][0] + ", ");
 		System.out.print(arr[3][1] + ", ");
 		System.out.print(arr[3][2] + ", ");
 		System.out.print(arr[3][3] + ", ");
 		System.out.println(arr[3][4] + ", ");
 		System.out.print(arr[4][0] + ", ");
 		System.out.print(arr[4][1] + ", ");
 		System.out.print(arr[4][2] + ", ");
 		System.out.print(arr[4][3] + ", ");
 		System.out.println(arr[4][4] + ", ");
 	}
}