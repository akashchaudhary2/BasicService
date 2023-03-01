package com.akash.basicService.classes;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Strings implements com.akash.basicService.service.Strings {
    @Override
    public int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                len++;
            }
        }
        return len;
    }

    @Override
    public List bookOwned(String s1) {
        s1.trim();
        List list = new ArrayList();
        int j = 0;
        String s = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                s = s + s1.charAt(i);
            } else {
                list.add(j, s);
                j++;
                s = "";
            }
            if (i==s1.length()-1){
                list.add(j, s);
            }
        }
        return list;
    }
}
