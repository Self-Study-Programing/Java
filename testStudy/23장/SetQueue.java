/**
 * HashSet
 * 
 * --method--
 * add
 * clear
 * clone
 * contains
 * isEmpty
 * iterator
 * remove
 * size
 * 
 * Queue
 * 
 * --method--
 * addFirst
 * offerFirst
 * push
 * add
 * addLast
 * offer
 * offerLast
 * add
 * set
 * addAll
 * addAll
 */

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String []cars = new String[] {
            "Tico","Sonata","BMW","Benz",
            "Lexus","Mustang","Grandeure",
            "The Beetle","MiniCooper","i30",
            "BMw","Lexus","Carnibal","SM5",
            "SM7","SM3","Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }
    public int getCarKinds(String cars){
        if(cars == null) return 0;
        if(cars.length == 1) return 1;
        Set<String> carSet = new HashSet<String>();
        for(String car:cars){
            carSet.add(car);
        }
        return carSet.size();
    }
    public void printCarSet2(Set<String> carSet){
        Iterator<String> iterator=carSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

public class QueueSample {
    public static void main(String[] args) {
        QueueSample sample - new QueueSample();
        sample.checkLinkedList1();
    }
    public void checkLinkedList1(){
        LinkedList<String> link = new LinkedList<String>();
        list.add("A");
        list.addFirst("B");
        System.out.println(link);
        link.offerFirst("C");
        System.out.println(link);
        list.addLast("D");
        System.out.println(link);
        list.offer("E");
        System.out.println(link);
        link.offerLast("F");
        System.out.println(link);
        link.push("G");
        System.out.println(link);
        link.add(0, "H");
        System.out.println(link);
        System.out.println("Ex="+link.set(0,"I"));
        System.out.println(link);
    }
}