package nqt_sheet;

public class CountFreq {
    public void countFreq(int[] arr, int n){
        boolean[] visited = new boolean[n];
        for(int i = 0; i < arr.length; i++){
            if(visited[i])
                continue;
            int count = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Number"+ "|  "+ "Frequency");
            System.out.println(arr[i] + "    ->      " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 15, 10, 10, 15, 5};
        int n = arr.length;
        CountFreq obj = new CountFreq();
        obj.countFreq(arr, n);
    }
}
