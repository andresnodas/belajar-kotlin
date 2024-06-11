package app

import data.Delegate
import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Eko")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Joko")
    baseDelegate.sayGoodbye("Budi")

    val delegate = Delegate(base)
    delegate.sayHello("Joko")
    delegate.sayGoodbye("Budi")
}