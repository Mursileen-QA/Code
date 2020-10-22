package coreJavaTraining;

public class MultiDimensional {

	public static void main(String[] args) {

		String Arr[][] = { { "Mursileen", "Sanat Nagar", "QA" },
				           { "Sami", "Lal bazar", "DEV OPS" },
				           { "Nazim", "Banglore", "Programmer" }
				         };

		for (int row = 0; row < 3; row++) {
			System.out.println("");
			System.out.println(row + 1 +"RECORD");
			
			for (int col = 0; col < 3; col++) {

				System.out.println(Arr[row][col]);

			}

			System.out.println("");

		}

	}

}
