/**
 * Question: 
 * How do you find the largest and smallest number in an unsorted integer array?
 */

class HighestLowestNum {
    public static void main(String[] args) {
        HighestLowestNumSum set = new HighestLowestNumSum();
        solution(set.getArray()); //insert required paramenters to finish solution
    }

/**
 * Answer:
 * #### insert explanation
 * 
 */
    public static void solution(int[] array) {
        print(array);
        // Bubble Sort Implementation  
        int temp;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("The Smallest # in the Array is: " + array[0]);
        System.out.println("The Largest # in the Array is: " + array[array.length-1]);
        }


        public static void print(int[] array) {
            System.out.print("\n[");
        for(int i = 0; i < array.length;i++) {
            if(i == array.length-1) {
                System.out.print(array[i]);
                
            }
            else {
                System.out.print(array[i]);
                System.out.print(',');
            }
        }
        System.out.print("]\n");
        }
}

/**
 * This class is used to setup the problem
 */

class HighestLowestNumSum {
    private int[] array;

    public HighestLowestNumSum() {
        int[] temp = new int[generateRandomArr()];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = generateRandomNum();
        }
        this.array = temp;
    }

    public int[] getArray() {
        return array;
    }

    private int generateRandomNum() {
        double temp = Math.random();
        temp = temp * 100;
        Math.floor(temp);
        int temp2 = (int) temp;
        return temp2;
    }

    private int generateRandomArr() {
        double temp = Math.random();
        temp = temp * 100;
        Math.floor(temp);
        int temp2 = (int) temp;
        if(temp2 < 3) {
            generateRandomArr();
        }
        return temp2;
    }

}