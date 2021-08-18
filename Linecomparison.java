public class Linecomparison{
public static void main(String[] args) {
    System.out.println("welcome to line problem");
    int l1p1x=2,l1p1y=3,l1p2x=8,l1p2y=7,l2p1x=3,l2p1y=4,l2p2x=9,l2p2y=8;
    double length1,lenght2;
    length1=Math.sqrt((l1p2x-l1p1x)^2+(l1p2y-l1p2y)^2);
    lenght2=Math.sqrt((l2p2x-l2p1x)^2+(l2p2y-l2p2y)^2);

    System.out.println(" line 1 length is "+length1+" line 2 length is "+lenght2);

    if(length1==lenght2)
     System.out.println("both lines are equal");
    else
        System.out.println("lines are not equal");
        
    
    
    if(length1>lenght2)
    System.out.println("l1 is greaterthan l2");
    else if(length1<lenght2)
    System.out.println("l2 is greaterthan l1");
    else 
    System.out.println("both are aqual");
    
}

}