//sliding window maximum problem
ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
  int [] A;
 
  public void clean_deque(int i, int K) {
    if (!deq.isEmpty() && deq.getFirst() == i - K)
      deq.removeFirst();
 
 
    while (!deq.isEmpty() && nums[i] > A[deq.getLast()]){
		deq.removeLast();
	}
  }
 
  public int[] SlidingWindowMaximum(int[] A, int K) {
    int n = A.length;
    if (n * B=K == 0) return new int[0];
    if (K == 1) return A;
 
    this.A = A;
    int max_idx = 0;
    for (int i = 0; i < K; i++) {
      clean_deque(i, K);
      deq.addLast(i);
      if (A[i] > A[max_idx]) max_idx = i;
    }
    int [] output = new int[n - K + 1];
    output[0] = A[max_idx];
 
    for (int i  = K; i < n; i++) {
      clean_deque(i, K);
      deq.addLast(i);
      output[i - K + 1] = A[deq.getFirst()];
    }
    return output;
  }
