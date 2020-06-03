import java.util.*;

public class ConsensusandProfile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> sequences = new ArrayList<>();
		String content = "";
		while(s.hasNext()) {
			String text = s.next();
			if (text.contains(">")) {
				if (content.length() > 0) {
				sequences.add(content);
				content = "";
			}
			}
			else {
				content += text;
			}
		}
		sequences.add(content);
		int[][] profile = new int[4][sequences.get(0).length()];
		for (int i = 0; i < sequences.size(); i++) {
		    for (int j = 0; j < sequences.get(i).length(); j++) {
		        String letter = sequences.get(i).substring(j,j+1);
		        if (letter.equals("A")) {
		            profile[0][j]++;
		        }
		        else if (letter.equals("C")) {
		            profile[1][j]++;
		        }
		        else if (letter.equals("G")) {
		            profile[2][j]++;
		        }
		        else {
		            profile[3][j]++;
		        }
		    }
		}
		String[] letters = {"A","C","G","T"};
		
		for (int col = 0; col < profile[0].length; col++) {
		    int max = 0;
		    String maxName = "";
		    for (int row = 0; row < profile.length; row++) {
		        if (profile[row][col] > max) {
		            max = profile[row][col];
		            maxName = letters[row];
		        }
		    }
		    System.out.print(maxName);
		}
		System.out.println();
		for (int row = 0; row < profile.length; row++) {
		    System.out.print(letters[row] + ": ");
		    for (int col = 0; col < profile[row].length; col++) {
		        System.out.print(profile[row][col] +" ");
		    }
		    System.out.println();
		}
	}
}