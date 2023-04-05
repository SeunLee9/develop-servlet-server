package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5591 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int allLen = Integer.parseInt(st.nextToken());
    int partLen = Integer.parseInt(st.nextToken());
    int[] allArr = new int[allLen];
    for(int i=0;i<allLen;i++){
      allArr[i] = Integer.parseInt(br.readLine());
    }
    int sum = 0;
    int max = 0;
    int imax = 0;
    for(int i=0;i<allLen-partLen+1;i++){
      if(i==0){
        for(int j=0;j<partLen;j++){
          sum += allArr[j];
          max = sum;
        }
      }
      if(i>0){
        sum = sum-allArr[i-1]+allArr[partLen+i-1];
        imax = sum;
        if(imax>max){
          max = imax;
        }
      }
    }

    bw.write(String.valueOf(max));
    bw.close();
  }

  //1.��������
  // ù°�ٿ� ������ ������ ���ӵȼ� k�� �־�����
  // ���ӵ� k���� ���Ұ� �ִ밪�� �Ǵ°��� ���ϴ� ������
  //2.�����ذ�����
  // ���� 0�϶� k���� ���� ���ϰ�,
  // �״��� ù��° ���Ҹ� ���� k+1�� ���Ҹ� ���ϸ� �ɰͰ���.
  // �׸��� ���ÿ� max�� üũ
  // �ð����⵵ �������� �޸� ��������
  //3.�ǻ��ڵ�
  //max�ʱ�ȭ
  //sum�ʱ�ȭ
  // for(n-k+1){
  // if(i=0){
  //    for(j,k){
  //    sum = ó���迭[j]++;
  //    }
  //max= sum (����)
  // }
  //if(i>0){
  // sum = sum-ó���迭[i-1]+ó���迭[i+k]
  //
  //imax = sum
  //if(imax>max){
  // max = imax
  // }
  // }
  // }
  //4.��������
  //4-1. Ǯ���� ����� �ٸ�������� Ǯ�� �;��µ� �ڷᱸ���� �ͼ������ʾƼ� �ð����⵵�� ������ ������ �� �򰥷ȴ�. �ڷᱸ���� �� �� �ͼ������� �ذ�ɰͰ���
  //4-2. �迭 ���� ������ �� �ؾ��ҵ� �ǳ� �ѹ��� Ʋ���� �� �� �ʿ䰡 �ִ� ���� ���� ����
  //4-3. �극��ũ ����Ʈ�� ���Ծ���
  //4-4. ������ ���̾��� �׸�ŭ �� �Ĳ��ϰԺ���
}
