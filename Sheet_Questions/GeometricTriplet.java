package Sheet_Questions;

public class GeometricTriplet {

    public static void findTriplets(int arr[]) {
        int n = arr.length;

        System.out.println("Geometric Triplets:");

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4,5,7, 8, 16};

        findTriplets(arr);
    } 
}
