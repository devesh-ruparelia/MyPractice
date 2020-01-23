package practice;

import java.util.*;

public class P12 {
    public static void main(String[] args) {
        String str ="Hello";
        str.toLowerCase();
    }
    public String[] findWords(String[] words) {
        List<String> res= new ArrayList<>();
        Set<Character> qSet = new HashSet<>();
        Set<Character> aSet = new HashSet<>();
        Set<Character> zSet = new HashSet<>();
        String qStr = "qwertyuiop";
        String aStr = "asdfghjkl";
        String zStr = "zxcvbnm";
        for(char c:qStr.toCharArray()){
            qSet.add(c);
        }
        for(char c:aStr.toCharArray()){
            aSet.add(c);
        }
        for(char c:zStr.toCharArray()){
            zSet.add(c);
        }

        for(String str : words){
            boolean include =true;
            if(qSet.contains(str.charAt(0))){
                for(int i=1;i<str.length();i++){
                    if(!qSet.contains(str.charAt(i))){
                        include=false;
                        break;
                    }
                }
            }
            else if(aSet.contains(str.charAt(0))){
                for(int i=1;i<str.length();i++){
                    if(!aSet.contains(str.charAt(i))){
                        include=false;
                        break;
                    }
                }
            }
            else{
                for(int i=1;i<str.length();i++){
                    if(!zSet.contains(str.charAt(i))){
                        include=false;
                        break;
                    }
                }
            }
            if(include){
                res.add(str);
            }
        }

        String[] resArr = new String[res.size()];
        for(int k=0;k<res.size();k++){
            resArr[k]=res.get(k);
        }
        return resArr;
    }
}
