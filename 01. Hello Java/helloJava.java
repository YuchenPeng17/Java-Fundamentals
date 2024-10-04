class helloJava {
    /* 2.1 */
    public static void main(String[] args){
        System.out.println("Hello Java");

        System.out.println("Chapter1: Number");
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        System.out.println(10 / 3);                     //int 类型，只保留 3
        System.out.println(10.0 / 3);                   //方法1：切换 double 类型
        System.out.println((double)10 / 3);             //方法2：切换 double 类型
        System.out.println(10 % 3);                     //mod
        
    }
}

/*
1.javac <FILE>.java编译，java <FILE> 运行
2.文件由类构成，类的名称与文件同名。
    2.1）类中按照固定格式写好 main 方法作为程序的入口。
3.可以通过给整数之后加上 .0 或者 之前加上 (double) 使计算结果变成小数，浮点类型。
*/