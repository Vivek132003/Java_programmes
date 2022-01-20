import javax.swing.plaf.synth.SynthOptionPaneUI;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assignment: explore labels with break and continue and write the programme for same
		// placing n queen on the chessboard by taking i/p
		// eg: user says row->1 and col->1 and col->1 i/p -> replace it with queen
		//\u2655 queen
		// a total of 4 inputs can be taken to place 4queens in the chess board
		//no queen can be placed in the same row or same column
		
		for(int i=0;i<4;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<4;j++)
				{
					if(i==j)
					{
						System.out.print('\u2655');
						continue;
					}
					if(j%2==0)
						System.out.print('\u25A0');
					else {
						System.out.print('\u25A1');
					}
				}
				System.out.println();
			}
			else
			{
				for(int j=0;j<4;j++)
				{
					if(i==j)
					{
						System.out.print('\u2655');
						continue;
					}
					if(j%2==0)
						System.out.print('\u25A1');
					else {
						System.out.print('\u25A0');
					}
				}
				System.out.println();
			}
		}

	}

}
