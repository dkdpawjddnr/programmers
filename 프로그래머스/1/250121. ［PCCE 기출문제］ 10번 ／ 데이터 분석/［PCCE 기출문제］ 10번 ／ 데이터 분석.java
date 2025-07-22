import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Integer> sort_list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("code");
        list.add("date");
        list.add("maximum");
        list.add("remain");
        
        int ext_idx = list.indexOf(ext);
        int sort_idx = list.indexOf(sort_by);
        
        for(int[] arr : data) {
            if(arr[ext_idx] < val_ext) {
                sort_list.add(arr[sort_idx]);   
            }
        }
        
        Collections.sort(sort_list);
        
        int[][] answer = new int[sort_list.size()][data[0].length];
        
        for(int[] arr : data) {
            int data_idx = sort_list.indexOf(arr[sort_idx]);
            
            if(data_idx > -1) {
                answer[data_idx] = arr;
            }
        }
        
        return answer;
    }
}