package com.xiyou3g.pojo;

public class User {
    private int id=0;
    private String name;
    private int age;





    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show()
    {
        System.out.println();
        System.out.println("===========User===========");
        if(id!=0)
            System.out.println("<id: "+id+" >");
        if(name!=null)
            System.out.println("<name: "+name+" >");
        if(age!=0)
            System.out.println("<age: "+age+" >");
        System.out.println("==========================");
        System.out.println();
    }

    public User()
    {
        System.out.println("执行User无参构造...");
    }


    public User(int id)
    {
        this.id=id;
        System.out.println("执行User有参构造...");
    }

    public User(String name){
        this.name=name;
        System.out.println("执行User有参构造...");
    }

    public User(int id,int age)
    {
        this.id=id;
        this.age=age;
        System.out.println("执行User有参构造...");
    }

    public User(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("执行User有参构造...");
    }

    public User(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
        System.out.println("执行User有参构造...");
    }
}
