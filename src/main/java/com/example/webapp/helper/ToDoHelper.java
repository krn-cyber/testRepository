package com.example.webapp.helper;

import com.example.webapp.entity.ToDo;
import com.example.webapp.form.ToDoForm;

/**
 * ヘルパー
 */
public class ToDoHelper {
/**
 * ToDo:ヘルパー
 */
	public static ToDo convertToDo(ToDoForm form) {
		ToDo todo = new ToDo();
		todo.setId(form.getId());
		todo.setTodo(form.getTodo());
		todo.setDetail(form.getDetail());
		return todo;
	}
	
	/**
	 * ToDoFormへの変更
	 */
	
	public static ToDoForm convertToDoForm(ToDo todo) {
		ToDoForm form = new ToDoForm();
		form.setId(todo.getId());
		form.setTodo(todo.getTodo());
		form.setDetail(todo.getDetail());
		// 更新画面設定
		form.setIsNew(false);
		return form;
	}
}