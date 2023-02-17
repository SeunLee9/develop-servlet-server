package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ5567 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int friends = Integer.parseInt(br.readLine());
    int line = Integer.parseInt(br.readLine());
    List<List<Integer>> array = new ArrayList<>();
    int[] checkOut = new int[friends+1];
    int[] friendsC = new int[friends+1];

    for(int i=0;i<friends+1;i++){
      array.add(new ArrayList<>());
    }

    for(int i=0;i<line;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int first = Integer.parseInt(st.nextToken());
      int second = Integer.parseInt(st.nextToken());
      array.get(first).add(second);
      array.get(second).add(first);
    }
    System.out.println(array);
    bw.write(String.valueOf(howMany(checkOut,array,friendsC)));
    bw.close();
  }

  public static int howMany(int[] checkOut, List<List<Integer>> array, int[] friendsC){
    Queue<Integer> queue = new LinkedList<>();
    int who = 1;
    checkOut[who] = 1;
    queue.offer(who);
    int count = 0;
    while(!queue.isEmpty()){
      who = queue.poll();
      if(friendsC[who]==2){
        break;
      }
      for(int i=0; i<array.get(who).size();i++){
        int iInWho = array.get(who).get(i);
        if(checkOut[iInWho]==0) {
          checkOut[iInWho] = 1;
          friendsC[iInWho] = friendsC[who]+1;
          queue.offer(iInWho);
        count++;
        }
      }
    }
    return count;
  }








//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    int cohort = Integer.parseInt(br.readLine());
//    int input = Integer.parseInt(br.readLine());
//    List<List<Integer>> graph = new ArrayList<>();
//    int[] checked = new int[cohort+1];
//    int who = 1;
//    int count = 0;
//
//    for(int i=0;i<cohort+1;i++){
//      graph.add(new LinkedList<>());
//    }
//
//    for(int i=0;i<input;i++){
//      StringTokenizer st = new StringTokenizer(br.readLine());
//      int node = Integer.parseInt(st.nextToken());
//      int linked = Integer.parseInt(st.nextToken());
//      graph.get(node).add(linked);
//    }
//    System.out.println(graph);
//
//    count = howMany(graph,cohort,who,checked,count);
//
//    bw.write(String.valueOf(count));
//    bw.close();
//  }
//
//  public static int howMany(List<List<Integer>> graph, int cohort, int who, int[] checked, int count)
//      throws IOException {
//    Queue<Integer> queue = new LinkedList<>();
//    queue.add(who);
//    checked[who] = 1;
//    int preNode = who;
//    while(!queue.isEmpty()){
//      int newNode = queue.poll();
////      System.out.println(newNode);
////      if(newNode!=1 && preNode ==1||graph.get(1).contains(newNode)){
////        System.out.println(newNode+"일때 count가 추가됐습니다");
////        count++;
////      }
//      //1
////      if(newNode!=1 && preNode==1 || preNode==2 || preNode==3){
////        System.out.println(newNode+"일때 preNode" +preNode+"로 count가 추가됐습니다");
////        count++;
////      }
//      //1
////        if (newNode==1||preNode==1){
//          if (preNode==1||preNode==2||preNode==3){
//          for(int i=0;i<graph.get(newNode).size();i++) {
//            if (checked[graph.get(newNode).get(i)] == 0) {
//            queue.add(graph.get(newNode).get(i));
//            checked[graph.get(newNode).get(i)] = 1;
//              System.out.println(graph.get(newNode).get(i)+"가 큐에 추가됐습니다");
//              }
//            //1
//                if(newNode!=1 && preNode==1 || preNode==2 || preNode==3){
//                  System.out.println(newNode+"일때 preNode" +preNode+"로 count가 추가됐습니다");
//                  count++;
//                }
//            //1
//            }
////          if(graph.get(1).contains(newNode)||newNode==1) {
////            preNode = 1;
////          }else {
////            preNode = 0;
////          }
//
//            if(newNode==1) {
//              preNode = 1;
//              } else if (graph.get(1).contains(newNode)) {
//              preNode = 2;
//            } else if (preNode==2) {
//              preNode = 3;
//            } else {
//              preNode = 0;
//            }
//
//          }
//    }
//    return count;
//  }
}
