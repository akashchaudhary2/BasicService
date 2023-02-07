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

    @Override
    public void ExHashMap() {
        HashMap map = new HashMap();
        map.put(1111,"customer0");
        map.put(1111,"customer1");
        map.put(2222,"customer2");
        map.put(3333,"customer3");
        map.put(4444,"customer4");
        System.out.println(map);
    }

    @Override
    public void ExLinkedHashMap() {
        LinkedHashMap map = new LinkedHashMap();
        map.put(1111,"customer0");
        map.put(1111,"customer1");
        map.put(2222,"customer2");
        map.put(3333,"customer3");
        map.put(4444,"customer4");
        System.out.println(map);
    }

    @Override
    public void ExIdentityHashMap() {
        IdentityHashMap map = new IdentityHashMap();
        map.put(1111,"customer0");
        map.put(1111,"customer1");
        System.out.println(map);
    }


    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,ints,0,nums1.length);
        System.arraycopy(nums2,0,ints,nums1.length,nums2.length);
        double d=(double)Arrays.stream(ints).sum()/ints.length;
        return d;
    }

}
