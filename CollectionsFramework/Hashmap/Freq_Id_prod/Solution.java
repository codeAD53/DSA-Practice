package Hashmap.Freq_Id_prod;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            int id = sc.nextInt();
            // map.put(id, map.getOrDefault(id, 0) + 1);
            if(map.containsKey(id)){
                int count = map.get(id);
                map.put(id,count+1);
            }else{
                map.put(id,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        sc.close();
    }
}
