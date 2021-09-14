import java.util.ArrayList;
import java.util.Stack;

public class CTCITowersOfHanoi {
    public static void main(String[] args){
        try
        {
            CTCITowersOfHanoi obj = new CTCITowersOfHanoi();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    public void run(String[] args){
        solveHanoi(4,"A","B","C");
    }
    public void solveHanoi(int height,String a,String b,String c){
        if(height == 1){
            System.out.println("Moved disk " + 1 + " from rod " + a + " to rod " + b);
            return;
        }
        solveHanoi(height-1,a,c,b);
        System.out.println("Moved disk " + height + " from rod " + a + " to rod " + b);
        solveHanoi(height-1,c,b,a);
    }
}