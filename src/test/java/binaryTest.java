import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.ArrayList;
import java.util.List;

public class binaryTest {
    binarySearch search = new binarySearch();

    @Test
    public void testOne() {
        int[] intArr = new int[]{1, 2, 4, 7, 9, 10, 23, 47};
        int intToFind = 10;
        search.binSearch(intArr, intToFind);

        Assert.assertTrue(search.binSearch(intArr, intToFind));
    }

    @Test
    public void testTwo() {
        int[] intArr = new int[]{1, 4, 7, 10, 23};
        int intToFind = 9;
        search.binSearch(intArr, intToFind);

        Assert.assertFalse(search.binSearch(intArr, intToFind));
    }

    @Test
    public void bubbleSortTest() {
        // given
        Integer[] arr = new Integer[]{5,1,5,2,8,6,5,7,9};
        Object[] expected = {1,2,8,6,7,9,5,5,5};
        Object[] actual = search.bubbleSort(arr,5);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSortTest2() {
        // given
        String[] arr = new String[]{null, "godzilla ", null, "couch ", "banal "};
        Object[] expected = {"godzilla ", "couch ", "banal ",null, null};
        Object[] actual = search.bubbleSort(arr,null);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void convertToArrayTest() {
        //given
        List<String> list= new ArrayList<>();
        list.add("sandwich");
        list.add("sandwich");
        list.add("sandwich");
        //when
        String[] actual= search.convertToArray(list);
        String[] expected= new String[]{"sandwich","sandwich","sandwich"};
        //assert

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void convertToListTest() {
        //given
        String[] arr = new String[]{"sandwich", "pasta", "coffee"};

        List<String> expected = new ArrayList<>();
        expected.add("sandwich");
        expected.add("pasta");
        expected.add("coffee");
        //when
        List<String> actual = search.convertToList(arr);

        //assert

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        search.setFood("falafel");
        search.setFood("beer");

        System.out.println(search.food.toString());
    }

    @Test
    public void isPalindromeTest1() {
        Assert.assertTrue(search.isPalindrome("abcba"));
    }

    @Test
    public void isPalindromeTest2() {
        Assert.assertFalse(search.isPalindrome("abcsa"));
    }

}
