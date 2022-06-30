public void checkArrayList2(){
    ArrayList<String> list new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add(1,"A1");

    for(String tempData:list){
        System.out.println(tempData);
    }

    ArrayList<String> list2 = new ArrayLIst<String>();
    list2.add("0 ");
    list2.addAll(list);
    for(String tempData:list2){
        System.out.println("List2 " + tempData);
    }
}