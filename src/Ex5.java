public class Ex5 {
    public static void main(String[] args) {
        int[] arr = {1,3,6,11,10,9,4,2,0};
       System.out.println(finalCheck(arr));
        }
    public static int indexBiggerNum (int [] arr) {
        int max =0;
        int index=0;
        for (int i =0; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static boolean beforeSummit (int [] arr) {
        boolean flag1 = false;
        int beforeIndex = indexBiggerNum(arr);
        for (int i = 0; i < beforeIndex; i++) {
            if (arr[i] < arr[i + 1]) {
                flag1 = true;
            } else {
                flag1 = false;
            }
        } return flag1;
    }
        public static boolean afterSummit (int [] arr) {
            boolean flag2 = false;
            int afterIndex = indexBiggerNum(arr);
            for (int i = afterIndex; i  < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    flag2 = true;
                } else {
                    flag2 = false;
                }
            }
            return flag2;
        }
        public static int finalCheck(int []arr){
        if(beforeSummit(arr)==true&&afterSummit(arr)==true){
            return indexBiggerNum(arr);
        }
        else{
            return -1;
        }
        }
}



