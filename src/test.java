import java.util.ArrayList;

/**
 * @author chuanwei.liu
 * @date 2023/4/27 10:34
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrnew= new ArrayList<>();
        boolean flag =false; int result = 0;
        arrnew.add(880);
        arrnew.add(880);
        arrnew.add(880);
        arrnew.add(880);
        arrnew.add(883);
        for ( int num: arrnew) {
            for (int i = 2; i < num; i++) {
                if (num%i==0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(num+"111");
                result = num;

                break;
            }

        }
    //    System.out.println(result);
        YH yh = new YH();
        System.out.println(yh.generate(7));

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        l1.val=2;
        l1.next=l2;
        l2.val=4;
        l2.next=l3;
        l3.val=3;

        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode();
        l4.val=5;
        l4.next=l5;
        l5.val=6;
        l5.next=l6;
        l6.val=4;

        Solution solution =new Solution();
        int n = 26;
        int[][]logs = {{6,2},{5,4},{8,5},{5,9},{25,11},{23,18},{15,20},{17,33},{14,37},{19,43},{22,60},{14,63},{25,67},{0,68},{2,72},{18,73},{8,74},{5,79},{6,83},{0,84},{25,88},{24,89},{23,91},{20,92},{1,96},{2,97},{3,106},{24,107},{21,118},{12,120},{4,124},{22,125},{13,126},{1,132},{25,140},{21,141},{14,142},{20,143},{13,147},{20,151},{10,154},{19,155},{8,158},{14,160},{25,163},{17,165},{19,166},{25,171},{19,174},{6,175},{7,179},{25,180},{12,181},{21,185},{22,187},{11,192},{20,197}};
        int i = solution.hardestWorker(n, logs);
        System.out.println(i);

    }
}
