package com.akash.basicService.service.hlevel;

import com.akash.basicService.service.elevel.Temp;

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
    public void ExTreeMap() {
        TreeMap map = new TreeMap();
        map.put(101,"customer1");
        map.put(102,"customer2");
        map.put(103,"customer3");
        map.put(104,104);
        System.out.println(map);
    }

    @Override
    public void ExWeakHashMap() {
        WeakHashMap map =new WeakHashMap();
        Temp temp = new Temp(10);
        map.put(temp,"customer1");
        System.out.println(map);
        temp=null;
        System.gc();
        System.out.println(map);
    }

    @Override
    public void ExHashtable() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(new Temp(5),"customer1");
        hashtable.put(new Temp(2),2);
        hashtable.put(new Temp(6),"customer3");
        hashtable.put(new Temp(15),"customer4");
        hashtable.put(new Temp(23),"customer 5");
        hashtable.put(new Temp(16),"customer6");
        Stream.of(hashtable).forEach(x->System.out.print(x));
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
