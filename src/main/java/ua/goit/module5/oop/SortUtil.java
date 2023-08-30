package ua.goit.module5.oop;

public class SortUtil {

    public int[] sortIntArray(int[] inputData) {
        for (int i = 0; i < inputData.length - 1; i++) {
            for (int j = 0; j < inputData.length - 1; j++) {
                if (inputData[j] > inputData[j + 1]) {
                    int temp = inputData[j];
                    inputData[j] = inputData[j + 1];
                    inputData[j + 1] = temp;
                }
            }
        }

        return inputData;
    }
}
