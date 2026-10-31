import  java.util.*;

class All_String_Permutations_in_Sorted_Order{
    ArrayList <String>res = new ArrayList<>();
    void swap(int f, int s, char arr[])
    { char tmp = arr[f]; arr[f] = arr[s]; arr[s] = tmp; }
    void recur(char arr[], int s, int e){
        if(s == e) res.add( String.valueOf(arr) ) ;
        for(int i=s;i<=e;i++){
            swap(s, i, arr);
            recur(arr, s+1, e);
            swap(s, i, arr);
        }
    }
    public ArrayList<String> permutation(String s) {  
        recur(s.toCharArray(), 0, s.length()-1);  
        Collections.sort(res, (a,b)->a.compareTo(b));
        return res;
    }
}