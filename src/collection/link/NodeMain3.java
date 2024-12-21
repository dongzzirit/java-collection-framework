package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        // Node 생성 후 연결 : A -> B -> C
        Node node = new Node("A");
        node.next = new Node("B");
        node.next.next = new Node("C");

        System.out.println(node);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색");
        printAll(node);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(node);
        System.out.println("lastNode = " + lastNode);

        // 특정 인덱스 노드 조회
        System.out.println("특정 인덱스 노드 조회");
        int index = 2;
        Node index2Node = getNode(node, index);
        System.out.println("index" + index + " Node = " + index2Node.item);

        // 데이터 추가
        System.out.println("데이터 추가");
        add(node, "D");
        System.out.println(node);

        add(node, "E");
        System.out.println(node);

        add(node, "F");
        System.out.println(node);

        Node nodeAfterAdd = getNode(node, 3);
        System.out.println("index" + index + " Node = " + nodeAfterAdd.item);


    }

    private static void printAll(Node firstNode) {
        Node x = firstNode;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

}
