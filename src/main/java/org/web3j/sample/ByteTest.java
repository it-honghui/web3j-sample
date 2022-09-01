package org.web3j.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.utils.Numeric;

/**
 * @author honghui 2022/6/20
 */
public class ByteTest {

  private static final Logger logger = LoggerFactory.getLogger(ByteTest.class);

  public static void main(String[] args) {
    byte[] orderByte = new byte[]{70, -51, 100, 42, 29, -96, 102, -68, -25, 3, -87, -110, -55, 18, -56, 60, 86, -7, -35, -32, -102, -114, -83, -75, 41, 11, -70, -41, -81, -68, 44, 78};
    logger.info(Numeric.toHexString(orderByte));
    logger.info(Numeric.toHexStringNoPrefix(orderByte));
    logger.info(Numeric.toBigInt(orderByte).toString());
  }
}
