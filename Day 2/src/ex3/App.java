package ex3;

public class App {

    public static void main(String[] args) {
        File f1 = new File("aaa");
        File f2 = new File("bbb");
        File f3 = new File("ccc");
        File f4 = new File("ddd");
        File f5 = new File("eee");
        File f6 = new File("fff");

        Folder myfolder1 = new Folder("fld1");
        myfolder1.add(f1);
        myfolder1.add(f2);
        myfolder1.add(f3);
        myfolder1.add(f4);

        Folder myfolder2 = new Folder("fld2");
        myfolder2.add(f5);
        myfolder2.add(f6);

        myfolder1.add(myfolder2);

        myfolder1.whoAmI();


    }
}
