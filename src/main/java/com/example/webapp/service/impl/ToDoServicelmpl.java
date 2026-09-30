package com.example.webapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.webapp.entity.ToDo;
import com.example.webapp.repository.ToDoMapper;
import com.example.webapp.service.ToDoService;

import lombok.RequiredArgsConstructor;


/**
 * Todo:サービス実装クラス
 */
@Service
@Transactional
@RequiredArgsConstructor
public class ToDoServicelmpl implements ToDoService {

	/** DI */
	private final ToDoMapper ToDoMapper;
	
	@Override
	public List<ToDo> findAllToDo() {
		return ToDoMapper.selectAll();
	}
	@Override
	public ToDo findByIdToDo(Integer id) {
		return ToDoMapper.selectById(id);
	}
	@Override
	public void insertToDo(ToDo toDo) {
		ToDoMapper.insert(toDo);
	}
	@Override
	public void updateToDo(ToDo toDo) {
		ToDoMapper.update(toDo);
	}
	@Override
	public void deleteToDo(Integer id) {
		ToDoMapper.delete(id);
	}
}