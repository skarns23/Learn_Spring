package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int len;
    public static int[][] arr;
    public static boolean[][] visited;
    public static int[][] result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferReader로 입력받아서 출력해서 시간 줄임
        len = Integer.parseInt(br.readLine()); // 행렬의 크기 입력
        arr = new int [len][len]; //지도의 정보를 담을 배열
        visited = new boolean[len][len]; // BFS에서 방문한 배열의 위치를 저장하는 배열
        result = new int [len][len]; // BFS후 결과를 담아주는 배열
        //br.read(); // 행렬의 크기입력받고 남은 개행문자 처리
        for(int i =0; i <len;i++){ // 입력받는 단계
            String str = br.readLine(); // 행별로 읽어서 문자열에 담음
            for(int j = 0 ; j<len;j++){
                arr[i][j] = str.charAt(j)-'0'; // 문자열의 각 위치별 문자를 정수형으로 변경
                visited[i][j] = false; // 방문한 배열의 경우 방문하지 않은 것으로 초기화
            }
        }
        visited[0][0] = true; // 시작하는 노드의 위치의 경우 방문하고 시작하기때문에 true로 초기화 해줌
        long start_time = System.currentTimeMillis(); //시작 시간
        BFS(0,0); // BFS를 통한 최단 경로값 탐색
        long end_time = System.currentTimeMillis(); // BFS 종료 후 끝난 시간
        System.out.println("소요시간 : "+((double)(end_time-start_time)/1000)+"초"); // 시간을 초단위로 바꿔서 보여줌

    }
    public static void BFS(int row, int col){
        Queue<Node> que = new LinkedList<>(); // 최상위 노드와 인접 노드를 담아줄 que
        que.add(new Node(row,col,1)); // 시작 노드 삽입
        Node node = null;
        int[] delta_x = {1,0,-1,0}; // 우 -> 하 -> 좌 ->상
        int[] delta_y = {0,1,0,-1}; // 우 -> 하 -> 좌 ->상 순으로 탐색
        while(!que.isEmpty()){ // node가 마지막에 도달한 경우 더이상 que에 넣을 node가 존재하지 않아서 que가 추출만하고 삽입은 없어서 Empty상태에 들어서면 멈추게끔
            node = que.poll(); // 제일 앞에 있는 node 추출후 인접 노드 탐색을 진행
            result[node.x][node.y] = node.val; // BFS를 통한 val 값을 담는 배열
            for(int i = 0; i< delta_x.length;i++){ // 현재 노드에서 상하좌우 방향으로 갈 수 있는 노드를 탐색하는 for문
                int x = node.x +delta_x[i];
                int y = node.y +delta_y[i];
                if((x>=0 &&x<len) &&(y>=0 &&y<len) &&(arr[x][y]==1)&&(visited[x][y]==false)){
                    //현재 노드에서 상하좌우 방향으로 갈 경우 배열을 넘어서지는 않는지, 이미 방문한 노드인지, 갈 수 있는 노드인지를 판단하는 if문
                    que.add(new Node(x,y, node.val+1)); // 갈 수 있다고 판단된 경우 que에 node value를 하나 더해서 추가해준다.

                    visited[x][y] = true; // 해당 노드가 갈 수있다고 판단되어 추가한 경우 방문한 것으로 처리하여 다시 방문하는 것을 방지
                }

            }

        }
        // BFS 결과 행렬을 보고싶은 경우 주석처리 해제
       /* for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++)
                System.out.printf(String.format("%3d", result[i][j]));
            System.out.println();
        }*/
        System.out.println("최단 경로 값 : "+node.val);

    }


}
class Node{ // 갈 수 있는 배열에 대해 노드처럼 만들어서 값을 중첩으로 쌓아나감
    int x;
    int y;
    int val;
    public Node(int x, int y, int val){
        this.x = x;
        this.y = y;
        this. val = val;
    }
}