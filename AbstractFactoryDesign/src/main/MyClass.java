package main;

import java.util.*;

public class MyClass {
    public static void func(List<Integer> list, int [] arr) {
        
        int [] res = new int[arr.length];
        
        for(int i=0;i<arr.length;i++) {
            
            int si =0;
            int ei =list.size()-1;
            
            int ans=-1;
            
            while(si<=ei) {
                int mid = (si+ei)/2;
                
                if(list.get(mid)>=i) ei = mid-1;
                else if(arr[list.get(mid)]>=arr[i]) si = mid+1;
                else {
                    ans = arr[list.get(mid)];
                    ei = mid-1;
                }
            }
            
            res[i] = ans;
            
        }
        
        for(int i=0;i<arr.length;i++)
        System.out.print(res[i]+" ");
    }
  public static void main(String args[]) {
    
    int [] arr = {2,1,3,2,1,3};
    
    List<Integer> list = new ArrayList<>();
    
    for(int i=0;i<arr.length;i++) {
        if(list.size()>0 && arr[i]>=arr[list.get(list.size()-1)]) continue;
        else {
            list.add(i);
        }
    }
    
            for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        
        System.out.println();
        
        
         System.out.println();
        
        func(list, arr);
    
  }
}