package dataStructure.sort;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @desc 得到第K小第数字(不能用线程第函数脚本，时间复杂度不能是n^2)
 * @author hongfenlv
 * @date 2020-07-20 下午1:37
 */
public class QuikSort {

  /**
   * 分治算法，时间复杂度nlogn
   *
   * @param arr
   * @param k
   * @return
   */
  public static int findKth(int[] arr, int k) {
    if (arr.length <= 0 || k <= 0 || k > arr.length) {
      return 0;
    }
    // 得到所有奇数
    List<Integer> array2 = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        array2.add(arr[i]);
      }
    }
    if (array2.size() < k) {
      return 0;
    }
    int[] result = array2.stream().mapToInt(Integer::intValue).toArray();
    quikSort(result, 0, array2.size()-1);
    return result[k-1];
  }

  /**
   * 快速排序（分治算法）
   * @param arr
   * @param low
   * @param high
   */
  public static void quikSort(int[] arr, int low, int high) {
    if (low < high) {
      int index = getIndex(arr, low, high);
      quikSort(arr, low, index - 1);
      quikSort(arr, index + 1, high);
    }
  }
  private static int getIndex(int[] arr, int low, int high) {
    // 基准数据
    int tmp = arr[low];
    while (low < high) {
      // 当队尾的元素大于等于基准数据时,向前挪动high指针
      while (low < high && arr[high] >= tmp) {
        high--;
      }
      arr[low] = arr[high];
      while (low < high && arr[low] <= tmp) {
        low++;
      }
      arr[high] = arr[low];
    }
    arr[low] = tmp;
    return low;
  }
  public static void main(String[] args) {
    int[] arr = new int[] {4, 7, 6, 5, 3, 2, 8, 1};
    int i=QuikSort.findKth(arr,5);
    System.out.println(i);
    System.out.println("def");
    System.out.println("def");
    System.out.println("def");
    System.out.println("def");
    int result=2^3;
            int result2=2 << 3;
    System.out.println(result);
    System.out.println(result2);
    System.out.println(Math.pow(2,3));
    System.out.println(8 << 1);
    System.out.println("hello"=="hello");
    System.out.println(new String("hello")==new String("hello"));
    Hashtable hashtable=new Hashtable();
//    hashtable.put();
    HashMap hashMap=new HashMap();
    hashMap.put("abc","abc");
//    HashMap hashMap1=new ConcurrentHashMap<>();
//    hashMap1.put();


    LinkedList linkedList=new LinkedList();

//    ExecutorService executorService= Executors.newSingleThreadExecutor();
    String str=null;
    System.out.println(String.valueOf(str));
//    executorService.execute();
//    executorService.submit()
    int b=10 >>1;
    System.out.println(b);
    ReentrantLock lock=new ReentrantLock();

  }
}
