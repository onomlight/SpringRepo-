package com.korea.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.korea.domain.BoardVO;
import com.korea.domain.Criteria;

public interface BoardMapper {
	
	@Select("select * from tbl_board1 where bno>0  order by bno desc")
	public List<BoardVO> getList() ;
	
	public List<BoardVO> getListXML();
	
	public void insertXML(BoardVO board);

	
	@Insert
	("insert into tbl_board1(bno,title,content,writer) values(seq_board.nextval, #{title},#{content},#{writer})")
	public void insert(BoardVO board);
	

	@SelectKey
	(
			statement="select seq_board.currval from dual",
			keyProperty="bno",
			before=false,
			resultType=long.class
	)
	@Insert
	("insert into tbl_board1(bno,title,content,writer) values(seq_board.nextval, #{title},#{content},#{writer})")
	public long insertSelectKey(BoardVO board);
	//�߰�
	public long insertSelectKeyXML(BoardVO board);
	
	
	@Select("select * from tbl_board1 where bno=#{bno}")
	public BoardVO read(Long bno);
	
	public BoardVO readXML(Long bno);
	
	@Delete("delete from tbl_board1 where bno=#{bno}")
	public int delete (Long bno);
	
	public int deleteXML(Long bno);
	
	@Update
	("update tbl_board1 set title=#{title},content=#{content},writer=#{writer},updateDate=sysdate where bno=#{bno}")
	public int update(BoardVO board);
	public int updateXML(BoardVO board);
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	//�߰��ѳ���
	@Select("select count(*) from tbl_board1 where bno>0")
	public int getTotalCount(Criteria cri);
	

	
	public List<BoardVO> test(String content);
}
