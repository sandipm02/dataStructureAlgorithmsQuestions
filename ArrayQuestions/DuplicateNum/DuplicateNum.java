/**
 * Question: 
 * How do you find the duplicate number on a given integer array?
 */

class DuplicateNum {
    public static void main(String[] args) {
        SetupForDuplicateNum set = new SetupForDuplicateNum();
        for(int i = 0; i < set.getGeneratedArray().length; i++) {
            System.out.print(set.getGeneratedArray()[i] + " ");
        }
        solution(set.getGeneratedArray());

    }

/**
 * Answer:
 * #### insert explanation
 * 
 * @param temp An Array that is a duplicate number at position x & y.
 */
    public static void solution(int[] array) {
        for(int i = 0; i<array.length; i++) {
            for(int j = 0; j<array.length; j++) {
                if(array[i] == array[j] && i!=j) {
                    System.out.println("The duplicates exist at " + i + " with a value of " + array[i] + " and " + j + " with a value of " + array[j]);
                    return;
               }
            }
        }
    }
}

/**
 * This class is used to setup the problem
 */

class SetupForDuplicateNum {
    private int[] generatedArray;

    public SetupForDuplicateNum() {
        int sizeOfArray = generateRandomNum();
        int duplicateNumValue = generateRandomNum();
        int posOne = position(sizeOfArray);
        int posTwo = position(sizeOfArray, posOne);
        System.out.println("The Duplicate Number generated will be " + duplicateNumValue);
        System.out.println("The Length of the Array will be " + sizeOfArray);
        int[] tempArray = new int[sizeOfArray];
        for(int i = 0;i<sizeOfArray;i++) {
            tempArray[i] = i;
        }
        tempArray[posOne] = duplicateNumValue;
        tempArray[posTwo] = duplicateNumValue;
        this.generatedArray = tempArray;
    }

    public int position(int sizeOfArray) {
        int positionToPlace = generateRandomNum();
        if(positionToPlace > sizeOfArray-1) {
            position(sizeOfArray);
            return 0;
        }
        else {
            return positionToPlace;
        }
    }

    public int position(int sizeOfArray, int num) {
        int positionToPlace = generateRandomNum();
        if(positionToPlace > sizeOfArray-1 || positionToPlace == num) {
            position(sizeOfArray);
            return 0;
        }
        else {
            return positionToPlace;
        }
    }

    public int[] getGeneratedArray() {
        return this.generatedArray;
    }

    private static int generateRandomNum() {
        double temp = Math.random();
        temp = temp * 100;
        Math.floor(temp);
        int temp2 = (int) temp;
        if(temp2 < 3) {
            generateRandomNum();
        }
        return temp2;
    }

}