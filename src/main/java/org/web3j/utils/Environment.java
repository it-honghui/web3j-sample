package org.web3j.utils;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.tx.gas.StaticGasProvider;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 运行配置项
 */
public class Environment {

  /**
   * public static String RPC_URL = "http://localhost:8545";
   * public static String RPC_URL = "https://ropsten.infura.io/v3/xxxx";
   * public static String RPC_URL = "https://bsc-dataseed1.binance.org";
   * public static String RPC_URL = "https://data-seed-prebsc-1-s1.binance.org:8545";
   */
  public static String RPC_URL = "https://data-seed-prebsc-1-s1.binance.org:8545";
  public static String PRIVATE_KEY = "xxx";
  public static BigInteger DEFAULT_GAS_PRICE = Convert.toWei(BigDecimal.valueOf(10), Convert.Unit.GWEI).toBigInteger();
  public static BigInteger DEFAULT_GAS_LIMIT = BigInteger.valueOf(2100000);
  public static StaticGasProvider STATIC_GAS_PROVIDER = new StaticGasProvider(DEFAULT_GAS_PRICE, DEFAULT_GAS_LIMIT);
  public static Credentials CREDENTIALS = Credentials.create(ECKeyPair.create(new BigInteger(PRIVATE_KEY, 16)));
  public static final String BINANCE_API_KEY = "xxx";
  public static final String BINANCE_SECRET_KEY = "xxx";
  public static final String BINANCE_BASE_URL = "https://api.binance.com";
}
