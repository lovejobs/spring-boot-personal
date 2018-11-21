package com.lovejobs.springboot.drools.model;

import com.lovejobs.springboot.drools.enums.PayOrderStatus;
import lombok.Data;
import java.util.Date;

@Data
public class PayOrder {

    private Long id;// 主键ID.

    private String payOrderNo;    //支付订单号

    private String merchantTxnId;

    private String userId;

    private String countryCode;

    private String merchantId;

    private String payAmount;

    private String currency;

    private PayOrderStatus status;

    private String paytypeCode;

    private String tradeOrderNo;

    private String paymentType;

    private String transactionType;

    private String accountId;

    private String accountName;

    private String accountNumber;
    private String payeeUpi;

    private String payeeName;

    private String payerUpi;

    private String payerName;

    private String payChannelOrderNo;

    private String payChannelCode;

    private String note;
    private String paySource;
    private String txnNote;

    private String payeeIfsc;

    private String payeeAadhaarNumber;

    private String refundNo;

    private String field1;

    private String field2;

    private String field3;

    private Date expiryTime;

    private Date transactionTime;

    private Date createTime;

    private Date updateTime = new Date();

    private String payerBankName;

    private String payerAccountNumber;

    private String npciOrderNo;
}
