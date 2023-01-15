package com.vmutafov

import org.graalvm.nativeimage.IsolateThread
import org.graalvm.nativeimage.c.function.CEntryPoint

@CEntryPoint(name = "graal_multiply")
fun multiply(isolateThread: IsolateThread, a: Int, b: Int): Int {
    return a * b
}
