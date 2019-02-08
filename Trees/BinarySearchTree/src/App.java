public class App {
    public static void main(String[] args) {
        Tree<Person> bst = new BinarySearchTree<>();
        
        bst.insert(new Person("Ivan", 25));
        bst.insert(new Person("John", 27));
        bst.insert(new Person("Joe", 21));
        bst.insert(new Person("Ivan", 37));

        System.out.println(bst.getMaxValue());
    }
}                                   
