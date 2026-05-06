    package Week4.Practice;

    import java.util.Scanner;

    public class AlgorithmsPractice2 {
        static Scanner sc = new Scanner(System.in);
        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) {
            String typeOfAlgo = sc.next();
            int n = sc.nextInt();
            int tasks = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            switch (typeOfAlgo) {
                case "PrefixSum":
                    PrefixSum(nums, tasks);
                    break;

                case "BinarySearch":
                    BinarySearch(nums, tasks);
                    break;
            }
            System.out.println(sb);
        }

        static void PrefixSum(int[] nums, int tasks) {
            int[] pfs = new int[nums.length];
            for (int i = 0; i < pfs.length; i++) {
                if (i == 0) {
                    pfs[i] = nums[i];
                } else {
                    pfs[i] = pfs[i - 1] + nums[i];
                }
            }

            for (int t = 0; t < tasks; t++) {
                int left = sc.nextInt();
                int right = sc.nextInt();

                if (left == 0) {
                    sb.append(pfs[right]).append("\n");
                } else {
                    sb.append(pfs[right] - pfs[left - 1]).append("\n");
                }
            }
        }

        static void BinarySearch(int[] nums, int tasks) {
            for (int t = 0; t < tasks; t++) {
                int target = sc.nextInt();
                int low = 0;
                int high = nums.length-1;
                int ans = -1;
                while (low <= high) {
                    int mid = low + (high - low ) / 2;
                    if (nums[mid] == target) {
                        ans = mid;
 
                        break;
                    }
                    else if (nums[mid] > target) {
                        high = mid -1;
                    }
                    else low = mid +1;
                }
                sb.append(ans).append("\n");
            }
        }
    }
