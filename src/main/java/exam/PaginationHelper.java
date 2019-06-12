package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// TODO: 完成这个类

public class PaginationHelper<I> {
	
    /**
     * 构造函数包含
     * 1）数组collection，表示需要分页的所有元素
     * 2）数字itemsPerPage，表示每页的元素个数
     */
	private int itemCount;
	private int pageCount;
	private int lastPageItem;
	private int itemsPerPage;

    
	public PaginationHelper(List<I> collection, int itemsPerPage) {
   
    	this.itemCount = collection.size();
        this.pageCount = collection.size() / itemsPerPage + 1;
        this.lastPageItem = collection.size() % itemsPerPage ;
        this.itemsPerPage = itemsPerPage;
        
    }

    /**
     * 返回collection中所有元素的个数
     */
    public int itemCount() {
    	return itemCount;
    }

    /**
     * 返回页数
     */
    public int pageCount() {
    	 return pageCount;
    }

    /**
     * 返回当前页pageIndex中所包含的元素个数
     * pageIndex从0开始计数
     * 如果pageIndex为非法值则返回-1
     */
    public int pageItemCount(int pageIndex) {
    	if(pageIndex < 0 || pageIndex >= pageCount)
            return -1;
        else if (pageIndex == pageCount -1 )
            return lastPageItem;
        else
            return itemsPerPage;
    }

    /**
     * 返回第itemIndex个元素所在的页数
     * pageIndex从0开始计数
     * 如果itemIndex为非法值则返回-1
     */
    public int pageIndex(int itemIndex) {
    	if(itemIndex > itemCount || itemIndex < 0)
            return -1;
        else
            return itemIndex / itemsPerPage ;
    }
}