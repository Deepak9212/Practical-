package Collection;

import java.util.Stack;

//push(),pop(),search(),peek(),empty()
public class StackEg {
	public static void main(String[] args) {
		//creating stack class
		Stack<Integer> s=new Stack<>();
		//checking empty or not
		boolean result=s.isEmpty();
		System.out.println("is the stack empty?"+result);
		//adding element push
		s.push(25);
		s.push(55);
		s.push(65);
		s.push(75);
		s.push(45);
		s.push(85);
		System.out.println("stack element:"+s);
		Integer digit=s.peek();//access element from the top of the stack
		System.err.println("top element:"+digit);
		System.out.println("stack element after peek:"+s);
		Integer digit2=s.pop();
		System.err.println("top element:"+digit2);
		System.out.println("stack element after pop:"+s);
		int digitl=s.search(75);
		System.out.println("search element:"+digitl);
		int x=s.size();//find the size of the object
		System.out.println("stack size:"+x);
		result=s.empty();//checking empty or not
		System.out.println("is the stack empty?"+result);
	}

}
