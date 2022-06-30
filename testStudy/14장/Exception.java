public void arrayOutOfBoundsTryCatch(){
    try{
        int[] intArray=new int[5];
        System.out.println(intArray[5]);
    }catch(Exception e){
        System.out.println("error");
    }
}

public void arrayOutOfBoundsTryCatch(){
    int[] intArray = new int[5];
    try {
        System.out.println(intArray[5]);
        System.out.println("This code should run.");
    } catch (Exception e) {
        System.out.println("Error");
    }
}