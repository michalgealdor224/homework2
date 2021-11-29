public class Ex6 {
        public static void main(String[] args) {
            int[] arr1 = {4, 3, 2, 1,0};
            int[] arr2 = {4,6};
            int[] newArray = cutArray(arr1, arr2);
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] +", ");
            }
            System.out.println("");
            System.out.println("Is the array foreign? " + isForeign(arr1,arr2));
        }
        public static boolean isThereInNewArray(int[] arr, int num){
            for (int i = 0; i < arr.length; i++){
                if(arr[i] == num){
                    return true;
                }
            }
            return false;
        }
        public static int[] cutArray(int[] arr1, int[] arr2) {
            int[] arr = new int[arr2.length];
            for (int m = 0; m < arr.length; m++){
                arr[m] = -999;
            }
            int count = 0;
            for (int i = 0, k = 0; i < arr1.length; i++) {
                int currentInt = arr1[i];
                for (int j = 0; j < arr2.length;j++){
                    if(currentInt == arr2[j]){
                        if(!isThereInNewArray(arr, currentInt)){
                            arr[k] = currentInt;
                            k++;
                            count++;
                        }
                    }
                }
            }
            int[]intersection = new int[count];
            for (int i = 0; i < intersection.length;i++){
                if(i < count){
                    intersection[i] = arr[i];
                }
                else{
                    break;
                }
            }
            return intersection;
        }
        public static boolean isForeign(int[]arr1, int[] arr2){
            int [] arrToReturn = cutArray(arr1,arr2);
            if(arrToReturn.length == 0){
                return true;
            }
            return false;
        }
    }

