package ua.goit.module5.oop;

public class SearchUtil {
    public int findToElement(int[] inputData, int elementToSearch) {
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
