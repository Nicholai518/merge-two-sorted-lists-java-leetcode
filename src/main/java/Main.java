public class Main {
    public static void main(String[] args) {
        ListNode listOne = new ListNode(1);
        listOne.next = new ListNode(2);
        listOne.next.next = new ListNode(4);

        ListNode listTwo = new ListNode(1);
        listTwo.next = new ListNode(3);
        listTwo.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(listOne, listTwo);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
