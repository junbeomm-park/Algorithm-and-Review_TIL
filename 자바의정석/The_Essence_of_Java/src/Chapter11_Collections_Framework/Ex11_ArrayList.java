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

		// 而щ젆�뀡 �젙�젹  
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		// contains = list2媛� list1�뿉 �룷�븿 �릺�뼱�엳�뒗吏� 
		System.out.println("list1.containsAll(list2) : "
													+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // index媛� 3�씤 怨녹뿉 "A"瑜� 異붽� 
		print(list1,list2);
		
		list2.set(3, "AA");
		print(list1,list2);
		
		// list1�뿉�꽌 list2�� 寃뱀튂�뒗 遺�遺꾨쭔 �궓湲곌퀬 �굹癒몄��뒗 �궘�젣
		System.out.println("list1.retainAll(list2) : "
													+ list1.retainAll(list2));
		print(list1,list2);
		
		// list2�뿉�꽌 list1�뿉 �룷�븿�맂 媛앹껜�뱾�쓣 �궘�젣
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
