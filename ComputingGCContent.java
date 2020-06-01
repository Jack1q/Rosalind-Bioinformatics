import java.util.*;

public class ComputingGCContent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Double> values = new ArrayList<>();
		String current = "";
		while (s.hasNext()) {
			String text = s.next();
			if (text.contains(">")) {
				names.add(text.substring(1));
				if (current.length() > 0)
					values.add(calculateGCContent(current));
				current = "";
			}
			else {
				current += text;
			}
		}
		values.add(calculateGCContent(current));
		
		double maxGCContent = values.get(0);
		String maxName = names.get(0);
		for (int i = 0; i < values.size(); i++) {
		    if (values.get(i) > maxGCContent) {
		        maxGCContent = values.get(i);
		        maxName = names.get(i);
		    }
		}
		System.out.println(maxName);
		System.out.println(maxGCContent);
		
	}

    public static double calculateGCContent(String seq) {
        double gcCount = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.substring(i,i+1).equals("G") || seq.substring(i,i+1).equals("C")) {
                gcCount++;
            }
        }
        return (int)(gcCount / seq.length() * 1000000) / 10000.0;
    }
}

