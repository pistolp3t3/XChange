/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.service.trade.polling;

import com.xeiam.xchange.dto.trade.LimitOrder;
import com.xeiam.xchange.dto.trade.MarketOrder;
import com.xeiam.xchange.dto.trade.OpenOrders;

/**
 * <p>
 * Interface to provide the following to {@link com.xeiam.xchange.Exchange}:
 * </p>
 * <ul>
 * <li>Retrieve the user's account info on the exchange</li>
 * <li>Retrieve the user's open orders on the exchange</li>
 * <li>Place market orders on the exchange</li>
 * <li>Place limit orders on the exchange</li>
 * </ul>
 * <p>
 * The implementation of this service is expected to be based on a client polling mechanism of some kind
 * </p>
 */
public interface PollingTradeService {

  /**
   * Gets the open orders
   * 
   * @return the open orders, null if some sort of error occurred. Implementors should log the error.
   */
  public OpenOrders getOpenOrders();

  /**
   * Place a limit order
   * 
   * @param marketOrder
   * @return the order ID
   */
  public String placeMarketOrder(MarketOrder marketOrder);

  /**
   * Place a limit order
   * 
   * @param limitOrder
   * @return the order ID
   */
  public String placeLimitOrder(LimitOrder limitOrder);

  /**
   * cancels order with matching orderId
   * 
   * @param orderId
   * @return true if order was successfully cancelled, false otherwise.
   */
  public boolean cancelOrder(String orderId);

}
