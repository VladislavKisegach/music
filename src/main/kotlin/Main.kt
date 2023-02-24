@file:Suppress("IMPLICIT_CAST_TO_ANY")

fun main() {
    val sumPay = 20000
    val mounth = 2
    val discont = 100
    val discont2 = 5
    val vipClient = mounth>1
    val discont3 = 1
    val result = if (1000< sumPay&&vipClient) sumPay-(((sumPay-discont)/100)*1) else if(sumPay>10000&&vipClient) sumPay-(sumPay*60) else if(sumPay<1000&&vipClient) (sumPay/100)*1 else if(sumPay>1000&&sumPay<10000) sumPay-discont else if(sumPay>10000) sumPay-sumPay/50 else sumPay

    println(result)




}
