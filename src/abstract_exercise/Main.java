package abstract_exercise;

public class Main {

    public static void main(String[] args) {
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for(String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
