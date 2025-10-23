import java.util.*;
public class TrappingWater {
    public static int trappedRainwater(int height[])
    {
     // Calculate left max boundary
        int leftmax[]= new int[height.length];
        leftmax[0]= height[0];

        for(int i=0; i<height.length; i++)
        {
            leftmax[i]= Math.max(height[i], leftmax[i-1]);
        }
     // Calculate right max Boundary
     int rightmax[]= new int[height.length];
     rightmax[height.length-1]= height[height.length-1];
     
     for(int i=height.length-2; i>=0; i--)
     {
        rightmax[i]= Math.max(height[i], rightmax[i+1]);
     }

     int trappedWater=0;
     //loop 
     for(int i=0; i<height.length; i++)
     {
        int waterLevel= Math.min(leftmax[i], rightmax[i]);
        trappedWater+= waterLevel- height[i];
     }
     return trappedWater;

     // water level = min(leftmax , rightmax) 
     //trapped water = waterLevel -height[i]
    }
    public static void main(String [] args)
    {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println("Trapped water is "+ trappedRainwater(height));
    }
}
