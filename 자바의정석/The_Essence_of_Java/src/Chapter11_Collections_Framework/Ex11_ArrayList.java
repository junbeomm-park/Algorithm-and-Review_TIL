package Chapter11_Collections_Framework;
import java.util.*;

class Ex11_ArrayList {
	

	public static void main(String[] args) {
		ArrayList<Integer>list1 = new ArrayList<Integer>(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		// 1 <= x < 4
		ArrayList<String> list2 = new ArrayList(list1.subList(1,4));
		print(list1,list2);

		// 컬렉션 정렬  
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		// contains = list2가 list1에 포함 되어있는지 
		System.out.println("list1.containsAll(list2) : "
													+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // index가 3인 곳에 "A"를 추가 
		print(list1,list2);
		
		list2.set(3, "AA");
		print(list1,list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : "
													+ list1.retainAll(list2));
		print(list1,list2);
		
		// list2에서 list1에 포함된 객체들을 삭제
		for(int i = list2.size()-1; i >= 0 ; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
}
