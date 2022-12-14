package project.shop.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vo.ItemOptionVO;
import vo.ItemTypeVO;
import vo.ItemVO;


public interface ItemMapper {
	
	public int selectAllItemCount();
	public int selectTypeCount(int iType);
	public int selectBrandCount(String iBrand);
	public List<ItemVO> selectAll(@Param("startRow")int startRow, @Param("count")int count);
	public List<ItemVO> selectType(@Param("iType")int iType, @Param("startRow")int startRow, @Param("count")int count);
	public List<ItemVO> selectBrand(@Param("iBrand")String iBrand, @Param("startRow")int startRow, @Param("count")int count);
	
	public ItemVO selectItem(int iNum);
	public ItemVO selectItemById(String iRegister);
	public ItemOptionVO selectItemOption(int iNum);
	
	public int insertItem(ItemVO item);
	public int insertItemOption(ItemOptionVO io);

	public int updateItemReadCount(int iNum);
	public int updateItem(ItemVO item);
	public int updateItemOption(ItemOptionVO io);
	
	public int deleteItem(int iNum);
	
	public List<ItemTypeVO> selectAllTypeString();
	public ItemTypeVO selectTypeString(int iType);
	public int selectSearchCount(String search1, String search2);
	public List<ItemVO> selectSearch(String search1, String search2, int startRow, int count);
//	public List<ItemVO> selectSearch(int iType, String search1, String search2, int startRow, int count);
	public ItemVO selectReadCount();
}
