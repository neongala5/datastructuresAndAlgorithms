package com.carlos.datastructuresandalgorithms.LinkedList;

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answerNode = new ListNode(0);
        ListNode currentNode = answerNode;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else if(list1.val > list2.val) {
                currentNode.next = list2;
                list2 = list2.next;
            } else if(list1.val == list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            }
            currentNode = currentNode.next;
        }

        if(list1 == null && list2 != null) {
            currentNode.next = list2;
        }
        if(list2 == null && list1 != null) {
            currentNode.next =  list1;
        }
        if(list1 == null && list2 == null) {
            currentNode.next =  list1;
        }

        return answerNode.next;
    }
}
