import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binarySearch {

    List<String> food = new ArrayList<>();

    public boolean binSearch(int[] intArr, int intToFind) {
        int start = 0;
        int end = intArr.length -1;

        while (start <= end) {
            int middle = (start / 2) + (end / 2);
            //^^^^ to account for MAX INTEGER as end
            if (intToFind == intArr[middle]) {
                return true;
            } else if (intToFind > intArr[middle]) {
                    start = middle + 1;
            } else {
                //catches less than
                    end = middle - 1;
            }

        }
        return false;
    }

    public Object[] bubbleSort(Object[] arr, Object valueToRemove) {
        boolean stillSorting = true;
        while (stillSorting) {
            stillSorting = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i+1] == valueToRemove) {
                    continue;
                }
                if (arr[i] == valueToRemove) {
                    Object temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    stillSorting = true;
                }
            }
        }
        for (Object element : arr) {
            System.out.print(element);
        }
        return arr;
    }

    public String[] convertToArray(List<String> list) {
        String[] returnArray = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }

    public List<String> convertToList(String[] arr) {
        List<String> arrConverted = new ArrayList<>(Arrays.asList(arr));
        return arrConverted;
    }

    public List<String> getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food.add(food);
    }

    @Override
    public String toString() {
        return "binarySearch{" +
                "food=" + food +
                '}';
    }

    public boolean isPalindrome(String str) {
        char[] wordArr = str.toCharArray();
        int middle = wordArr.length/2;
        boolean isPal = false;
        for (int i = 0; i < middle; i++) {
            if(wordArr[i] == wordArr[wordArr.length - 1 - i]) {
                isPal = true;
            } else { return false;}
        }
        return isPal;
    }
}
