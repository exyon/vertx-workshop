package io.vertx.workshop.portfolio;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.serviceproxy.ProxyHelper;


/**
 * A service managing a portfolio.
 * <p>
 * This service is an event bus service (a.k.a service proxies, or async RPC). The client and server are generated at
 * compile time.
 * <p>
 * All method are asynchronous and so ends with a {@link Handler} parameter.
 */
@VertxGen
@ProxyGen
public interface PortfolioService {

  /**
   * The address on which the service is published.
   */
  String ADDRESS = "service.portfolio";

  /**
   * The address on which the successful action are sent.
   */
  String EVENT_ADDRESS = "portfolio";


  void getPortfolio(Handler<AsyncResult<Portfolio>> resultHandler);


  void buy(int amount, JsonObject quote, Handler<AsyncResult<Portfolio>> resultHandler);


  void sell(int amount, JsonObject quote, Handler<AsyncResult<Portfolio>> resultHandler);


  void evaluate(Handler<AsyncResult<Double>> resultHandler);

}
