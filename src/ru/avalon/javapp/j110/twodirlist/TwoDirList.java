package ru.avalon.javapp.j110.twodirlist;

public class TwoDirList {
    private ListItem head;
    private ListItem tail;

    public void addToHead(Object val) {
        if (head != null) {
            ListItem nh = new ListItem(val); // (1)
            nh.next = head;
            head.prev = nh;
            head = nh;
        } else {
            head = tail = new ListItem(val);

        }

    }

    public Object peekFromHead() {
        if (head != null)
            return head.value;
        else
            return null;
    }

    public Object removeFromHead() {
        if (head == null)
            return null;

        Object res = head.value;
        head = head.next;  // (1)
        if (head == null) {
            tail = null;
        }

        return res;

    }

    public void addToTail(Object val) {
        if (tail != null) {
            ListItem nt = new ListItem(val);
            tail.next = nt;// (1)
            nt.prev = tail;
            tail = nt;

        } else
            head = tail = new ListItem(val);
    }

    public Object peekFromTail() {
        if (tail != null)
            return tail.value;
        else
            return null;
    }

    public Object removeFromTail() {
        if (tail == null)
            return null;

        Object res = tail.value;
        tail = tail.prev;

        if (tail == null)
            head = null;

        return res;

    }

    public boolean contains(Object val) {
        ListItem li = head;
        while (li != null) {
            if (li.value == null && val == null
                    || li.value != null && li.value.equals(val))
                return true;
            li = li.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printContent() {
        ListItem li = head;
        while (li != null) {
            System.out.println(li.value);
            li = li.next;
        }
        System.out.println();
    }

    private static class ListItem {
        Object value;
        ListItem next;
        ListItem prev;

        ListItem(Object value) {
            this.value = value;
        }
    }
}
