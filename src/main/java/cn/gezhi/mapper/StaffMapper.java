package cn.gezhi.mapper;

import cn.gezhi.po.Staff;
import cn.gezhi.po.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int countByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int deleteByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int deleteByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int insert(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int insertSelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    List<Staff> selectByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    Staff selectByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByPrimaryKeySelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbggenerated Thu Aug 16 11:44:26 CST 2018
     */
    int updateByPrimaryKey(Staff record);
}