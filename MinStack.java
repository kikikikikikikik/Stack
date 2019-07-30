/**
 * @ClassName MinStack
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/7/30  19:49
 * @Veresion 1.0
 */
import java.util.ArrayList;
public class MinStack {
    private ArrayList<Integer> normal;
    private ArrayList<Integer> min;
    public MinStack(){
        normal=new ArrayList<>();
        min=new ArrayList<>();
    }
    public void push(int x){
        normal.add(x);
        if(min.isEmpty()){
            min.add(x);
        }
        else if(x<min.get(min.size()-1))
            min.add(x);
        else{
            min.add(min.get(min.size()-1));
        }
    }
    public void pop(){
        min.remove(min.size()-1);
        normal.remove(normal.size()-1);
    }
    public int top(){
        return normal.get(normal.size()-1);
    }
    public int min(){
        return min.get(min.size()-1);
    }
}
