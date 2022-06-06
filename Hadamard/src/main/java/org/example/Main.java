package org.example;
import java.util.Scanner;

//21720947 남승현 이동통신 HW6.1
public class Main {



    public static void main(String[] args) {
        boolean val = false;
        boolean[][] result_A = new boolean[32][32]; //32*32 orthgonal code set을 담을 배열
        int[][] result_B = new int[32][32]; // 32* 32 Walsh code Set을 담을 배열
        int menu; // 입력 메뉴
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nSelect Menu");
            System.out.println("1 : 32*32 Orthogonal code Set");
            System.out.println("2 : H5 Walsh code Set");
            System.out.println("3 : Print H[5][0] H[5][6] H[5][17] H[5][21]");
            System.out.println("4 : Check Orthogonal");
            System.out.println("exit : Press any other key");
            menu = sc.nextInt();
            System.out.println("Select : "+menu);
            switch (menu){
                case 1:
                    boolean H1[][] = new boolean[2][2]; //기본으로 넘길 배열 2*2 크기
                    for(int i = 0 ; i< H1.length;i++){
                        for(int j = 0 ; j< H1.length;j++){
                            if(i>=H1.length/2 && j>=H1.length/2)
                                val = !val; //마지막 위치에서 값을 뒤집어서 담아줌
                            H1[i][j] = val;
                        }
                    }
                    result_A = solution_A(H1);
                    break;
                case 2:
                    int start_val = -1;
                    int[][] WH1 = new int[2][2];
                    for(int i = 0 ;i< WH1.length;i++){
                        for(int j =0;j<WH1.length;j++){
                            if(i>= WH1.length/2 && j>=WH1.length/2)
                            {
                                start_val *= -1;
                                WH1[i][j] = start_val;
                                continue;
                            }
                            WH1[i][j] = start_val;
                        }
                    }
                    result_B = solution_B(WH1);
                    break;
                case 3:
                    solution_C(result_B);
                    break;
                case 4:
                    solution_D(result_A,result_B);
                    break;
                default:
                    return ;
            }
        }

    }


    public static boolean[][] solution_A(boolean[][] H){

        if(H.length==32){  //현재 배열의 크기가 32이면 return
            System.out.println("Solution_A : 32*32 othogonal code set");
            String s = "%3d";
            for(int i = 0 ; i<H.length;i++){ //boolean 형태로 담아서 바꿔주는 과정 필요
                for(int j = 0 ; j< H.length;j++){
                    if(H[i][j])
                        System.out.printf(s,1);
                    else
                        System.out.printf(s,0);
                }
                System.out.println();
            }
            return H;
        }
        boolean [][] H_tmp = new boolean[H.length*2][H.length*2]; // 입력 받은 배열의 행*2, 열*2 짜리 배열 만들어줌
        for(int i = 0 ; i< H_tmp.length;i++){
            for(int j = 0; j<H_tmp.length;j++){
                if(i>=H.length && j>=H.length){ // 4사 분면에 존재하는 경우 기존 행렬 값을 뒤집어서 담아준다.
                    H_tmp[i][j] = !H[i%H.length][j%H.length];
                    continue;
                }
                H_tmp[i][j] = H[i%H.length][j%H.length]; // 아닌 경우에는 그대로 담아주면 됨
            }
        }

        return solution_A(H_tmp); // 재귀함수형식으로 만들기 위해 사용
    }

    public static int[][] solution_B(int[][] H){
        if(H.length == 32){ // 배열의 크기가 32인 경우 종료
            System.out.println("Solution_B : 32*32 Walsh code set");
            for(int i =0; i<H.length;i++){
                for(int j = 0;j<H.length;j++)
                    System.out.printf(String.format("%3d", H[i][j]));
                System.out.println();
            }
            return H;
        }
        int[][] H_tmp = new int [H.length*2][H.length*2]; // 행과 열이 두배씩 큰 행렬을 만들어줌
        for(int i = 0 ;i<H_tmp.length;i++){
            for(int j = 0; j< H_tmp.length;j++){
                if(i>=H.length&&j>=H.length){//H_tmp의 4사분면인 경우 기존 행렬의 값을 반대로 뒤집어서 담음
                    H_tmp[i][j] = -1*H[i% H.length][j%H.length];
                    continue;
                }
                H_tmp[i][j] = H[i% H.length][j%H.length];
            }
        }
        return solution_B(H_tmp);
    }

    public static void solution_C (int[][]H){
        int [] arr = new int[]{0,6,17,21};
        for(int i :arr){
            System.out.print("H[5]["+i+"] = \n");
            for(int j = 0; j<H.length;j++)
                System.out.print(H[i][j]+" ");
            System.out.println();
        }
    }

    public static void solution_D(boolean[][] orth_Mtrx,int[][] walsh_Mtrx){
        //orth_Mtrx에 대해서는 두 Binary Sequencd에 대해서 XOR연산을 하고 난뒤의 0의 갯수와 1의 갯수가 같으면 orthogonal로 인정
        //walsh코드의 경우에는 같은 위치의 두 값을 곱한 뒤 다 더한 값이 0이면 orthogonal로 판단.
        int [] test_num = {15,20,25}; //기준이 되는 코드와 비교할 위치
        boolean [] base_orth = orth_Mtrx[10]; // 기준이 되는 코드로 10번째 행 선택
        int [] base_walsh = walsh_Mtrx[10]; // 기준이 되는 코드로 10번재 행 선택 H[5][10]
        for(int i =0  ; i< test_num.length;i++){
            int test_orth = 0 ; // orth의 XOR후 0과 1의 갯수 세기
            int test_walsh = 0; // walsh의 두 값 곱한 후 값을 더해 담을 변수
            for(int j=0;j <32;j++){
                if(base_orth[j]==orth_Mtrx[test_num[i]][j]) //같으면 0 아니면 1
                    test_orth++;
                else
                    test_orth--;
                test_walsh += base_walsh[j]*walsh_Mtrx[test_num[i]][j]; // 같은 위치의 두 walsh code를 곱해서 담아줌
            }
            System.out.println("round "+(i+1));
            System.out.println("Using orth_Mtrx[10], orth_Mtrx["+test_num[i]+"], walsh_Mtrx[10], walsh_Mtrx["+test_num[i]+"]");
            System.out.println("Check Orthogonal set : "+test_orth+" Check Walsh Code : "+test_walsh);
        }
        }
    }
