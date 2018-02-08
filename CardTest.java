import java.util.Scanner;
public class CardTest {
	public static void main(String[] args) {
		
		Card Card1=new Card(5,"Diamond");
		System.out.println(Card1.number + Card1.suit);
		Card Card2=new Card(7,"Diamond");
		System.out.println (Card2.number + Card2.suit);
		Card Card3=new Card(9,"Diamond");
		System.out.println (Card3.number + Card3.suit);
		Card Card4=new Card(1,"Diamond");
		System.out.println(Card4.number + Card4.suit);
		Card Card5=new Card(3,"Diamond");
		System.out.println (Card5.number + Card5.suit);
		Card Card6=new Card(2,"Diamond");
		System.out.println (Card6.number + Card6.suit);
		Card Card7=new Card(4,"Diamond");
		System.out.println(Card7.number + Card7.suit);
		Card Card8=new Card(6,"Diamond");
		System.out.println (Card8.number + Card8.suit);
		Card Card9=new Card(8,"Diamond");
		System.out.println (Card9.number + Card9.suit);
		Card Card10=new Card(1,"Spades");
		System.out.println (Card10.number + Card10.suit);
		Card Card11=new Card(2,"Spades");
		System.out.println (Card11.number + Card11.suit);
		Card Card12=new Card(3,"Spades");
		System.out.println (Card12.number + Card12.suit);
		Card Card13=new Card(4,"Spades");
		System.out.println (Card13.number + Card13.suit);
		Card Card14=new Card(5,"Spades");
		System.out.println (Card14.number + Card14.suit);
		Card Card15=new Card(6,"Spades");
		System.out.println (Card15.number + Card15.suit);
		Card Card16=new Card(7,"Spades");
		System.out.println (Card16.number + Card16.suit);
		Card Card17=new Card(8,"Spades");
		System.out.println (Card17.number + Card17.suit);
		Card Card18=new Card(9,"Spades");
		System.out.println (Card18.number + Card18.suit);
		Card Card19=new Card(1,"Clubs");
		System.out.println (Card19.number + Card19.suit);
		Card Card20=new Card(2,"Clubs");
		System.out.println (Card20.number + Card20.suit);
		Card Card21=new Card(3,"Clubs");
		System.out.println (Card21.number + Card21.suit);
		Card Card22=new Card(4,"Clubs");
		System.out.println (Card22.number + Card22.suit);
		Card Card23=new Card(5,"Clubs");
		System.out.println (Card23.number + Card23.suit);
		Card Card24=new Card(6,"Clubs");
		System.out.println (Card24.number + Card24.suit);
		Card Card25=new Card(7,"Clubs");
		System.out.println (Card25.number + Card25.suit);
		Card Card26=new Card(8,"Clubs");
		System.out.println (Card26.number + Card26.suit);
		Card Card27=new Card(9,"Clubs");
		System.out.println (Card27.number + Card27.suit);	
		Scanner Scanner= new Scanner(System.in);
		System.out.println ("Pick a number");
		int number=Scanner.nextInt();

		System.out.println ("Pick a suit");
			Scanner sdc= new Scanner(System.in);
					String suit=sdc.nextLine();
	
		
		if ((number==5)&&suit.equals("Spades")){
			System.out.println ("You picked the lucky card");
			
		}else 
		{
			System.out.println ("You did not pick the lucky card");
		}
		
		
}}
