package test;

/**
 * Java字节码中的 `monitorenter` 和 `monitorexit` 指令是用于实现同步的指令。
 * 在Java中， `synchronized` 关键字用于实现多个线程之间的同步，而在字节码中使用 `monitorenter` 和 `monitorexit` 指令来实现 `synchronized` 关键字的效果。
 * 当一个线程开始执行 `synchronized` 块时，它必须获取对象的锁，以保证该对象在同一时间只被一个线程执行。
 * 这个锁可以被看做是一个监视器，进入和退出监视器的过程就是使用 `monitorenter` 和 `monitorexit` 指令来实现的。
 * java字节码中使用monitorenter和monitorexit指令是为了实现对象的同步锁机制。
 * monitorenter指令用于获取对象的监视器锁，monitorexit指令用于释放对象的监视器锁。
 * 这两个指令主要和java并发关键字synchronized在jvm层指令的实现有关系，
 * 但是synchronized方法的实现并没有采用这两个指令，而是由jvm的方法调用和返回指令隐式地处理。
 * 每个java对象都有一个与之关联的监视器，它包含了一些运行时数据，如锁状态标志、线程持有的锁、重入计数等。
 * 当线程试图获取对象的监视器锁时，它会检查监视器的状态，如果没有被其他线程占用，就可以成功获取并设置自己为锁的拥有者；
 * 如果已经被其他线程占用，就会阻塞直到锁被释放；
 * 如果已经被自己占用，就会增加重入计数。
 * 当线程释放对象的监视器锁时，它会减少重入计数，如果计数为零，就会释放锁并唤醒一个等待的线程。
 * 如果对象引用为空，monitorenter和monitorexit指令会抛出NullPointerException异常。
 */
public class Test2 {
    // 字节码中使用monitorenter和monitorexit指令进行同步处理
    // 弄了一个监视器对象
    public void myMethod() {
        synchronized (this) {
            int age = 100;
        }
    }

    /*public void myMethod();
    descriptor: ()V
    ags: ACC_PUBLIC
    Code:
    stack=2, locals=3, args_size=1
    0: aload_0
    1: dup
    2: astore_1
    3: monitorenter
    4: bipush 100
    6: istore_2
    7: aload_1
    8: monitorexit
    9: goto 15
    12: aload_1
    13: monitorexit
    14: athrow
    15: return*/
    // 字节码中使用monitorenter和monitorexit指令进
    //行同步处理
    public static void main(String[] args) throws
            InterruptedException {
        Test2 test = new Test2();
        test.myMethod();
    }
}


/*
    PS E:\ProgramBooks\Java\JavaMultiThreadedDesignPattern\Multithreading\Chapter2\t2\target\classes\test>javap-c-v Test2.

class
Classfile /E:/ProgramBooks/Java/JavaMultiThreadedDesignPattern/Multithreading/Chapter2/t2/target/classes/test/Test2.

class
Last modified 2023年4月3日;size 660bytes
        SHA-256checksum f9902e348e04a15c04ec4558638f2ed38e90815dd23025e0c7a926811ae0e0c5
        Compiled from"Test2.java"

public class test.Test2
        minor version:0
        major version:61
        flags:(0x0021)ACC_PUBLIC,ACC_SUPER
        this_class: #7                          // test/Test2
        super_class: #2                         // java/lang/Object
        interfaces:0,fields:0,methods:3,attributes:1
        Constant pool:
        #1=Methodref          #2.#3          // java/lang/Object."<init>":()V
        #2=Class              #4             // java/lang/Object
        #3=NameAndType        #5:#6          // "<init>":()V
        #4=Utf8 java/lang/Object
        #5=Utf8<init>
   #6=Utf8()V
           #7=Class              #8             // test/Test2
           #8=Utf8 test/Test2
           #9=Methodref          #7.#3          // test/Test2."<init>":()V
           #10=Methodref          #7.#11         // test/Test2.myMethod:()V
           #11=NameAndType        #12:#6         // myMethod:()V
           #12=Utf8 myMethod
           #13=Utf8 Code
           #14=Utf8 LineNumberTable
           #15=Utf8 LocalVariableTable
           #16=Utf8 this
           #17=Utf8 Ltest/Test2;
           #18=Utf8 StackMapTable
           #19=Class              #20            // java/lang/Throwable
           #20=Utf8 java/lang/Throwable
           #21=Utf8 main
           #22=Utf8([Ljava/lang/String;)V
           #23=Utf8 args
           #24=Utf8[Ljava/lang/String;
           #25=Utf8 test
           #26=Utf8 Exceptions
           #27=Class              #28            // java/lang/InterruptedException
           #28=Utf8 java/lang/InterruptedException
           #29=Utf8 SourceFile
           #30=Utf8 Test2.java
           {
public test.Test2();
        descriptor:()V
        flags:(0x0001)ACC_PUBLIC
        Code:
        stack=1,locals=1,args_size=1
        0:aload_0
        1:invokespecial #1                  // Method java/lang/Object."<init>":()V
        4:return
        LineNumberTable:
        line 3:0
        LocalVariableTable:
        Start Length Slot Name Signature
        0 5 0this Ltest/Test2;

public void myMethod();
        descriptor:()V
        flags:(0x0001)ACC_PUBLIC
        Code:
        stack=2,locals=4,args_size=1
        0:aload_0
        1:dup
        2:astore_1
        3:monitorenter
        4:bipush 100
        6:istore_2
        7:aload_1
        8:monitorexit
        9:goto 17
        12:astore_3
        13:aload_1
        14:monitorexit
        15:aload_3
        16:athrow
        17:return
        Exception table:
        from to target type
        4 9 12any
        12 15 12any
        LineNumberTable:
        line 5:0
        line 6:4
        line 7:7
        line 8:17
        LocalVariableTable:
        Start Length Slot Name Signature
        0 18 0this Ltest/Test2;
        StackMapTable:number_of_entries=2
        frame_type=255 */
/* full_frame *//*

        offset_delta=12
        locals=[

class test/Test2,

class java/lang/Object]
        stack=[

class java/lang/Throwable]
        frame_type=250 */
/* chop *//*

        offset_delta=4

public static void main(java.lang.String[])throws java.lang.InterruptedException;
        descriptor:([Ljava/lang/String;)V
        flags:(0x0009)ACC_PUBLIC,ACC_STATIC
        Code:
        stack=2,locals=2,args_size=1
        0:new           #7                  // class test/Test2
        3:dup
        4:invokespecial #9                  // Method "<init>":()V
        7:astore_1
        8:aload_1
        9:invokevirtual #10                 // Method myMethod:()V
        12:return
        LineNumberTable:
        line 12:0
        line 13:8
        line 14:12
        LocalVariableTable:
        Start Length Slot Name Signature
        0 13 0args[Ljava/lang/String;
        8 5 1test Ltest/Test2;
        Exceptions:
        throws java.lang.InterruptedException
        }
        SourceFile:"Test2.java"
*/
