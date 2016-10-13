package Leetcode;

public class Test25 {
	
	public ListNode findnext(ListNode prior,int k){
		ListNode node=prior;
		while(node.next!=null&&k>0){
			node=node.next;
			k--;
		}
		return k==0?node:null;
	}
	
	public ListNode reverse(ListNode head,ListNode tail){
		ListNode node=head.next,next,pre=tail.next,res=node;
		head.next=tail;
		while(node!=tail){
			next=node.next;
			node.next=pre;
			pre=node;
			node=next;
		}
		node.next=pre;
		return res;
	}
	
	public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k<=0)
        	return head;
        ListNode listhead=new ListNode(0),prior=listhead,rear=null,node=listhead.next;
        listhead.next=head;
        while((rear=findnext(prior,k))!=null){
        	prior=reverse(prior,rear);
        }
        return listhead.next;
    }

	public static void main(String[] args) {
		Test25 test=new Test25();
		int[] arr=new int[]{1,2,3,4,5,6,7,8};
		ListNode list=GetInstance.GetListNode(arr, 0, arr.length-1);
		list=test.reverseKGroup(list, 10);
		PrintResult.printlist(list);

	}

}
