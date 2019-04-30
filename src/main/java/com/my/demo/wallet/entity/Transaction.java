package com.my.demo.wallet.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.user_id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.coin_id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private String coinId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.fee
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private BigDecimal fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.amount
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.address_from
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private String addressFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.address_to
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private String addressTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.txid
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private String txid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.confirmations
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private Integer confirmations;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.type
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.status
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.create_time
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wallet_transaction.modify_time
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.id
     *
     * @return the value of wallet_transaction.id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.id
     *
     * @param id the value for wallet_transaction.id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.user_id
     *
     * @return the value of wallet_transaction.user_id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.user_id
     *
     * @param userId the value for wallet_transaction.user_id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.coin_id
     *
     * @return the value of wallet_transaction.coin_id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public String getCoinId() {
        return coinId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.coin_id
     *
     * @param coinId the value for wallet_transaction.coin_id
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setCoinId(String coinId) {
        this.coinId = coinId == null ? null : coinId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.fee
     *
     * @return the value of wallet_transaction.fee
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.fee
     *
     * @param fee the value for wallet_transaction.fee
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.amount
     *
     * @return the value of wallet_transaction.amount
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.amount
     *
     * @param amount the value for wallet_transaction.amount
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.address_from
     *
     * @return the value of wallet_transaction.address_from
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public String getAddressFrom() {
        return addressFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.address_from
     *
     * @param addressFrom the value for wallet_transaction.address_from
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom == null ? null : addressFrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.address_to
     *
     * @return the value of wallet_transaction.address_to
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public String getAddressTo() {
        return addressTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.address_to
     *
     * @param addressTo the value for wallet_transaction.address_to
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo == null ? null : addressTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.txid
     *
     * @return the value of wallet_transaction.txid
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public String getTxid() {
        return txid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.txid
     *
     * @param txid the value for wallet_transaction.txid
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setTxid(String txid) {
        this.txid = txid == null ? null : txid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.confirmations
     *
     * @return the value of wallet_transaction.confirmations
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public Integer getConfirmations() {
        return confirmations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.confirmations
     *
     * @param confirmations the value for wallet_transaction.confirmations
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.type
     *
     * @return the value of wallet_transaction.type
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.type
     *
     * @param type the value for wallet_transaction.type
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.status
     *
     * @return the value of wallet_transaction.status
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.status
     *
     * @param status the value for wallet_transaction.status
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.create_time
     *
     * @return the value of wallet_transaction.create_time
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.create_time
     *
     * @param createTime the value for wallet_transaction.create_time
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wallet_transaction.modify_time
     *
     * @return the value of wallet_transaction.modify_time
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wallet_transaction.modify_time
     *
     * @param modifyTime the value for wallet_transaction.modify_time
     *
     * @mbg.generated Wed Apr 24 17:11:50 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}