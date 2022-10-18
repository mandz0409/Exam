import java.util.*;
class number_one{  
    public static void main(String[] args) {      
        int elmnts[]={9,7,8,6,8,5,5,6,3,2};

        System.out.println("Duplicate in Array listed: ");  

        for(int x = 0; x < elmnts.length; x++) {  
            for(int y = x + 1; y < elmnts.length; y++) {  
                if(elmnts[x] == elmnts[y])  
                    System.out.println(elmnts[y]);  
            }  
        }  
    }  
}   