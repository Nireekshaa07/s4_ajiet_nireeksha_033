class Main {
    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 2, 6, 1};

        int mRank = arr[0];
        int c = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < mRank) {
                c++;
                mRank = arr[i];
            }
        }

        System.out.println(c);
    }
}
