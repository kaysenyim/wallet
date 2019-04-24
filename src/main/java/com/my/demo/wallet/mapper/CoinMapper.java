package com.my.demo.wallet.mapper;

import com.my.demo.wallet.entity.Coin;
import com.my.demo.wallet.entity.CoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    long countByExample(CoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int deleteByExample(CoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int insert(Coin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int insertSelective(Coin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    List<Coin> selectByExample(CoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    Coin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") Coin record, @Param("example") CoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int updateByExample(@Param("record") Coin record, @Param("example") CoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int updateByPrimaryKeySelective(Coin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wallet_coin
     *
     * @mbg.generated Wed Apr 24 17:12:42 CST 2019
     */
    int updateByPrimaryKey(Coin record);
}