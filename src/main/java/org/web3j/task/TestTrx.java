package org.web3j.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.utils.Environment;

import java.io.IOException;

/**
 * 基于ERC20的token代币相关
 */
public class TestTrx {

  private static final Logger logger = LoggerFactory.getLogger(TestTrx.class);
  private static final Web3j web3j = Web3j.build(new HttpService(Environment.RPC_URL));
  private static final String fromAddress = "0x38AabFFc1239788232025B37610Dd0FE7EB3aD73";
  private static final String toAddress = "0x6Db645A875e9d475d824142cA1532C245930be94";

  public static void main(String[] args) throws IOException {
//    BigInteger currentBlockNumber = BigInteger.valueOf(268943L);
//    EthBlock ethBlock = web3j.ethGetBlockByNumber(DefaultBlockParameter.valueOf(currentBlockNumber), true).send();
//    List<EthBlock.TransactionResult> transactionResultList = ethBlock.getResult().getTransactions();
//    for (EthBlock.TransactionResult transaction : transactionResultList) {
//      logger.info(transaction.toString());
//    }
    System.out.println("########## buyToken start ##########");
    System.out.println("########## buyToken end   ##########");
  }

}
