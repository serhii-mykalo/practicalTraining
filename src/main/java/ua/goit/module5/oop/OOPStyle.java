package ua.goit.module5.oop;

public class OOPStyle {
    public static void main(String[] args) {
        int[] inputData = new int[] {-2, 20, 43, -30, 0, -1, 100, 153, 43, -5 , 44, -52};
        SortUtil sort = new SortUtil();
        SearchUtil search = new SearchUtil();

        int[] sortedToArray = sort.sortIntArray(inputData);
        int result = search.findToElement(sortedToArray, 0);
        System.out.println("Result = " + result);
    }
}
