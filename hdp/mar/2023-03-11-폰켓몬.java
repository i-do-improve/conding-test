import java.util.*;
class Solution {
	public int solution(int[] nums) {
		int answer = 0;

		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
		}
		if(nums.length/2>set.size()){
			answer=set.size();
		}else{
			answer=nums.length/2;
		}

		return answer;
	}
}