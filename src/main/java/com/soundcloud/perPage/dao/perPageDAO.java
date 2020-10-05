package com.soundcloud.perPage.dao;

import java.util.List;

import com.soundcloud.perPage.domain.perPageVO;

public interface perPageDAO {

	public List<perPageVO> getsongs() throws Exception;

	public int insertsong(perPageVO pagevo) throws Exception;

}
