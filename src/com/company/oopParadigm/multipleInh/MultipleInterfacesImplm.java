package com.company.oopParadigm.multipleInh;

public class MultipleInterfacesImplm implements Printable, Showable {
    @Override
    public void show() {
        System.out.println("turye showw");
    }
    public void print(){
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        MultipleInterfacesImplm multipleInterfacesImplm = new MultipleInterfacesImplm();
        multipleInterfacesImplm.print();
        multipleInterfacesImplm.show();
    }

}
