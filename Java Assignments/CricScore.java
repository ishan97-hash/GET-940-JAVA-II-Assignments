
import java.util.Random;

public class CricScore {

	public static void main(String[] args) {
		int total_runs = 0;
		int count_1 = 0, count_2 = 0, count_3 = 0, count_4 = 0, count_5 = 0, count_6 = 0;
		int runs[] = new int[30];
		Random rn =new Random();
		for(int i = 0; i < 30; i++) {
			runs[i] = rn.nextInt(6)+1;
		}
		for(int i = 0; i < runs.length; i++){
			total_runs = total_runs + runs[i];
		}
		System.out.println("Total runs are: "+total_runs);
		for(int i = 0; i < runs.length; i++){
			if(runs[i] == 1) {
				count_1++;
			}
			if(runs[i] == 2) {
				count_2++;
			}
			if(runs[i] == 3) {
				count_3++;
			}
			if(runs[i] == 4) {
				count_4++;
			}
			if(runs[i] == 5) {
				count_5++;
			}
			if(runs[i] == 6) {
				count_6++;
			}
		}
		System.out.println("No. of 1s is: "+count_1);
		System.out.println("No. of 2s is: "+count_2);
		System.out.println("No. of 3s is: "+count_3);
		System.out.println("No. of 4s is: "+count_4);
		System.out.println("No. of 5s is: "+count_5);
		System.out.println("No. of 6s is: "+count_6);
		
		
	}
}

