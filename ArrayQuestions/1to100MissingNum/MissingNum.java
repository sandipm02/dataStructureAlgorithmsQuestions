

public class MissingNum {
    public static void main(String[] args) {
        Setup set = new Setup();
        solution(set.getGeneratedArray());

    }

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

class Setup {
    private int[] generatedArray;

    public Setup() {
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