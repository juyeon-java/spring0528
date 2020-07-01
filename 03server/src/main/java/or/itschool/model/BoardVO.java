package or.itschool.model;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int boardNo;	//글번호 board_no
	private String title;	//글제목
	private String content;	//글내용
	private String writer;	//작성자
	private Date regDate;	//작성일
	private int viewCnt;	//조회수
	
}
