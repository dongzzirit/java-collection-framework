package collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        // Node 생성 후 연결 : A -> B -> C
        Node firstNode = new Node("A");
        firstNode.next = new Node("B");
        firstNode.next.next = new Node("C");

        System.out.println("연결된 노드 출력");
        System.out.println(firstNode);


    }

}
