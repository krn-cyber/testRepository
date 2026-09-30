package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RequiredArgsConstructor
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
				//.getBean(WebappApplication.class).exe();
	}
//    private final ToDoService service;
//    //private final ToDoMapper mapper;
//
//	public void exe() {
//		// ★全件検索
//		System.out.println("=== 全件検索 ===");
//		for (ToDo row : service.findAllToDo()) {
//			//for (ToDo row : mapper.selectAll()) {
//			System.out.println(row);
//		}
//
//		// ★1件検索
//		System.out.println("=== 1件検索 ===");
//		System.out.println(service.findByIdToDo(1));
//		//System.out.println(mapper.selectById(1));
//
//		// ★登録
//		// 登録データ作成
//		ToDo todo = new ToDo();
//		todo.setTodo("サービスのテスト");
//		todo.setDetail("ToDo登録サービス");
//		service.insertToDo(todo);
//		//mapper.insert(todo);
//		System.out.println("=== 登録確認 ===");
//		System.out.println(service.findByIdToDo(4));
//		//System.out.println(mapper.selectById(4));
//
//		// ★更新
//		ToDo target = service.findByIdToDo(4);
//		//ToDo target = mapper.selectById(4);
//		target.setTodo("サービスのテスト：更新");
//		target.setDetail("ToDo更新サービス");
//		service.updateToDo(target);
//		//mapper.update(target);
//
//		System.out.println("=== 更新確認 ===");
//		System.out.println(service.findByIdToDo(4));
//		//System.out.println(mapper.selectById(4));
//
//		// ★削除
//		service.deleteToDo(4);
//		//mapper.delete(4);
//		System.out.println("=== 削除確認 ===");
//		for (ToDo row : service.findAllToDo()) {
//			//for (ToDo row : mapper.selectAll()) {	
//			System.out.println(row);
//		}
//	}
}