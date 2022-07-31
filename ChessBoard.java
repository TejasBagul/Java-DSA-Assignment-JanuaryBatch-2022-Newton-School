//package Assignments;
//
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class ChessBoard {
//    public static <BufferedReader> void main(String[] args)
//            throws IOException {
//        InputStreamReader sr = new InputStreamReader(System.in);
//        // BufferReader br= new BufferReader(sr);
//        BufferedReader br = new BufferedReader(sr);
//        int n = Integer.parseInt(br.readLine());
//        // for(int i=1; i<=n; i++){
//        // 	String inputs[] = br.readLine().split(" ");
//        // 	for(int j=1; j<=n; j++){
//        // 		int input=Integer.parseInt(inputs[j-1]);
//        // 	}
//        // }
//        // int arr[][]=new int[n][n];
//        // for(int i=0; i<n; i++){
//        // 	for(int j=0; j<n; j++){
//        // 		arr[i][j]=sc.nextInt();
//        // 	}
//        // }
//        int zero = 0;
//        int one = 0;
//
//        for (int i = 1; i <= n; i++) {
//            String inputs[] = br.readLine().split(" ");
//            for (int j = 1; j <= n; j++) {
//                int input = Integer.parseInt(inputs[j - 1]);
//                int index = (i + j) % 2;
//
//                if (index == input) zero++;
//                else one++;
//
//
//            }
//        }
//        System.out.println(Math.min(one, zero));
//
//
//        // for(int i=1; i<=n; i++){
//        // 	for(int j=1; j<=n; j++){
//        // 		int input=Integer.parseInt(br.readLine());
//        // 		int index=(i+j)%2;
//
//        // 		if(index==input) zero++;
//        // 		else  one++;
//        // 	}
//        // }
//        // System.out.println(Math.min(one,zero));
//
//
//    }
//}
