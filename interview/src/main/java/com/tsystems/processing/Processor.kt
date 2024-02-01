package com.tsystems.processing

import com.tsystems.data.StockData
import kotlinx.coroutines.flow.Flow

/**
 * Interface defining the contract for data processing.
 */
interface Processor {

    /**
     * Processes incoming stock data asynchronously.
     *
     * @param inputData The flow of StockData objects to be processed.
     * @return A flow of processed StockData objects.
     */
    fun process(inputData: Flow<StockData>): Flow<StockData>
}