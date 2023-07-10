//230705 09, 0706 09, 0707 08
package com.study.security_SSH.service.notice;

import java.util.List;

import com.study.security_SSH.web.dto.notice.AddNoticeReqDto;
import com.study.security_SSH.web.dto.notice.GetNoticeListRespDto;
import com.study.security_SSH.web.dto.notice.GetNoticeRespDto;

public interface NoticeService {
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception;
	
	public GetNoticeRespDto getNotice(String flag, int noticeCode) throws Exception;
	
	public List<GetNoticeListRespDto> getNoticeList(int page, String searchFlag, String searchValue) throws Exception;
}
