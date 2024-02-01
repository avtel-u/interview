package com.tsystems.data

import java.time.LocalDateTime

/**
 * Represents a single unit of stock data.
 *
 * @property symbol The stock symbol (e.g., "AAPL" for Apple Inc.).
 * @property price The current price of the stock.
 * @property timestamp The time at which this stock data was generated or received.
 */
data class StockData(
        val symbol: String,
        val price: Double,
        val timestamp: LocalDateTime
)