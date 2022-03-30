package abstract_exercise;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
       if(this.root == null) {
           this.root = item;
           return true;
       }

       ListItem currentItem = this.root;
       while(currentItem != null) {
           int comparison = (currentItem.compareTo(item));
           if (comparison < 0) {

               if(currentItem.next() != null) {
                   currentItem = currentItem.next();
               } else {
                   currentItem.setNext(item);
                   return true;
               }
           } else if(comparison > 0) {

               if(currentItem.previous() != null) {
                   currentItem = currentItem.previous();
               } else {
                   currentItem.setPrevious(item);
                   return true;
               }
           } else {
               System.out.println(item.getValue() + " is already present");
               return false;
           }
       }
       return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }


        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
