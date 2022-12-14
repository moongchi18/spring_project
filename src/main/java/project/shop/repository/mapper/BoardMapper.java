package project.shop.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vo.BoardVO;
import vo.RecommendVO;
import vo.ReplyVO;

public interface BoardMapper {
	
	public int insert(BoardVO board);
	public int selectTotalCount(int bType);
	public int selectSearchTotalCount(int bType, String search1, String search2);
	public List<BoardVO> selectList(@Param("bType")int bType, @Param("startRow")int startRow, @Param("count")int count);
	public BoardVO select(int bNum);
	public int updateReviewReadCount(int bNum);
	public int update(BoardVO board);
	public int delete(int bNum);
	public List<BoardVO> selectSearch(int bType, String search1, String search2, int startRow, int count);
	public List<ReplyVO> readReply(int b_num);
	public int writeReply(ReplyVO reply);
	public int selectRecommendCount(int b_num);
	public List<BoardVO> joinRecommendBoard(@Param("bType")int bType,@Param("startRow")int startRow,@Param("count")int count);
	public int recommend(RecommendVO recommend);
	public int deleteRecommend(int b_num,int m_num);
	public int selectRecommend(int b_num,int m_num);
}
