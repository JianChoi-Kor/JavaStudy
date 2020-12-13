package codingtest;

import java.util.*;

public class HateSameNumber {
	
	
	public int[] solution(int []arr) {
        
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(arr[0]);
        
        int i = 0;
        
        for(int n : arr) {
        	if(ll.get(i) != n) {
        		ll.add(n);
        		i++;
        	}
        }
		
        int[] answer = new int[ll.size()];
        Iterator<Integer> iter = ll.iterator();
        int n = 0;
        while(iter.hasNext()) {
        	answer[n++] = iter.next();
        }
        return answer;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
