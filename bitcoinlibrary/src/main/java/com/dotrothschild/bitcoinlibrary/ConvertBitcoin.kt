package com.dotrothschild.bitcoinlibrary

class ConvertBitcoin {
    companion object {
        private val bitcoin: HashMap<String, Double> = hashMapOf(
            "Bitcoin" to 16586.90,
            "Therieum" to 1203.77,
            "Tether" to 1.00
        )
        fun getBitcoinValue(name: String): Double? {
            var result: Double? = null
            bitcoin.forEach {
                if (it.key == name) {
                    result = it.value
                }
            }
            return result
        }
    }
}