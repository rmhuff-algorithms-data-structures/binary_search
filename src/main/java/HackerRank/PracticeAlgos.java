package HackerRank;

import java.util.*;

public class PracticeAlgos {

    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] results = new Integer[]{0,0};

        for(int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                results[0] += 1;
            } else if (a.get(i) < b.get(i)) {
                results[1] += 1;
            } else {
                continue;
            }
        }
        List<Integer> targetList = Arrays.asList(results);

        System.out.println(targetList);
        return targetList;
    }

    public int reverse(int x) {
        int original = x;
        int reversed = 0;

        while (x != 0){
            reversed = (reversed*10)+(x % 10);
            x /= 10;
        }

        if (reversed != original) {
            System.out.println("fart");
            System.out.println(reversed);
        }

        return reversed;
    }


    public int commonPrefix(String[] array){
        return array[2].length();
    }

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int e : set) {
            System.out.println(e);
        }
        return set.size();
    }

    public Integer[] listToArray(List<Integer> list) {
        Integer[] array = new Integer[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public Integer[][] listsToMatrix(List<List<Integer>> lists) {
        Integer[][] matrix = new Integer[lists.size()][];

        for (int i = 0; i < lists.size(); i++) {
            listToArray(lists.get(i));
            //nope
        }
        return null;
    }

    public boolean bools(){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        if (b1 & b2 | b2 & b3 | b2)
            System.out.println("ok");

        return true;
    }

    public int maxTickets(List<Integer> tickets) {
        Collections.sort(tickets);
        System.out.println(tickets);

        int currentMax = 0;
        int finalMax = 1;
        for (int i = 0; i < tickets.size() - 1; i++) {
            if (i > 0 && tickets.get(i) <= tickets.get(i-1)+1) {
                currentMax++;
            } else
                currentMax = 1;
        }
        if (currentMax > finalMax) {
            finalMax = currentMax;
        }
        System.out.println(finalMax);
        return finalMax;
    }

    public int shortestDistance(List<String> tools, int startIndex, String target){
        int minDist = Integer.MAX_VALUE;

        if  (tools.get(startIndex) == target) {
            return 0;
        }
        int targetIndex = 0;
        for (int i = 0; i < tools.size(); i++) {
            for (int j = i + 1; j < tools.size(); j++) {
                if(tools.get(i) == target) {
                    targetIndex = i;
                }
            }
        }

        int oneWay = Math.abs(targetIndex - startIndex);
        int otherWay = Math.abs((targetIndex - startIndex)-tools.size());
        return Math.max(oneWay, otherWay);
    }


    //For each element in an array determine if it is less than
    //the lowest element to that point or more than the highest
    //element to that point. Return a List that indicate how
    //many times a new high or low was encountered.
    public List<Integer> breakingRecords(List<Integer> scores) {
        Integer[] breakingRecords = new Integer[]{0,0};

        Integer currentLow = scores.get(0);
        Integer currentHigh = scores.get(0);

        for(int i = 0; i < scores.size(); i++) {
            if(scores.get(i) > currentHigh) {
                breakingRecords[0]++;
                currentHigh = scores.get(i);
            } else if (scores.get(i) < currentLow) {
                breakingRecords[1]++;
                currentLow = scores.get(i);
            } else {
                continue;
            }
        }
        return Arrays.asList(breakingRecords);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            if (x1 + (v1 * i) == x2 + (v2 * i)) {
                return "Yes";
            }
        }
        return "No";
    }

    //Given a List and 2 ints (m , n), how many of the Lists subarrays
    //of size n have a sum of m.
    public Integer choclateBar(List<Integer> choco, int sumOf, int sectionSize) {
        Integer totalSections = 0;
        Integer currentSum;

        for (int i = 0; i < choco.size(); i++) {
            currentSum = 0;
            if(i+sectionSize > choco.size()){
                break;
            }
            for(int j = 0; j < sectionSize; j++) {
                int k = i + j;
                currentSum += choco.get(k);
            }
            if (currentSum == sumOf) {
                totalSections++;
            }
        }
        System.out.println(totalSections);
        return totalSections;
    }

    public Integer divisibleSumPairs(int n, int k, List<Integer> ar){
        Integer countOfPairs = 0;

        for (int i = 0; i < ar.size(); i++){
            for (int j = 0; j < ar.size(); j++){
                if (i < j && (k % (ar.get(i)+ar.get(j))== 0 || (ar.get(i)+ar.get(j)) % k== 0)){
                    countOfPairs++;
                }
            }
        }
        return countOfPairs;
    }

    //Given an array return the most common value. If there is a
    //tie for most common return the lesser of the two values.
    public int migratoryBirdsBruteForce(List<Integer> arr){
        int countOne = 0;
        int currentInt = 0;
        int countMax= 0;
        int maxValue = 0;

        for (int i = 0; i < arr.size(); i++) {
            currentInt = arr.get(i);
            countOne = 1;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    countOne++;
                }
            }
            if (countOne > countMax){
                countMax = countOne;
                maxValue = currentInt;
            } else if (countOne == countMax && currentInt < maxValue) {
                maxValue = currentInt;
            }
        }
        return maxValue;
    }

    public Integer migratoryBirdsMapped(List<Integer> arr){
        Map<Integer, Integer> birbs = new HashMap<>();

        for (Integer i : arr) {
            Integer value = birbs.get(i);
            birbs.put(i, value == null ? 1 : value + 1);
        }

        Map.Entry<Integer, Integer> max = null;

        for (Map.Entry<Integer, Integer> e : birbs.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }
        System.out.println(max.getKey());

        return max.getKey();
    }

    public Integer migratoryBirdsStreamed(List<Integer> arr){
        Map<Integer, Integer> birbs = new HashMap<>();

        for (Integer i : arr) {
            Integer value = birbs.get(i);
            birbs.put(i, value == null ? 1 : value + 1);
        }

        Map.Entry<Integer, Integer> max = null;

        for (Map.Entry<Integer, Integer> e : birbs.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }
        System.out.println(max.getKey());

        return max.getKey();
    }
}


