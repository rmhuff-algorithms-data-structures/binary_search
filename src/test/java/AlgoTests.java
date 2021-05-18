import HackerRank.PracticeAlgos;
import HackerRank.Vangaurd;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgoTests {
    public PracticeAlgos algos = new PracticeAlgos();
    public Vangaurd test = new Vangaurd();

    @Test
    public void compareTriplets(){
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        b.add(3);
        b.add(6);
        b.add(10);

        algos.compareTriplets(a,b);
    }

    @Test
    public void reverseTest(){
        System.out.println(algos.reverse(121));
    }

    @Test
    public void commonPrefix(){
        String[] strs = new String[]{"fish", "flounder", "fish"};
        int fish = algos.commonPrefix(strs);
        System.out.println(fish);
    }

    @Test
    public void removeDupes(){
        int[] fart = new int[]{1,3,2,3,1,2,3,2,1,4};

        System.out.println(algos.removeDuplicates(fart));
    }

    @Test
    public void test1(){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        if (b1 & b2 | b2 & b3 | b2)
            System.out.println("ok");
        if (b1 & b2 | b2 & b3 | b2 | b1)
            System.out.println("donkey");
    }

    @Test
    public void sort(){
        System.out.println("ok");

        List<Integer> sortMe = new ArrayList<>();
        sortMe.add(10);
        sortMe.add(1);
        sortMe.add(5);
        sortMe.add(2);
        sortMe.add(5);
        sortMe.add(5);
        sortMe.add(2);
        sortMe.add(6);
        sortMe.add(3);
        sortMe.add(5);
        sortMe.add(3);

        algos.maxTickets(sortMe);
        }

    @Test
    public void breakingRecord(){
        List<Integer> scores = new ArrayList<>();
        scores.add(12);
        scores.add(24);
        scores.add(10);
        scores.add(24);


        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        List<Integer> actual = algos.breakingRecords(scores);

        Assert.assertEquals(actual.toString(),expected.toString());

    }

    @Test
    public void chocolateBar(){
        List<Integer> chocoBar = new ArrayList<>();
        chocoBar.add(1);
        chocoBar.add(2);
        chocoBar.add(1);
        chocoBar.add(3);
        chocoBar.add(2);

        Integer expected = 2;
        Integer actual = algos.choclateBar(chocoBar, 3,2);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void divisibleSumPairs1(){
        List<Integer> pairs = new ArrayList<>();
        pairs.add(1);
        pairs.add(2);
        pairs.add(3);
        pairs.add(4);
        pairs.add(5);
        pairs.add(6);

        Integer expected = 3;
        Integer actual = algos.divisibleSumPairs(0, 10, pairs);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisibleSumPairs2(){
        List<Integer> pairs = new ArrayList<>();
        pairs.add(1);
        pairs.add(3);
        pairs.add(2);
        pairs.add(6);
        pairs.add(1);
        pairs.add(2);

        Integer expected = 5;
        Integer actual = algos.divisibleSumPairs(0, 3, pairs);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeVsLength(){
        int[] arr = new int[]{0,1,2,3,4,5,6};

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(arr.length);
        System.out.println(list.size());
    }

    @Test
    public void migratoryBirdsBruteForce(){
        List<Integer> birbs = new ArrayList<>();

        birbs.add(1);
        birbs.add(2);
        birbs.add(3);
        birbs.add(4);
        birbs.add(5);
        birbs.add(4);
        birbs.add(3);
        birbs.add(2);
        birbs.add(1);
        birbs.add(4);

        Integer expected = 4;
        Integer actual = algos.migratoryBirdsBruteForce(birbs);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void migratoryBirdsMapped() {
        List<Integer> birbs = new ArrayList<>();

        birbs.add(1);
        birbs.add(2);
        birbs.add(3);
        birbs.add(4);
        birbs.add(5);
        birbs.add(4);
        birbs.add(3);
        birbs.add(2);
        birbs.add(1);
        birbs.add(4);

        algos.migratoryBirdsMapped(birbs);
    }


}
