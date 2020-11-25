package com.xiyou3g.pojo;

public class UserT {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserT()
    {
        System.out.println("UserT被创建了");
    }
    public void show()
    {
        System.out.println();
        System.out.println("==========UserT===========");

        if(name!=null)
            System.out.println("<name: "+name+" >");

        System.out.println("==========================");
        System.out.println();
    }
}
