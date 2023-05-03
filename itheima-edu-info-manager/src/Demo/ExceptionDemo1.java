package Demo;



public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[]arr=null;
        try{
            printArr1(arr);
        }catch(NullPointerException e){
            System.out.println("参数不能为null");
        }


    }

    private static void printArr1(int[] arr) {
        if(arr==null){
            throw new NullPointerException();
        }else{
            for (int j : arr) {
                System.out.println(j);
            }
        }
    }
}
