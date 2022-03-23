
public class BubbleLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers1 = {5, 7, 13, 20, 25};
		int[] numbers2 = {8, 9, 10, 21, 28};
		BubbleSortOptimized(numbers1, numbers2);
		
	}
	
	private static void BubbleSortOptimized (int[] numbers1, int[] numbers2) {

		int[] mergedArrays = new int[numbers1.length + numbers2.length];
		
		for (int i = 0; i < mergedArrays.length / 2; i++) {
			
			mergedArrays[i] = numbers1[i];
		}
		for (int i = mergedArrays.length; i >= mergedArrays.length/2; i--) {
			mergedArrays[i] = numbers2[i];
		}
		//debut
		for (int i = 0; i < mergedArrays.length; i ++)
			System.out.println(mergedArrays[i]);
		//debug
		
		
		//Will make it easier to deal with numbers at end of array
		//due to each outer loop pass pushing the highest value in the comparison
		//group to the end of the array
		for (int i = numbers1.length - 1; i > 0; i--) {
			
			for (int j = 0; j < numbers2.length; j++) {
				
			}
		}
	}

}
