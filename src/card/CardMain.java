package card;

public class CardMain {

	public static void main(String[] args) {
		
		String[] shapes = {"spade", "heart", "clover", "diamond"};
		String[] values = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		Card[][] deck = new Card[shapes.length][values.length];
		
		for(int i=0; i<shapes.length; i++) {
			for(int j=0; j<values.length; j++) {
				
				deck[i][j] = new Card(shapes[i], values[j]);
			}
		}
		
		for(int i=0; i<shapes.length; i++) {
			for(int j=0; j<values.length; j++) {
				
				System.out.print(deck[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
