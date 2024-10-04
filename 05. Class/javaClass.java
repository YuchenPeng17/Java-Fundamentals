class javaClass {
    public static void main(String[] args){
        Animal a1 = new Animal("Ink", 4);
        a1.sayHi();
        a1.eat();

        Cat c1 = new Cat("Cup", 2, "Yellow");
        c1.sayHi();
        c1.eat();
        c1.eat("fish");
    }
}

class Animal {
    protected String name = "Default Animal";
    protected int age = 0;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    /* getter 和 setter 函数接口 */
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        return;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
        return;
    }
    /* 类的功能方法 */
    public void sayHi(){
        System.out.println("Hello, I am " + this.name + ", I am " + this.age + " years old.");
        return;
    }
    public void eat(){
        System.out.println(this.name + " is eating.");
        return;
    }
}

class Cat extends Animal {
    private String skinColor = "Default Color";
    public Cat (String name, int age, String skinColor) {
        super(name, age);
        this.skinColor = skinColor;
    }
    /* 多态：子类使用继承方法时，具备与父类不同的功能 */
    //方法1：Override
    @Override
    public void sayHi(){
        System.out.println("Meow, I am a cat, my name is " + this.name + ", I am " + this.age + " years old.");
        return;
    }
    //方法2：方法重载
    public void eat(String catFood){
        System.out.println("Meow, " + this.name + " is eating " + catFood + " .");
        return;
    }


}

/*
1.信息的集合组成了抽象的概念 ———————— 类
2.填入信息就有了具体的 ———————— 实例对象
3.封装，继承，多态
*/