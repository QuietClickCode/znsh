package com.zjj.other.java.interview;

/**
 * @program: znsh
 * @description: 面试1
 * @author: zjj
 * @create: 2019-06-17 00:26:35
 **/
public class Interview1 {

    /**
     * Java 中能创建 volatile 数组吗？
     */



    /**
     * 能，Java 中可以创建 volatile 类型数组，
     * 不过只是一个指向数组的引用，而不是整个数组。我的意思是，
     * 如果改变引用指向的数组，将会受到 volatile 的保护，
     * 但是如果多个线程同时改变数组的元素，volatile 标示符就不能起到之前的保护作用了。
     *
     */


    /**
     *  1.volatile简介
     * volatile就是表示某人或某物是不稳定的、易变的。
     *
     * volatile作为java中的关键词之一，用以声明变量的值可能随时会别的线程修改，
     * 使用volatile修饰的变量会强制将修改的值立即写入主存，
     * 主存中值的更新会使缓存中的值失效(非volatile变量不具备这样的特性
     * ，非volatile变量的值会被缓存，线程A更新了这个值，
     * 线程B读取这个变量的值时可能读到的并不是是线程A更新后的值)。volatile会禁止指令重排。
     *
     *
     * 禁止指令重排
     * 主存，缓存，立即，
     *
     * volatile具有可见性、有序性，不具备原子性。
     *
     *
     * 原子性：如果你了解事务，那这个概念应该好理解。
     * 原子性通常指多个操作不存在只执行一部分的情况，如果全部执行完成那没毛病，
     * 如果只执行了一部分，那对不起，你得撤销(即事务中的回滚)已经执行的部分。
     *
     * 要么一起全部执行成功 ，要么全部执行失败
     *
     * 可见性：当多个线程访问同一个变量x时，线程1修改了变量x的值，线程1、线程2...线程n能够立即读取到线程1修改后的值。
     *
     *有序性：即程序执行时按照代码书写的先后顺序执行。在Java内存模型中，允许编译器和处理器对指令进行重排序，但是重排序过程不会影响到单线程程序的执行，却会影响到多线程并发执行的正确性。(本文不对指令重排作介绍，但不代表它不重要，它是理解JAVA并发原理时非常重要的一个概念)。
     *
     *
     * .volatile适用场景
     *
     *适用于读多写少的场景。
     *
     *可用作状态标志。
     *
     *JDK中volatie应用：JDK中ConcurrentHashMap的Entry的value和next被声明为volatile，AtomicLong中的value被声明为volatile。AtomicLong通过CAS原理(也可以理解为乐观锁)保证了原子性。
     * volatile不会让线程阻塞，响应速度比synchronized高，这是它的优点。
     *
     *volatile是Java提供的一种轻量级的同步机制，在并发编程中，它也扮演着比较重要的角色。同synchronized相比（synchronized通常称为重量级锁），volatile更轻量级，相比使用synchronized所带来的庞大开销，倘若能恰当的合理的使用volatile，自然是美事一桩
     *
     *
     *
     *
     */










}
