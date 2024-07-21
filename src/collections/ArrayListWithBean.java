package collections;

import java.util.ArrayList;

public class ArrayListWithBean {
	public static void main(String[] args) {

		ArrayList<Associates> ascList = new ArrayList<Associates>();
		Associates as1 = new Associates("Mahesh", 12, "Cancer");
		Associates as2 = new Associates("Suresh", 13, "TB");
		Associates as3 = new Associates("Ramesh", 14, "Dermatology");
		Associates as4 = new Associates("Rakesh", 15, "Nephology");
		Associates as5 = new Associates("Mukesh", 16, "Cancer");

		ascList.add(as1);
		ascList.add(as2);
		ascList.add(as3);
		ascList.add(as4);
		ascList.add(as5);

		for(int i=0; i<ascList.size(); i++) {
			if(ascList.get(i).getDeptName()=="TpB") {
				System.out.println(ascList.get(i).getName());
				
			}else if(ascList.get(i).getId()==13){
				System.out.println(ascList.get(i).getDeptName());
			}		
		}
	
		for(int i=0; i<ascList.size(); i++) {
			if (ascList.get(i).getName()=="Mukesh") {
				System.out.println(ascList.get(i).getId());
				break;
			}
		}
		
		for(int i=0; i<ascList.size(); i++) {
			if(ascList.get(i).getDeptName()=="Cancer") {
				System.out.println(ascList.get(i));
				break;
			}
		}
		for(int i=0; i<ascList.size(); i++) {
			if(ascList.get(i).getId()==16) {
				ascList.get(i).setDeptName("Cardeology");
				System.out.println(ascList.get(i));
			}
		}
		
		for(int i=0; i<ascList.size();i++) {
			if(ascList.get(i).getId()==15) {
				System.out.println(ascList.get(i).getName());
			}
		}
		

	}

}
