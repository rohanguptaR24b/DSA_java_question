// question 6 - Write a Java program to find the second largest element in a given integer array.
// If all elements are the same or no second largest element exists, display an appropriate message.

//  observation-the second largest element is the largest value that is smaller than the maximum element in the array.
//  pseudo code :
//  step 1 : find the maximum element 
//  step 2 : find the second largest element using condition max is not equal to max  element

public class second_max {
    public static void main(String[] args) {
        int a[] = {1,2,8,4,9,6,9,8};
        int max = a[0];
        int second_max = a[0];
        // find the max element
        for(int i = 1 ; i<a.length ; i++){
            if(a[i]> max){
            max= a[i];
        } 
        // find the second max element
        }for(int j = 1 ; j<a.length ; j++){
            if(a[j]> second_max && a[j]!= max){
            second_max= a[j];
            }
        }if(max==second_max){
            System.out.println("there is no second largest element");
        }else {
            System.out.println(" second largets element = "+ second_max);
        }
    }
}