public class Main
{
	public static void main(String[] args) {
	           String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        new KMP_String_Matching().KMPSearch(pat, txt);
 
	}
}

class KMP_String_Matching {
    void KMPSearch(String path, String txt)
    {
        int M = path.length();
        int N = txt.length();
 
        // create lps array that will hold the longest prefix suffix values for pattern

        int lps[] = new int[M];
        int j = 0; // index for path[]
 
        // Preprocess the pattern (calculate lps[] array)
        computeLPSArray(path, M, lps);
 
        int i = 0; // index for txt[]
        while ((N - i) >= (M - j)) {
            if (path.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                                + "at index " + (i - j));
                j = lps[j - 1];
            }
 
            // mismatch after j matches
            else if (i < N && path.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }
 
    void computeLPSArray(String path, int M, int lps[])
    {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0
 
        // the loop calculates lps[i] for i = 1 to M-1
        while (i < M) {
            if (path.charAt(i) == path.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else // (path[i] != path[len])
            {
                if (len != 0) {
                    len = lps[len - 1];
 
                }
                else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}