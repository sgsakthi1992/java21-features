import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public void main() {
  var arrayList = new ArrayList<>(Arrays.asList("banana", "cherry"));
    /*arrayList.add(0, "apple");
    arrayList.add(arrayList.size(), "plum");
    System.out.println(arrayList.get(0));
    System.out.println(arrayList.get(arrayList.size()-1));*/
  arrayList.addFirst("apple");
  arrayList.addLast("plum");
  System.out.println(arrayList.getFirst());
  System.out.println(arrayList.getLast());
  arrayList.removeLast();
  System.out.println(arrayList.getLast());
  System.out.println(arrayList);

  var linkedHashSet = new LinkedHashSet<>(Arrays.asList("banana", "cherry"));
    /*linkedHashSet.add("plum");
    //no explicit way to add to first
    System.out.println(linkedHashSet.iterator().next());
    System.out.println(linkedHashSet.toArray()[linkedHashSet.size()-1]);*/
  linkedHashSet.addFirst("apple");
  linkedHashSet.addLast("plum");
  System.out.println(linkedHashSet.getFirst());
  System.out.println(linkedHashSet.getLast());
  System.out.println(linkedHashSet.reversed());

  var treeSet = new TreeSet<>(Arrays.asList("banana", "cherry"));
  System.out.println(treeSet.getFirst());
  //treeSet.addFirst("apple"); throws Unsupported operation exception
}
