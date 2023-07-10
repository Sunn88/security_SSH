//230707 07
package com.study.security_SSH.web.dto.notice;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GetNoticeListRespDto {
	private int noticeCode;
	private String noticeTitle;
	private String userId;
	private String createDate;
	private int noticeCount;
	private int totalNoticeCount;
}
