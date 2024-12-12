/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import java.util.concurrent.LinkedBlockingQueue

class InformativeBlockingQueue<E>(val capacity: Int) : LinkedBlockingQueue<E>(capacity) { }

typealias Java_Queue<E> = InformativeBlockingQueue<E>
typealias MPSC_Queue<E> = InformativeBlockingQueue<E>
typealias SPSC_Queue<E> = InformativeBlockingQueue<E>

class App {
    val q1 = Java_Queue<String>(10)

    val q2 = MPSC_Queue<String>(10)

    val q3 = SPSC_Queue<String>(10)

    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().q1.size)
    println(App().q2.size)
    println(App().q3.size)
}
