public class bubblesort {
    static int min; 
    public static void main(String[] args) {
        int arr[]= {89,56,78,12,45};
        for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1-i; j++) {
                        if (arr[j]>arr[j+1]) {
                           
                            
                            min = arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=min;
                            for (int j2 = 0; j2 < arr.length; j2++) {
                                System.out.print(arr[j2]+",");
                            }
                            System.out.println();
                        }
                      
                        
                }
    }
    
  
}
}
