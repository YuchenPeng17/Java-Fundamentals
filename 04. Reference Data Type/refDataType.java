// 引入 java 数组工具类
import java.util.Arrays;

class refDataType {
    public static void main(String[] args){
        // Initializing arrays
        int[] numArr1 = {1, 2, 3};  // 初始化数组，直接赋值
        int[] numArr2 = new int[3]; // 创建一个长度为3的int数组，默认值为0
        int[] numArr3 = new int[]{1, 2, 3}; // 使用new关键字并初始化数组

        System.out.println(numArr1); // 打印数组对象的引用地址
        System.out.println(Arrays.toString(numArr3)); // 打印数组元素内容，格式化输出

        // Character array example
        char[] charArr1 = {'a', 'b', 'c'}; // 字符数组初始化
        System.out.println(charArr1[0]); // 输出字符数组的第一个元素 'a'
        System.out.println(charArr1[1]); // 输出字符数组的第二个元素 'b'
        System.out.println(charArr1.length); // 输出字符数组的长度 3

        // Array copying and extending
        int[] numArr4 = Arrays.copyOf(numArr3, 5); // 将numArr3复制到numArr4，长度设为5
        numArr4[3] = 4; numArr4[4] = 5; // 为numArr4的第四和第五个元素赋值
        System.out.println(Arrays.toString(numArr4)); // 打印扩展后的数组

        // String manipulation
        String str1 = "abc" + "-def" + "-ghi"; // 字符串拼接
        int str1Length = str1.length(); // 获取字符串长度
        System.out.println("String: " + str1 + " Length is: " + str1Length); // 输出字符串和长度

        // Searching in a string
        String str2 = "ef";
        String str3 = "XX";
        System.out.println("Index of " + str2 + ": " + str1.indexOf(str2)); // 查找字符串str2在str1中的位置
        System.out.println("Index of " + str3 + ": " + str1.indexOf(str3)); // 查找字符串str3在str1中的位置（找不到返回-1）

        // String replacement and joining
        String str4 = str1;
        System.out.println(str4.replace("ghi", "xyz")); // 替换子字符串
        System.out.println(str4.join("~", str4.split("-"))); // 按“-”分割字符串，并用“~”连接
    }
}

/*
1.存储在堆（heap）内存中的对象。引用类型不直接保存值，而是保存指向对象的引用（地址）
*/