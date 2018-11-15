
public class Solution {
	public static void main(String[] args) {
		int[] A = {2, 3, 1, 5};
		System.out.println(solution(A));
	}
	public static int solution(int[] A) {
        boolean[] B = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            B[A[i] - 1] = true;
        }
        for(int i = 0; i < B.length; i++) {
            if (B[i] == false) return i + 1;
        }
        return 0;
    }

}
