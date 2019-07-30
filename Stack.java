/**
 * @ClassName Stack
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/7/30  19:12
 * @Veresion 1.0
 */
import java.util.Arrays;
public class Stack {
    private int[] array;
    private int top;
    public Stack(int defaultCapacity){
        array=new int[defaultCapacity];
        top=0;
    }
    public Stack(){
        this(20);
    }
    public void push(int val){
        if(array.length==top){
            array=Arrays.copyOf(array,array.length*2);
        }
        array[top++]=val;
    }
    public void pop(){
        if(top<=0){
            System.err.println("栈为空，不能出栈");
            return;
        }
        else{
            top--;
            array[top]=0;
        }
    }
    public int top(){
        if(top<=0){
            System.err.println("栈空，无法返回栈顶元素");
            return -1;
        }
        return array[top-1];
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top==0;
    }
}
