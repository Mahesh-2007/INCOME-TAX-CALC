import java.util.*;
public class taxCALC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PLEASE ENTER YOUR INCOME : ");
        int INCOME = sc.nextInt();
        if(INCOME<500000){
            System.out.println("YOR TAX IS : 0");
        }else if(INCOME>=500000 && INCOME <1000000){
            System.out.println("YOUR TAX IS : " + INCOME*0.2);
        }else{
            System.out.println("YOUR TAX IS : " + INCOME*0.3);
        }
    }
}