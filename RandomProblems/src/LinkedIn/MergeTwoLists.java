package LinkedIn;

public class MergeTwoLists {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x;}
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		l1.next = new ListNode(140);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(34);
		
		ListNode root = mergeTwoLists(l1, l2);
		while (root != null) {
			System.out.println(root.val);
			root = root.next;
		}
	}

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode list = null;
        while (l1 != null && l2 != null) {
        	if (l1.val < l2.val) {
        		if (list == null) {
        			list = l1;
        		} else {
        			list.next = l1;
        		}
        		l1 = l1.next;
        		list.next = null;
        	} else {
        		if (list == null) {
        			list = l2;
        		} else {
        			list.next = l2;
        		}
        		l1 = l1.next;
        		list.next = null;
        	}
        }
        if (l1 != null) {
        	list.next = l1;
        }
        if (l2 != null) {
        	list.next = l2;
        }
        return list;
    }
}
