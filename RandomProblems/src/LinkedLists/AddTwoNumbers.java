package LinkedLists;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(7);
		l2.next = new ListNode(3);
		System.out.println(addTwoNumbers(l1, l2).next.val);
	}
	

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode save = l1;
        int add = 0;
        ListNode prev = l1;
        while (l1 != null &&  l2 != null) {
        	System.out.println(l1.val + " " + l2.val);
            int out = l1.val + l2.val + add;
            l1.val = out % 10;
            add = out / 10;
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return save;
    }
    
    public static class ListNode {
    	 int val;
    	 ListNode next;
    	 ListNode(int x) { val = x; }
    }

}
