import java.util.ArrayList;

public class hashset {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        int s=0;
        ArrayList<Integer> reslist=new ArrayList<Integer>();
        for(Integer i:list){
            if(reslist.contains(i)){
                continue;
            }
            else{
                reslist.add(i);
                s=s+1;
            }
        }
        System.out.println(s);

    }
}
