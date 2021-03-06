package cn.gezhi.service;

import cn.gezhi.po.Position;
import cn.gezhi.po.PositionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int countByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int deleteByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int deleteByPrimaryKey(Integer positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int insert(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int insertSelective(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    List<Position> selectByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    Position selectByPrimaryKey(Integer positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByPrimaryKeySelective(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByPrimaryKey(Position record);
}
