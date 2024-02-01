package com.tsystems.processing

import com.tsystems.data.StockData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter

/**
 * A concrete implementation of ProcessorInterface for stock data.
 * Allows configuration of processing behavior through constructor parameters.
 *
 * @property minPriceFilter The minimum price a stock must have to be included in the processed data.
 */
class StockDataProcessor(
        // TODO: more flexible configuration
        private val minPriceFilter: Double = 0.0 // Default filter parameter
) : Processor {

    /**
     * Processes the incoming flow of StockData based on the configured filters.
     *
     * @param inputData The flow of StockData objects to be processed.
     * @return A flow of StockData objects that meet the filter criteria.
     */
    override fun process(inputData: Flow<StockData>): Flow<StockData> {
        // TODO: compare price with current average for the symbol
        return inputData.filter { stockData -> stockData.price >= minPriceFilter }
    }
}