package ua.goit.module5;

public class ProceduralStyle {
    public static void main(String[] args) {
        int[] inputData = new int[] {-2, 20, 43, -30, 0, -1, 100, 153, 43, -5 , 44, -52};
        int element = sortAndFindElement(inputData, 100);
        System.out.println("Element = " + element);
    }

    private static int sortAndFindElement(int[] inputData, int elementToSearch) {
        for (int i = 0; i < inputData.length - 1; i++) {
            for (int j = 0; j < inputData.length - 1; j++) {
                if (inputData[j] > inputData[j + 1]) {
                    int temp = inputData[j];
                    inputData[j] = inputData[j + 1];
                    inputData[j + 1] = temp;
                }
            }
        }

        int lowIndex = 0;
        int highIndex = inputData.length - 1;
        
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = inputData[midIndex];
            if (midElement < elementToSearch) {
                lowIndex = midIndex + 1;
            } else if (midElement > elementToSearch) {
                highIndex = midIndex - 1;
            } else {
                return  midElement;
            }
        }
        
        return -1;
    }
}
