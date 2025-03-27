
import java.util.*;
import java.util.stream.*;
public class Main{
    
    public static void main(String[] args){
        String msg;
        Scanner input=new Scanner(System.in);
        msg=input.nextLine();
        
        String[] str=msg.split("");
       
        Map<String,Integer> mapp=
        Arrays.stream(str)
        .collect(Collectors
        .toMap(
            letter -> letter,
            letter ->1,
            Integer::sum
            ));
        System.out.println(mapp);
        Optional<Map.Entry<String,Integer>> found=
        mapp.entrySet()
        .stream()
        .filter(entry -> entry.getValue() == 1)
        .findFirst();
        if(found.isPresent()){
            System.out.println(found);
        }
    }
}
