import java.util.Scanner; //importing Scanner class to take input
import java.util.Arrays;
class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creating scanner class obj sc 
        System.out.print("Enter No. of Students: ");
        int n = sc.nextInt(); // input with help of scannaer obj and its method
        String names[] = new String[n]; //names array 
        for(int i=0;i<n;i++){
            names[i] = sc.next(); //names input from users
        }
        Arrays.sort(names); //sorting using Arrays class sort method
        System.out.print("Sorted Names are: ");
        for(int i=0;i<n;i++){
            System.out.print(names[i]+" "); //printing sorted array
        }
        System.out.print("\nName to search: ");
        String ele = sc.next(); // name to search from the names array
        int ans = search(names, ele); //calling search function
        if(ans==-1)System.out.println("Not Found!");
        else System.out.println("Found At: " + ans);
        sc.close();
    }   
    static int search(String[] arr, String target){ //will give the index of name if present else -1
        int left=0, right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2; //dividing into smaller and smaller part till name is found
            int key = arr[mid].compareTo(target);
            if(key==0) return mid; //name found
            else if(key<0) left=mid+1; //checking right half
            else right=mid-1; //checking left half
        }
        return -1; //if name not present
    }
}









