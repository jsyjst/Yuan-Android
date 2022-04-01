package com.example.learnkt.top

import java.lang.Exception

sealed class Result
class Success(val msg: String) : Result()
class Fail(val error: Exception) : Result()
class Unknown(val unknown: String) : Result()