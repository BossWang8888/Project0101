package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author Bosswang
 * @create 2019-01-24-13:52
 */
public class Women {
    //模板六：prsf :可生成 private static final
    private static final Customer cust = new Customer();
    //变形：psfi
    public static final  int num=1;
    //变形：psfs
    public static final String NATION = "china";
    //模板一：psvm
    public static void main(String[] args) {
        //模板二 ：sout
        System.out.println();
        //变形：soutp (p代表形参)/ soutm(m代表方法名字) / soutv（v代表变量名） /xxx.sout
        System.out.println("args = [" + args + "]");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
            
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
            
        }
        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);
        for (Object o : list) {
            
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    public void test (){
        System.out.println("Women.test");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);
        //模板五:ifn
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }
        //变形:xxx.nn  /   xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }
}
