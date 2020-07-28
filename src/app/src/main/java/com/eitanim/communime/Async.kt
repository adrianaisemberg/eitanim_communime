package com.eitanim.communime

import kotlinx.coroutines.*

fun async(block: suspend CoroutineScope.() -> Unit) = GlobalScope.launch(
    block = block
)

fun async_io(block: suspend CoroutineScope.() -> Unit) = GlobalScope.launch(
    context = Dispatchers.IO,
    block = block
)

fun async_ui(block: suspend CoroutineScope.() -> Unit) = GlobalScope.launch(
    context = Dispatchers.Main,
    block = block
)

suspend fun <T> async_return(block: suspend CoroutineScope.() -> T): T = withContext(
    context = Dispatchers.Default,
    block = block
)

suspend fun <T> async_io_return(block: suspend CoroutineScope.() -> T): T = withContext(
    context = Dispatchers.IO,
    block = block
)

suspend fun <T> async_ui_return(block: suspend CoroutineScope.() -> T): T = withContext(
    context = Dispatchers.Main,
    block = block
)
