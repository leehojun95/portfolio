package com.dogmall.demo.admin.board;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {

	//b_num, b_tilte, b_content, b_img, b_regdate, b_updatedate
	
	private Integer b_num;
	private String  b_tilte;
	private String  b_content;
	private String  b_img;
	private Date	b_regdate;
	private String 	b_up_folder;
}
