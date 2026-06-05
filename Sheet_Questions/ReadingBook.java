package Sheet_Questions;

public class ReadingBook {
    
    public int readingBook(int k, int[] arr1, int[] arr2) {
        
        int rep=0,ans=0;
        for(int i=0;i<arr1.length;i++){
            rep=k/arr1[i];
            ans=Math.max(ans,rep*arr2[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
       
    }
}

    

