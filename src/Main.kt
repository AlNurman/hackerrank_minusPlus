import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
	// Write your code here
	var count_zero = 0.0
	var count_minus = 0.0
	var count_plus = 0.0
	for(i in 0 until arr.size){
		if(arr[i]==0)count_zero++
		if(arr[i]<0)count_minus++
		if(arr[i]>0)count_plus++
	}
	println(String.format("%.6f", count_plus/arr.size))
	println(String.format("%.6f", count_minus/arr.size))
	println(String.format("%.6f", count_zero/arr.size))
}

fun main(args: Array<String>) {
	//val n = readLine()!!.trim().toInt()

	val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	plusMinus(arr)
}
