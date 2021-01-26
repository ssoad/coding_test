import java.util.*; 

public class main{


   public static void main(String[] args){
      System.out.println("Enter Value of N: ");
      Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt(); 
      efficientJanitor(n);
   }

   public static int efficientJanitor(int n){
    Scanner sc = new Scanner(System.in);  
    float[] ls= new float[n];
      for(int i=0;i<n;i++){
         float r = sc.nextFloat();
         ls[i] = r;      
      }
      Arrays.sort(ls);
      int t=0;
      for(int i=0;i<n;i++){
          
        if(i<n-2){
            if(ls[i]+ls[i+1]<=3){
                t++;
                i++;
            }
            
          }else{
              t++;
          }
    
      }
      sc.close();
      System.out.print(t);
      return 1;
   }
} 