
public class HW3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(char alpha='A'; alpha<='z'; alpha++) {
       	  System.out.print(alpha);
       	  if(alpha=='Z') {
       		  System.out.println();
       		alpha='a'-1;
       		//alpha='a'-1 왜..'말고도 다 지워질까?
       	  }
	}
	}

}
