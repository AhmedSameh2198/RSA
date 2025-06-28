import java.util.Scanner;

public class RSA {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        //Enc
        
        int C;
        int M,E,ME,N,P,Q;
        
        System.out.println("Please enter the M");
        M = Sc.nextInt();
        System.out.println("Please enter the E");
        E = Sc.nextInt();
        System.out.println("Please enter the P");
        P = Sc.nextInt();
        System.out.println("Please enter the Q");
        Q = Sc.nextInt();
        N = P * Q;
        ME = (int) Math.pow(M, E);
        C = ME % N ;
        System.out.println("The Encryption is" +" "+C);
        
        //Dec
        
//        int C,P,Q,N,E,PhiN,KPHiN,D,M;
//      
//        System.out.println("Please enter the P");
//        P = Sc.nextInt();
//        System.out.println("Please enter the Q");
//        Q = Sc.nextInt();
//        System.out.println("Please enter the C");
//        C = Sc.nextInt();
//        System.out.println("Please enter the E");
//        E = Sc.nextInt();
//        PhiN = (P - 1)*(Q - 1);
//        N = P * Q; 
//        
//        
//        
//        for (int K=1; K<PhiN; K++){
//            KPHiN = (1+(K*PhiN));
//            if (KPHiN % E == 0){
//                D = KPHiN/E; 
//                System.out.println("The private key is"+" "+D);
//                
//                M =((int)Math.pow(C, D)%N);
//                System.out.println("The decryption  is"+" "+M);
//                break;
//            }
//        }
//        
    }
}
