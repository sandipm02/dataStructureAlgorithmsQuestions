/**
 * Question: 
 * How do you find the missing number in a given integer array of 1 to 100?
 */

class MissingNum {
    public static void main(String[] args) {
        SetupFor1to100 set = new SetupFor1to100();
        solution(set.getGeneratedArray());

    }

/**
 * Answer:
 * The solution I employed for this question was to use a while statement
 * to increment a variable i, until it has a value of 100. If at any point,
 * the corresponding position (also i) in the array is incorrect or missing, the 
 * program will state the number that is missing and terminate. 
 * 
 * @param temp An Array that is missing a random number n.
 */
    public static void solution(int[] temp) {
        int i = 0;
        while(i!=101) {
            if(temp[i] != i) {
                System.out.println("The missing # is " + i + " \n");
                break;
            }
            i++;
        }
    }
}

/**
 * This class is used to setup the problem
 */
class SetupFor1to100 {
    private int[] generatedArray;

    public SetupFor1to100() {
        this.generatedArray = removeRandomIndex(create1to100Array(), generateRandomNum());
    }

    private int[] create1to100Array() {
        int[] temp = new int[100];
        for (int i = 0; i < 100; i++) {
            temp[i] = i;
        }
        return temp;
    }

    public int[] getGeneratedArray() {
        return this.generatedArray;
    }

    private static int generateRandomNum() {
        double temp = Math.random();
        temp = temp * 100;
        Math.floor(temp);
        int temp2 = (int) temp;
        System.out.println("\nThe generated index to be removed is " + temp2);
        return temp2;
    }

    private int[] removeRandomIndex(int[] temp, int index) {
        temp[index] = -1;
        return temp;
    }
}