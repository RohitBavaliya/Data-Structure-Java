import java.util.HashSet;

public class IntersactionArrays {
    public static int interSection(int a[],int m,int b[],int n)
    {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(a[i]);
        }
        for (int j = 0; j < n; j++) {
            if(set.contains(b[j]))
                count++;
            
        }

        return count;
    }
    public static void main(String[] args) {
        int a[] = {1,2,2,4,5};
        int b[] = {1,2,2};
        System.out.println(interSection(a, 5, b, 3));
         
    }
}
