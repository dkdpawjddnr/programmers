import java.util.*;

class Solution {
	public int solution(int n, int[][] wires) {
		int answer = n;
		int len = wires.length;
		
		//반복 필요, 각 케이스는 한 간선을 제외하고 실시 필요
		for (int t = 0; t < len; t++) {
			boolean[] visited = new boolean[n+1];
			ArrayList<Integer>[] graph = new ArrayList[n+1];
			int count1 = 0;  //전력망1 갯수
			int count2 = 0;  //전력망2 갯수
			int graphCount = 0;  //총 전력망 갯수
			for (int i = 0; i < graph.length; i++) {
				graph[i] = new ArrayList<>();
			}
			
			for (int i = 0; i < len; i++) {
				if(i == t)continue;
				int n1 = wires[i][0];
				int n2 = wires[i][1];			
				graph[n1].add(n2);
				graph[n2].add(n1);
			}

			for(int i = 1; i< n+1; i++) {
				if(!visited[i]) {
					graphCount++;
					if(graphCount == 1) {
						count1++;
					}else {
						count2++;
					}
					Queue<Integer> queue = new LinkedList<>();
					queue.add(i);
					visited[i] = true;
					while(!queue.isEmpty()) {
						int cur = queue.poll();
						for(int num :graph[cur]) {
							if(!visited[num]) {
								visited[num] = true;
								queue.add(num);
								if(graphCount == 1) {
									count1++;
								}else {
									count2++;
								}
							}
						}
					}
				}
			}
			if(graphCount == 2) {
				int differ = Math.max(count1, count2) - Math.min(count1, count2);
				if(differ<answer) {
					answer = differ;
				}
			}
		}
		return answer;
	}
}