package graphs;

import java.util.*;

public class Graph {
  private Map<Node, List<Node>> adjNodes;

  public Graph() {
    adjNodes = new HashMap<>();
  }
  //////////////////////////////////////// methods /////////////////////////////////////////////
  void addNode(String label) {
    adjNodes.putIfAbsent(new Node(label), new ArrayList<>());
  }

  void addEdge(String label1, String label2) {
    Node v1 = new Node(label1);
    Node v2 = new Node(label2);
    adjNodes.get(v1).add(v2);
    adjNodes.get(v2).add(v1);
  }

  List<String> getNeighbors(String label) {
    List<String> output = new ArrayList<>();

    for (Node node : adjNodes.get(new Node(label))) {
      output.add(node.label);
    }
    return output;
  }

  Set<String> getNodes(){
    Set<String> output = new HashSet<>();

    for (Map.Entry<Node, List<Node>> entry : adjNodes.entrySet()) {
      output.add(entry.getKey().label);
      for (Node node : entry.getValue()) {
        output.add(node.label);
      }
    }
    return output;
  }

  int size(){
    Set<String> output = new HashSet<>();

    for (Map.Entry<Node, List<Node>> entry : adjNodes.entrySet()) {
      output.add(entry.getKey().label);
      for (Node node : entry.getValue()) {
        output.add(node.label);
      }
    }
    return output.size();
  }



  ///////////////////////////////// getters and setters ////////////////////////////////
  public Map<Node, List<Node>> getAdjNodes() {
    return adjNodes;
  }

  public void setAdjNodes(Map<Node, List<Node>> adjNodes) {
    this.adjNodes = adjNodes;
  }
}
