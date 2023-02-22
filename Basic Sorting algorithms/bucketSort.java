import java.util.*;

public class bucketSort {

    static void bucketsort(float[] arr) {
        int n = arr.length;

        // buckets
        ArrayList<Float>[] bucket = new ArrayList[n];
        // create an empty buckets
        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();
        }

        // Add elements into our buckets
        for (int i = 0; i < bucket.length; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }
        // sort each bucket individually

        for (int i = 0; i < bucket.length; i++) {
            Collections.sort(bucket[i]);
        }

        // merge all buckets to get final sorted array
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            ArrayList<Float> currBucket = bucket[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = { 0.5f, 0.4f, 0.3f, 0.2f, 0.1f };
        bucketsort(arr);
        for (float val : arr) {
            System.out.println(val + " ");
        }
    }
}