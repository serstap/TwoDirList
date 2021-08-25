package ru.avalon.javapp.j110.twodirlist;

public class Main {

    public static void main(String[] args) {
        TwoDirList lst = new TwoDirList();
        lst.addToTail("str1");
        lst.addToTail("str2");
        lst.addToTail("str3");
        lst.addToTail("str4");
        lst.addToTail("str5");
        lst.printContent();

        lst.addToHead("head1");
        lst.addToHead(3.1415926);
        lst.addToTail("fin");
      //  lst.removeFromHead();
      //  lst.removeFromTail();
       // lst.addToTail("str7");
        lst.printContent();

        lst.removeFromHead();
        lst.removeFromTail();
   //     lst.addToTail("str7");
        lst.printContent();


     //   lst.addToTail("str8");
        lst.removeFromTail();
        lst.printContent();
    }
}
