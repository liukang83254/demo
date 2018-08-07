package cn.net.ohf.dao;

import cn.net.ohf.pojo.TestTable;
import cn.net.ohf.pojo.TestTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestTableMapper {
    int countByExample(TestTableExample example);

    int deleteByExample(TestTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestTable record);

    int insertSelective(TestTable record);

    List<TestTable> selectByExample(TestTableExample example);

    TestTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestTable record, @Param("example") TestTableExample example);

    int updateByExample(@Param("record") TestTable record, @Param("example") TestTableExample example);

    int updateByPrimaryKeySelective(TestTable record);

    int updateByPrimaryKey(TestTable record);

	List<TestTable> selectAll();
}