package test;

import extthread.ThreadA;
import extthread.ThreadB;
import service.HasSelfPrivateNum;

public class Run {
// 先异步，后同步，同步时持有对象锁，并打上标记ACC_SYNCHRONIZED
    public static void main(String[] args) {

        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef);
        athread.start();

        ThreadB bthread = new ThreadB(numRef);
        bthread.start();

    }

}
/**
 * 查看字节码
 *
 * PS E:\ProgramBooks\Java\JavaMultiThreadedDesignPattern\Multithreading\Chapter2\t2\target\classes\test> javap -c -v Test.class
 * Classfile /E:/ProgramBooks/Java/JavaMultiThreadedDesignPattern/Multithreading/Chapter2/t2/target/classes/test/Test.class
 *   Last modified 2023年4月3日; size 493 bytes
 *   SHA-256 checksum 360490a66b1834177485535f11a3f5fa5d720fbbfd20a2048bbb85a69a2d200b
 *   Compiled from "Test.java"
 * public class test.Test
 *   minor version: 0
 *   major version: 61
 *   flags: (0x0021) ACC_PUBLIC, ACC_SUPER
 *   this_class: #8                          // test/Test
 *   super_class: #2                         // java/lang/Object
 *   interfaces: 0, fields: 0, methods: 3, attributes: 1
 * Constant pool:
 *    #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
 *    #2 = Class              #4             // java/lang/Object
 *    #3 = NameAndType        #5:#6          // "<init>":()V
 *    #4 = Utf8               java/lang/Object
 *    #5 = Utf8               <init>
 *    #6 = Utf8               ()V
 *    #7 = Methodref          #8.#9          // test/Test.testMethod:()V
 *    #8 = Class              #10            // test/Test
 *    #9 = NameAndType        #11:#6         // testMethod:()V
 *   #10 = Utf8               test/Test
 *   #11 = Utf8               testMethod
 *   #12 = Utf8               Code
 *   #13 = Utf8               LineNumberTable
 *   #14 = Utf8               LocalVariableTable
 *   #15 = Utf8               this
 *   #16 = Utf8               Ltest/Test;
 *   #17 = Utf8               main
 *   #18 = Utf8               ([Ljava/lang/String;)V
 *   #19 = Utf8               args
 *   #20 = Utf8               [Ljava/lang/String;
 *   #21 = Utf8               Exceptions
 *   #22 = Class              #23            // java/lang/InterruptedException
 *   #23 = Utf8               java/lang/InterruptedException
 *   #24 = Utf8               SourceFile
 *   #25 = Utf8               Test.java
 * {
 *   public test.Test();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 3: 0
 *       LocalVariableTable:
 *         Start  Length  Slot  Name   Signature
 *             0       5     0  this   Ltest/Test;
 *
 *   public static synchronized void testMethod();
 *     descriptor: ()V
 *     flags: (0x0029) ACC_PUBLIC, ACC_STATIC, ACC_SYNCHRONIZED
 *     Code:
 *       stack=0, locals=0, args_size=0
 *   public static void main(java.lang.String[]) throws java.lang.InterruptedException;
 *     descriptor: ([Ljava/lang/String;)V
 *     flags: (0x0009) ACC_PUBLIC, ACC_STATIC
 *     Code:
 *       stack=0, locals=1, args_size=1
 *          0: invokestatic  #7                  // Method testMethod:()V
 *          3: return
 *       LineNumberTable:
 *         line 9: 0
 *         line 10: 3
 *       LocalVariableTable:
 *         Start  Length  Slot  Name   Signature
 *             0       4     0  args   [Ljava/lang/String;
 *     Exceptions:
 *       throws java.lang.InterruptedException
 * }
 * SourceFile: "Test.java"
 */