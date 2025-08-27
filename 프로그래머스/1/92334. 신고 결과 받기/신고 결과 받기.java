import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, HashSet<String>> reports = new HashMap<>();

        Map<String, Integer> mailCount = new HashMap<>();

        for (String user: id_list) {
            reports.put(user, new HashSet<>());
            mailCount.put(user, 0);
        }

        for (String r: report) {
            String[] splitReport = r.split(" ");
            String reporter = splitReport[0]; 
            String reported = splitReport[1]; 

            reports.get(reported).add(reporter);
        }

        for (String reportedUser: reports.keySet()) {
            HashSet<String> reporters = reports.get(reportedUser);
            if (reporters.size() >= k) {
           
                for (String reporter: reporters) {
                    mailCount.put(reporter, mailCount.get(reporter)+1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }
        return answer;
    }
}