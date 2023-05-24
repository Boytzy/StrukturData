public class Main {
    public static void main(String[] args) {
        Binary pohon = new Binary();

        pohon.NewNode(22);
        pohon.NewNode(4);
        pohon.NewNode(28);
        pohon.NewNode(40);
        pohon.NewNode(18);

        System.out.println("\n Pre Order : ");
        pohon.preOrder(pohon.root);
        System.out.println("\n In Order : ");
        pohon.inOrder(pohon.root);
        System.out.println("\n Post Order : ");
        pohon.postOrder(pohon.root);

    }
}