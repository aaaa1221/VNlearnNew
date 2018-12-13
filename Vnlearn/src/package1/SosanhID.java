package package1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SosanhID {

	public static void main(String[] args) {
		String str1 = "1,2,3,4,5,6,7,8,9";
		String str2 = "1,2,3";
		System.out.println(GhepID(str1, str2));
	}
	//Ghép ID không trùng + sắp xếp
	public static String GhepID(String str1, String str2) {
		String result="";
		String[] s1 = str1.split(",");
		String[] s2 = str2.split(",");
		
		List<String> arr1 = new ArrayList<>();
		for (int i = 0; i < s1.length; i++) {
			arr1.add(s1[i]);
		}
		List<String> arr2 = new ArrayList<>();
		for (int i = 0; i < s2.length; i++) {
			arr2.add(s2[i]);
		}
		
		for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if(arr1.get(i).toString().equals(arr2.get(j).toString())) {
					arr1.remove(i);
				}
			}
		}
		arr1.addAll(arr2);
		arr1.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (int i = 0; i < arr1.size(); i++) {
			result=result.concat(","+ arr1.get(i).toString());
		}
		return result.substring(1);
	}

}
