package com.akash.JavaProject.service.hard;

import com.akash.JavaProject.service.medium.MLevel;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.util.*;
import java.util.stream.Stream;

public class HLImpl implements HLevel {

    @Override
    public void MapObjects() {
//        Map map1 = new Dictionary<>();
        Map map2= new Hashtable();
        Map map3 = new Properties();

        Map map4 = new HashMap();
        Map map5 = new WeakHashMap();
        Map map6 = new IdentityHashMap();
        Map map7 = new LinkedHashMap();

        SortedMap map8 = new TreeMap();
        NavigableMap map9 = new TreeMap();
    }

//    @Override
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//       return Arrays.stream(Stream.of(nums1,nums2).flatMap(Stream::of).toArray()).mapToInt(o-> (int) o).average().getAsDouble();
//    }

    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,ints,0,nums1.length);
        System.arraycopy(nums2,0,ints,nums1.length,nums2.length);
        double d=(double)Arrays.stream(ints).sum()/ints.length;
        return d;
    }

}
