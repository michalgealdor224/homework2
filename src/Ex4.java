public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,1,8,9,2,1,3,8,0};
        int [] array = arrayWithoutDuplicates(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int lengthWithOutDuplicates  ( int [] array ) {
         int count =0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (number == array[j]) {
                    count++;
                    break;
                }
            }
                }
        return count;
        }

    public static int[] arrayWithoutDuplicates(int[] array) {
        int count=0;
        int count1 = lengthWithOutDuplicates(array);
        boolean flag = true;
        int[] newArray = new int[array.length-count1];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            for (int j = i + 1; j  <= array.length-1; j++) {
                if (number != array[j]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                for (int k = count; k < newArray.length; k++) {
                    newArray[k] = number;
                    count++;
                    break;
                }

                }
            }

      for(int m=0; m < array.length; m++) {
          int lastNumber = array[m] ;
        for(int f=0; f < newArray.length; f++) {
           int location= newArray.length;
            newArray[location-1]= lastNumber;
        }
        }
            return newArray;
    }
}





