package or.itschool.mapper;

import java.util.List;

import or.itschool.model.BoardVO;

public interface BoardMapper {
	//기능을 상세화하기 위한 인터페이스 설계
    //게시판 기능을 상세한다.
    
    
    //1. 게시글 등록 기능 메서드 - 게시글을 하나 가져와서 등록한다.
    public void insert(BoardVO article) throws Exception;
    
  //2. 하나의 게시글 조회 기능 메서드 - 하나를 조회하려면 프라이머리키(글번호)를 가져와 전체 정보를 반환한다. 
    public BoardVO getArticle(int boardNo) throws Exception;

	public void update(BoardVO article) throws Exception;

	public void delete(int boardNo) throws Exception;

	public List<BoardVO> getAllArticles() throws Exception;
}
