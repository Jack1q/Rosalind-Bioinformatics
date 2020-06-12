import java.util.*;

public class OverlapGraphs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> dnaStrings = new ArrayList<>();
        String currentValue = "";
        while (s.hasNext()) {
            String text = s.next();
            if (text.contains(">")) {
                names.add(text.substring(1));
                if (currentValue.length() > 0) {
                    dnaStrings.add(currentValue);
                    currentValue = "";
                }
            }
            else 
                currentValue += text;
        }
        dnaStrings.add(currentValue);
    
        ArrayList<Node> graph = new ArrayList<>();
        for (int i = 0; i < dnaStrings.size(); i++) 
            graph.add(new Node(names.get(i), dnaStrings.get(i)));
        

        for (Node node : graph) 
            for (Node otherNode : graph) 
                if (node != otherNode && node.canConnectToNode(otherNode)) 
                    node.addConnectingNode(otherNode);
    
        for (Node node : graph) 
            if (node.getConnectingNodes().size() > 0) 
                for (Node connected : node.getConnectingNodes()) 
                    System.out.println(node.getName() + " " + connected.getName());
    }
}

class Node {
    private String name;
    private String dnaString;
    private ArrayList<Node> connectingNodes;
    
    public Node(String name, String dnaString) {
        this.name = name;
        this.dnaString = dnaString;
        connectingNodes = new ArrayList<>();
    }
    public boolean canConnectToNode(Node node) {
        return getSuffix().equals(node.getPrefix());
    }
    public void addConnectingNode(Node node) {
        connectingNodes.add(node);
    }
    public String getSuffix() {
        return dnaString.substring(dnaString.length() - 3);
    }
    public String getPrefix() {
        return dnaString.substring(0,3);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Node> getConnectingNodes() {
        return connectingNodes;
    }
}