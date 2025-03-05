import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

//        String [] dilfs = {"Mads", "Agent Cooper", "Dean", "Stefan"};
//
//        for(int i = 0; i < dilfs.length; i++){
//            System.out.println(dilfs[i]);
//        }
//         FROM INPUT USER

        Scanner sc = new Scanner(System.in);

        String [] moms = new String [3];

        for(int i = 0; i < moms.length; i++){
            System.out.print("Enter the moms <3: ");
            moms[i] = sc.nextLine();
        }

        for(String mom : moms){
            System.out.println(mom);
        }
        sc.close();
    }
}
