//  question 1 - create an n array and count no of element having atleast 1 element greater than itself

// observation - for every max element there would not be any elemnent greater than max element
// psuedocode :
// (1) iterate and get the max element od an array 
// (2) iterate and count no of elements that are not equal to max


public class count {
    public static void main(String args[]){
        int [] a =  {-3,4,5,9,9,6,7};
        int max_count = 0;
        int max = a[0];
        int total ;
        // find the maximum element
        for(int i = 1 ; i<a.length ; i++){
            if(a[i]> max){
            max= a[i];
        }
        // count the no of max element
        }for(int i = 1 ; i<=5 ; i++){
            if(a[i] == max){
                max_count++ ;
        }

    }total = a.length - max_count;
    System.out.println(total);
}
}