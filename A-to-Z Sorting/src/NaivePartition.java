/*
 * import java.util.Arrays;
 * 
 * public class NaivePartion_Final {
 * 
 * public static void main(String[] args) { int a[] = { 5, 13, 6, 9, 12, 11,
 * 8,7}; //Arrays.sort(a); int l = 0; int n1 = a.length - 1; int p = 6;//
 * {1,2,12,} navParti(a, p, n1, l);
 * 
 * }
 * 
 * private static void navParti(int[] a, int p, int n1, int l) { int temp[] =
 * new int[n1 - l + 1]; int index = 0; for (int i = l; i <= n1; i++) { if (a[i]
 * <= a[p]) { temp[index] = a[i]; index++; } } for (int i = l; i <= n1; i++) {
 * if (a[i] > a[p]) { temp[index] = a[i]; index++; } } for (int i = l; i <=n1 ;
 * i++) { a[i]=temp[i-l]; } for (int i = 0; i <=n1 ; i++) {
 * System.out.print(a[i]+" "); } }
 * 
 * }
 * 
 * 
 * import java.util.Arrays;
 * 
 * public class NaivePartition {
 * 
 * public static void main(String[] args) { int a[] = { 5, 13, 6, 9, 12, 11, 8,
 * 7 }; int p = 6; navParti(a, p, 0, a.length - 1);
 * System.out.println(Arrays.toString(a)); }
 * 
 * private static void navParti(int[] a, int p, int l, int r) { int temp[] = new
 * int[r - l + 1]; int index = 0;
 * 
 * // Move partition index element to end of array swap(a, p, r);
 * 
 * for (int i = l; i <= r; i++) { if (a[i] <= a[r]) { temp[index] = a[i];
 * index++; } } int partitionIndex = index; for (int i = l; i <= r; i++) { if
 * (a[i] > a[r]) { temp[index] = a[i]; index++; } }
 * 
 * // Move partition index element to correct position swap(temp, partitionIndex
 * - 1, r);
 * 
 * for (int i = l; i <= r; i++) { a[i] = temp[i - l]; } }
 * 
 * private static void swap(int[] a, int i, int j) { int temp = a[i]; a[i] =
 * a[j]; a[j] = temp; } }
 */