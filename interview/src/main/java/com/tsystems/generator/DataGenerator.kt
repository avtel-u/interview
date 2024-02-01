package com.tsystems.generator

import com.tsystems.data.StockData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.time.LocalDateTime

/**
 * Simulates real-time stock data generation.
 *
 * @property generationInterval The time in milliseconds between each data generation.
 */
class DataGenerator(
        private val generationInterval: Long = 1000L // Default to 1 second intervals
) {

    /**
     * Generates a flow of StockData objects at specified intervals.
     *
     * @return A Flow<StockData> that emits new stock data periodically.
     */
    fun generateData(): Flow<StockData> = flow {
        val random = java.util.Random()
        while (true) { // Infinite loop to simulate continuous data generation
            val stockData = StockData(
                    // TODO: random symbol from weighted randomizer
                    symbol = "AAPL", // For simplicity, using a hardcoded stock symbol
                    // TODO: should be generated with semi-normal distribution
                    price = random.nextDouble() * 100, // Generate a random stock price
                    timestamp = LocalDateTime.now() // Capture the current timestamp
            )
            emit(stockData) // Emit the newly generated stock data to the flow
            // TODO: randomized intervals
            delay(generationInterval) // Wait for the specified interval before generating the next data point
        }
    }
}