package com.quiz.lesson02.BO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;

@Service //Spring bean
public class StoreBO {
	
	@Autowired // Dependency Injection
	private StoreMapper storeMapper; // 아랫단계 객체 /왜 new를 안하냐? > class가 아닌 interface라 new를 하지 못한다.
	
	// input: X (컨트롤러가 BO에게 모든 걸 다 달라고 하는 상황)
	// output: controller 에게 넘겨줄 List<Store>
	public List<Store> getStoreList() {
		List<Store> storeList = storeMapper.selectStoreList();
		return storeList; // controller에 넘겨줌
//		return storeMapper.selectStoreList();
	}
}
