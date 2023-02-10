package ticketbooking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class TicketReservation {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		List<Passanger> confirmedList=new ArrayList<>();
		Deque<Passanger> waitingList=new ArrayDeque<>();
		while(true) 
		{
			System.out.println("Enter your id");
			int id=sc.nextInt();
			System.out.println("Enter your name");
			sc.nextLine();
			String name=sc.nextLine();
			Passanger p1=new Passanger(id,name);
			if(confirmedList.size()<10) 
			{
				confirmedList.add(p1);
			}
			else if (confirmedList.size()>=10 && waitingList.size()<3)
			{
				waitingList.add(p1);
			}
			else {
				System.out.println("no seat available");
			}
			
		}

	}

}
