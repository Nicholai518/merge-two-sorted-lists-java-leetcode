public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // create our own head node
        ListNode tempNode = new ListNode(0);

        // node that we will use / work with
        ListNode currentNode = tempNode;

        // while neither list / node is null, find which val is less
        // add lesser val currentNode.next
        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                currentNode.next = list1;

                // traverse to next node
                list1 = list1.next;
            }
            // if the values are equal, this else statement will add the val from list2
            else {
                currentNode.next = list2;

                // traverse to next node
                list2 = list2.next;
            }
            // update currentNode
            currentNode = currentNode.next;
        }

        // if the lists do not have the same amount of nodes
        // or
        // there are still nodes left in only one of the lists
        if (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }

        // return the newly sorted LinkedList
        return tempNode.next;
    }
}
